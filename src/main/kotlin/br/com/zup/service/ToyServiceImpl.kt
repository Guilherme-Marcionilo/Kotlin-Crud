package br.com.zup.service

import br.com.zup.model.Toy
import br.com.zup.repository.ToyRepository
import org.slf4j.LoggerFactory
import javax.inject.Singleton

@Singleton
class ToyServiceImpl(private val toyRepository: ToyRepository) : ToyService {

    private val log = LoggerFactory.getLogger(this::class.java)

    override fun createToy(toy: Toy): Toy {
        val possibleToy = toyRepository.save(toy)
        log.info("Toy Created!")
        return possibleToy
    }

    override fun deleteToyById(id: Long){

        val possibleToy = toyRepository.findById(id)

        if (possibleToy.isPresent) {
            return toyRepository.deleteById(id)
        }
    }


}