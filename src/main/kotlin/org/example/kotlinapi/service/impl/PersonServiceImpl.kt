package org.example.kotlinapi.service.impl

import org.example.kotlinapi.dto.PersonRequest
import org.example.kotlinapi.dto.PersonResponse
import org.example.kotlinapi.mapper.PersonMapper
import org.example.kotlinapi.model.Person
import org.example.kotlinapi.repository.PersonRepository
import org.example.kotlinapi.service.PersonService
import org.springframework.stereotype.Service


@Service
class PersonServiceImpl(private var repository: PersonRepository, private var mapper: PersonMapper) : PersonService {


    override fun findById(personId: Long): PersonResponse {
        val person = repository.findById(personId).get()
        return mapper.fromEntityToResponse(person)
    }

    override fun deleteById(personId: Long) {
        val person = repository.findById(personId)
        repository.delete(person.get())
    }

    override fun save(person: Person): PersonResponse {
        return mapper.fromEntityToResponse(repository.save(person))
    }


}
