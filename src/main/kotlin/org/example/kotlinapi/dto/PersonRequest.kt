package org.example.kotlinapi.dto

import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
class PersonRequest(
    var firstName: String,
    var lastName: String,
    var age: Int,
    var address: String
) {
}