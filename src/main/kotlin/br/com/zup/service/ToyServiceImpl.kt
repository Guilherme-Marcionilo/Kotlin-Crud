package br.com.zup.service

import br.com.zup.model.Toy
import br.com.zup.repository.ToyRepository
import org.slf4j.LoggerFactory
import java.util.*
import javax.inject.Singleton

@Singleton
class ToyServiceImpl(private val toyRepository: ToyRepository) : ToyService {

    private val log = LoggerFactory.getLogger(this::class.java)

    override fun createToy(toy: Toy): Toy {
        log.info("Toy Created!")
        return toyRepository.save(toy)
    }

    override fun updateToy(id: Long, name: String): Toy {
        val possibleToy = toyRepository.findById(id)

        val toy = possibleToy.get()

        toy.name = name
        toyRepository.update(toy)
        return toy
    }

    override fun deleteToyById(id: Long) {
       return toyRepository.deleteById(id)
    }

    override fun getAllToys(name: String): List<Toy> {
        return toyRepository.findAll()
    }

    override fun getToyById(id: Long): Optional<Toy> {
        return toyRepository.findById(id)
    }


}