package br.com.zup
import br.com.zup.core.model.Toy
import br.com.zup.core.port.ToyServicePort
import br.com.zup.database.entity.ToyEntity
import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe
import io.micronaut.test.extensions.kotest.annotation.MicronautTest
import io.mockk.every
import io.mockk.mockk
import java.math.BigDecimal
import java.util.*

@MicronautTest
class ToyServiceTest : AnnotationSpec(){

    private val toyServicePort = mockk<ToyServicePort>()

    private lateinit var toyEntity: ToyEntity
    private lateinit var toy: Toy

    @BeforeEach
    fun setUp() {
        val uuid = UUID.randomUUID()
        toyEntity = ToyEntity(uuid, "Test", BigDecimal.ONE, "test description")
        toy = Toy(uuid, "Test", BigDecimal.ONE, "test description")
    }

    @Test
    fun `should return toy successfully`() {
        every { toyServicePort.create(any()) } answers { toy }
        val result = toyServicePort.create(toy)
        result shouldBe toy
    }
}