package br.com.zup
import br.com.zup.core.port.ToyServicePort
import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe
import io.micronaut.test.extensions.kotest.annotation.MicronautTest
import io.mockk.every
import io.mockk.mockk
import java.math.BigDecimal
import java.util.*

@MicronautTest
class ToyServiceTest : AnnotationSpec(){

    val toyServicePort = mockk<ToyServicePort>()
}