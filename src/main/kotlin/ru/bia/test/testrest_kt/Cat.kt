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
    private var name: String? = null
    private var sort: String? = null
    private var color: String? = null
    private var domesticated: Boolean = false

    // json-b needs the default constructor
    constructor() : super() {}

    constructor(name: String, sort: String, color: String, domesticated: Boolean) {
        this.name = name
        this.sort = sort
        this.color = color
        this.domesticated = domesticated
    }

    fun getName(): String? {
        return name
    }

    fun setName(name: String): Cat {
        this.name = name
        return this
    }

    @JsonbProperty("catSort")
    fun getSort(): String? {
        return sort
    }

    fun setSort(sort: String): Cat {
        this.sort = sort
        return this
    }

    fun getColor(): String? {
        return color
    }

    fun setColor(color: String): Cat {
        this.color = color
        return this
    }

    fun isDomesticated(): Boolean {
        return domesticated
    }

    fun setDomesticated(domesticated: Boolean): Cat {
        this.domesticated = domesticated
        return this
    }
}
