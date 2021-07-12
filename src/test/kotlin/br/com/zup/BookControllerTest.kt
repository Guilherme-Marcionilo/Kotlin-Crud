//package br.com.zup

//
//@MicronautTest
//internal class BookControllerTest: AnnotationSpec() {

//    @InjectMockKs
//    private val bookRepository = mockk<BookRepository>(relaxed = true)
//
//    @MockK
//    private lateinit var bookRequest: BookRequest
//
//    @BeforeEach
//    fun setUp() {
//        MockKAnnotations.init(this)
//    }
//
//    @Test
//    fun `should create book with success`() {
//        every { bookRequest.toModel() } answers {any(Book.class)}
//
//        val result = bookRequest.toModel()
//
//        result shouldBe bookRequest
//    }



//}