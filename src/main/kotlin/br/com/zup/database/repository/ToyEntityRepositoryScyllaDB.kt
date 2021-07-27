package br.com.zup.database.repository

import br.com.zup.database.entity.ToyEntity
import com.datastax.oss.driver.api.core.CqlSession
import com.datastax.oss.driver.api.core.cql.SimpleStatement
import com.fasterxml.jackson.databind.ObjectMapper
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.util.*
import javax.inject.Singleton

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

    override fun findById(id: UUID): ToyEntity? {
        try {
            val selectResult = cqlSession.execute(
                SimpleStatement
                    .newInstance(
                        "SELECT * FROM toy.Toy WHERE id = ? LIMIT 100",
                        id
                    )
            )
            LOG.info("Toy successfully selected {}", selectResult)

            return selectResult
                .map { toy ->
                    ToyEntity(toy.getUuid("id")!!, toy.getString("name")!!,
                        toy.getBigDecimal("price")!!, toy.getString("description")!!) }.firstOrNull()

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

    override fun delete(id: UUID) {
        cqlSession.execute(
            SimpleStatement
                .newInstance("DELETE from toy.Toy where ID = ?", id)
        )
        LOG.info("Toy Deleted!")
    }

}