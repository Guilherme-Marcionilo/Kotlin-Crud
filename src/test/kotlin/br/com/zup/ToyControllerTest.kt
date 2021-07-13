//package br.com.zup
//
//import br.com.zup.model.Toy
//import br.com.zup.repository.ToyRepository
//import br.com.zup.model.ToyDto
//import io.kotest.core.spec.style.AnnotationSpec
//import io.micronaut.test.extensions.kotest.annotation.MicronautTest
//import io.mockk.MockKAnnotations
//import io.mockk.impl.annotations.InjectMockKs
//import io.mockk.impl.annotations.MockK
//import io.mockk.mockk
//
//
//@MicronautTest
//class ToyControllerTest: AnnotationSpec() {
//
//    @InjectMockKs
//    private val toyRepository = mockk<ToyRepository>(relaxed = true)
//
//    @MockK
//    private lateinit var toyDto: ToyDto
//    @MockK
//    private lateinit var toy: Toy
//
//    @BeforeEach
//    fun setUp() {
//        MockKAnnotations.init(this)
//        toyDto = ToyDto("Brinquedo", 12.90)
//    }
//
//    @Test
//    fun `should return toy with success`() {
//
//        toy = Toy("Brinquedo", 12.90)
//
//        val result = toyDto.toModel()
//
//        result.id shouldBe toy.id
//    }
//}