package org.example.kotlinapi.controller.repository

import org.example.kotlinapi.controller.model.Person
import org.springframework.data.jpa.repository.JpaRepository

interface PersonRepository : JpaRepository<Person, Long> {
}