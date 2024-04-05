package org.example.kotlinapi.service

import org.example.kotlinapi.dto.PersonRequest
import org.example.kotlinapi.dto.PersonResponse
import org.example.kotlinapi.model.Person

interface PersonService {

    fun findById(personId: Long): PersonResponse

    fun deleteById(personId: Long)

    fun save(person: Person): PersonResponse
    fun updatePerson(id: Long, person: Person) : PersonResponse
}