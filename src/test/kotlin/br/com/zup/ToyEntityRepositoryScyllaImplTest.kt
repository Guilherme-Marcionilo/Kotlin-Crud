package br.com.zup

import br.com.zup.database.entity.ToyEntity
import br.com.zup.database.repository.ToyEntityRepositoryScyllaImpl
import com.datastax.oss.driver.api.core.CqlSession
import com.datastax.oss.driver.api.core.cql.SimpleStatement
import io.kotest.core.spec.style.AnnotationSpec
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.RelaxedMockK
import io.mockk.junit5.MockKExtension
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import java.math.BigDecimal
import java.util.*
@ExtendWith(MockKExtension::class)
class ToyEntityRepositoryScyllaImplTest {

    @InjectMockKs
    lateinit var toyEntityRepositoryScyllaImpl: ToyEntityRepositoryScyllaImpl

    @RelaxedMockK
    lateinit var cqlSession: CqlSession
    lateinit var toyEntity: ToyEntity

    @BeforeEach
    fun setUp() {
        MockKAnnotations.init(this)
        toyEntity = ToyEntity(UUID.fromString("66584b2c-4b48-4785-a305-66b89d4b97cf"),
            "Test Name", BigDecimal.ONE, "Desc")
    }

    @Test
    fun `should not return sucess when request find toy by id`() {
        every {cqlSession.execute(
            SimpleStatement
                .newInstance(
                    "SELECT * FROM toy.Toy WHERE id = ? LIMIT 100",
                    UUID.fromString("8a4a6027-5b65-4339-66ba-4e63b5b1f34b")
                )
        ).map { toy ->
            ToyEntity(toy.getUuid("id")!!, toy.getString("name")!!,
                toy.getBigDecimal("price")!!, toy.getString("description")!!)
        }.firstOrNull()} returns (toyEntity)

        val testResult = toyEntityRepositoryScyllaImpl.findById(toyEntity.id!!)
        Assertions.assertNotEquals(toyEntity,testResult)
    }

    @Test
    fun `should return sucess when request find all toy`() {
        val selectResult = cqlSession.execute(
            SimpleStatement
                .newInstance(
                    "SELECT * FROM product.Product LIMIT 10000"
                )
        )
        val listOfProductEntity: List<ToyEntity> = selectResult
            .map { toy ->
                ToyEntity(toy.getUuid("id")!!, toy.getString("name")!!,
                    toy.getBigDecimal("price")!!, toy.getString("description")!!)
            }.toList()

        val testResult = toyEntityRepositoryScyllaImpl.getAll()
        Assertions.assertEquals(listOfProductEntity, testResult)
    }

}