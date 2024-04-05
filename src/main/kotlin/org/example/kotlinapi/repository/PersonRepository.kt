package org.example.kotlinapi.repository

import org.example.kotlinapi.model.Person
import org.springframework.data.jpa.repository.JpaRepository

interface PersonRepository : JpaRepository<Person, Long> {
}