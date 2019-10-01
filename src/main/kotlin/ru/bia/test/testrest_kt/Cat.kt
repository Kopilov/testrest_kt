package ru.bia.test.testrest_kt

import javax.json.bind.annotation.JsonbProperty
import javax.json.bind.annotation.JsonbPropertyOrder

/**
 * Example cat POJO for JSONB (un)marshalling.
 *
 * @author Adam Lindenthal (adam.lindenthal at oracle.com)
 *
 * Autotranslated to Kotlin
 */

@JsonbPropertyOrder("color", "sort", "name", "domesticated")
class Cat {
    @JsonbProperty("catName")
    var name: String? = null
    var sort: String? = null
    var color: String? = null
    var domesticated: Boolean = false

    // json-b needs the default constructor
    constructor() : super() {}

    constructor(name: String, sort: String, color: String, domesticated: Boolean) {
        this.name = name
        this.sort = sort
        this.color = color
        this.domesticated = domesticated
    }
}
