package org.example.kotlinapi.mapper

import org.example.kotlinapi.dto.PersonResponse
import org.example.kotlinapi.model.Person
import org.modelmapper.ModelMapper
import org.springframework.stereotype.Service

@Service
class PersonMapper(private val mapper: ModelMapper) {

    fun fromEntityToResponse(entity: Person): PersonResponse {
        return PersonResponse(entity.id, entity.firstName, entity.lastName, entity.age, entity.address)
    }

}