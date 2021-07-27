package br.com.zup.database.repository

import br.com.zup.database.entity.ToyEntity
import javax.inject.Singleton
import com.datastax.oss.driver.api.core.CqlSession
import com.datastax.oss.driver.api.core.cql.SimpleStatement
import com.fasterxml.jackson.databind.ObjectMapper
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.util.*


@Singleton
class ToyEntityRepositoryScyllaDB(private val cqlSession: CqlSession) : ToyEntityRepository {

    private val LOG: Logger = LoggerFactory.getLogger(this::class.java)

    override fun save(toyEntity: ToyEntity): ToyEntity {
        toyEntity.id = UUID.randomUUID()
        cqlSession.execute(
            SimpleStatement
                .newInstance("INSERT INTO toy.Toy(id, name, price, description) VALUES (?,?,?,?)",
                toyEntity.id,
                toyEntity.name,
                toyEntity.price,
                toyEntity.description,
                )
        )
        LOG.info("Toy Registered: {}", toyEntity.id)

        return toyEntity
    }

    override fun getAll(): List<ToyEntity> {
        val selectResult = cqlSession.execute(
            SimpleStatement
                .newInstance(
                    "SELECT * FROM toy.Toy LIMIT 100"
                )
        )
        LOG.info("Toy successfully selected")
        return selectResult
            .map { toy ->
                ToyEntity(toy.getUuid("id")!!, toy.getString("name")!!,
                    toy.getBigDecimal("price")!!, toy.getString("description")!!)
            }.toList()
    }

    override fun findById(id: UUID): Optional<ToyEntity> {
        try {
            val selectResult = cqlSession.execute(
                SimpleStatement
                    .newInstance(
                        "SELECT * FROM toy.toy WHERE id = ? LIMIT 100",
                        id
                    )
            )
            LOG.info("Toy successfully selected")
            val result = selectResult.one()?.getString(0)

            if (result.isNullOrEmpty()) {
                LOG.error("Sorry! No products found with id", id)
                return Optional.empty()
            }

            return Optional.of(ObjectMapper().readValue(result, ToyEntity::class.java))

        } catch (error: IllegalStateException) {
            throw IllegalStateException()
        }
    }

    override fun update(toyEntity: ToyEntity): ToyEntity {
        cqlSession.execute(
            SimpleStatement
                .newInstance(
                    "UPDATE toy.Toy SET name = ?, price = ?, description = ? WHERE id = ?",
                    toyEntity.name,
                    toyEntity.price,
                    toyEntity.description,
                    toyEntity.id
                )
        )
        LOG.info("Toy Updated!")

        return toyEntity
    }

    override fun delete(toyEntity: ToyEntity) {
        cqlSession.execute(
            SimpleStatement
                .newInstance("DELETE from toy.Toy where ID = ?", toyEntity.id)
        )
        LOG.info("Toy Deleted!")
    }

}