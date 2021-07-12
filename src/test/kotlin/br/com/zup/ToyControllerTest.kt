package br.com.zup

import br.com.zup.pub.Toy
import br.com.zup.pub.ToyRepository
import br.com.zup.pub.ToyRequest
import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe
import io.micronaut.test.extensions.kotest.annotation.MicronautTest
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.mockk


@MicronautTest
class ToyControllerTest: AnnotationSpec() {

    @InjectMockKs
    private val toyRepository = mockk<ToyRepository>(relaxed = true)

    @MockK
    private lateinit var toyRequest: ToyRequest
    @MockK
    private lateinit var toy: Toy

    @BeforeEach
    fun setUp() {
        MockKAnnotations.init(this)
        toyRequest = ToyRequest("Brinquedo", 12.90)
    }

    @Test
    fun `should return toy with success`() {
        every { toyRequest.toModel() } returns toy

        val result = toyRequest.toModel()

        result shouldBe toyRequest
    }

    @Test
    fun `should create toy with success`() {
        every { toyRepository.save(any()) } returns toy

        val result = toy

        result shouldBe toyRequest
    }

}