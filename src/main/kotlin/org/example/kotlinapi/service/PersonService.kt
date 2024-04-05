package org.example.kotlinapi.service

import org.example.kotlinapi.model.Person

interface PersonService {

    fun findById(personId: Long): Person

    fun deleteById(personId: Long)

    fun save(person: Person): Person
}