package org.example.kotlinapi.dto



data class PersonResponse(
    var id: Long,
    var firstName: String,
    var lastName: String,
    var age: Int,
    var address: String
)