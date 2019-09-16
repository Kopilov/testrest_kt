package ru.bia.test.testrest_kt

import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.databind.ObjectMapper
import java.io.IOException
import javax.ws.rs.ext.ParamConverter

class MyParamConverter : ParamConverter<Ints> {

    override fun fromString(s: String): Ints? {

        try {
            val iii = ObjectMapper().readerFor(Array<Int>::class.java).readValue<Array<Int>>(s)
            val ints = Ints(iii)

            return ints
        } catch (e: IOException) {
            e.printStackTrace()
            return null
        }

    }

    override fun toString(mo: Ints): String? {
        try {
            return ObjectMapper().writerFor(Array<Int>::class.java).writeValueAsString(mo.iii)
        } catch (e: JsonProcessingException) {
            e.printStackTrace()
            return null
        }

    }

}
