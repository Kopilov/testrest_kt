package ru.bia.test.testrest_kt

/**
 * Example cat POJO for JSONB (un)marshalling as array of primitives.
 *
 * @see MyParamConverter
 * @see MyParamConverterProvider
 */
data class Ints(val iii: Array<Int>) {
    override fun toString(): String {
        return iii.toString()
    }
}
