package org.example.kotlinapi.service.impl

import org.example.kotlinapi.model.Person
import org.example.kotlinapi.repository.PersonRepository
import org.example.kotlinapi.service.PersonService
import org.springframework.stereotype.Service


@Service
class PersonServiceImpl(private var repository: PersonRepository) : PersonService {


    override fun findById(personId: Long): Person {
        return repository.findById(personId).get()
    }

    override fun deleteById(personId: Long) {
        val person = repository.findById(personId)
        repository.delete(person.get())
    }

    override fun save(person: Person): Person {
        return repository.save(person)
    }


}
