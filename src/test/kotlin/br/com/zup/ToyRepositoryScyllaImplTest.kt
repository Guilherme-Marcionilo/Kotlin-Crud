package br.com.zup

import br.com.zup.database.entity.ToyEntity
import br.com.zup.database.repository.ToyEntityRepositoryScyllaImpl
import com.datastax.oss.driver.api.core.CqlSession
import com.datastax.oss.driver.api.core.cql.SimpleStatement
import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe
import io.micronaut.test.extensions.kotest.annotation.MicronautTest
import io.mockk.mockk
import java.math.BigDecimal
import java.util.*

@MicronautTest
class ToyRepositoryScyllaImplTest : AnnotationSpec() {

    private val cqlSession = mockk<CqlSession>(relaxed = true)
    private val toyRepository = ToyEntityRepositoryScyllaImpl(cqlSession)
    private lateinit var toyEntity: ToyEntity

    @BeforeEach
    fun setUp() {
        toyEntity = ToyEntity(UUID.randomUUID(), "Test", BigDecimal.ONE, "Test Desc")
    }

    @Test
    fun `should return sucess when save toy Entity`() {
        cqlSession.execute(
            SimpleStatement
                .newInstance(
                    "INSERT INTO toy.Toy(id,name, price, description) VALUES (?,?,?,?)",
                    UUID.randomUUID(),
                    toyEntity.name,
                    toyEntity.price,
                    toyEntity.description
                )
        )
        val result = toyRepository.save(toyEntity)
        result shouldBe toyEntity
    }

    @Test
    fun `should delete a toy by ID `() {
        val id = UUID.randomUUID()

        cqlSession.execute(
            SimpleStatement
                .newInstance("DELETE from toy.Toy where ID = ?", id)
        )
        val result = toyRepository.delete(toyEntity.id!!)

        result shouldBe Unit
    }
}