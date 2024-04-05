package org.example.kotlinapi.model

import jakarta.persistence.*

@Entity
@Table(name = "person")
data class Person(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,
    var firstName: String,
    var lastName: String,
    var age: Int,
    var address: String
) {
}