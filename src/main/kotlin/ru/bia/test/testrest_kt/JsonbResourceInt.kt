package ru.bia.test.testrest_kt

import java.util.ArrayList
import javax.ws.rs.*
import javax.ws.rs.core.Response

/**
 * An example resource utilizing JSONB with array of primitives.
 *
 */
@Path("ints")
@Consumes("application/json")
class JsonbResourceInt {

    val all: List<Int>
        @Path("all")
        @GET
        @Produces("application/json")
        get() = ints

    @Path("addAll")
    @POST
    fun createMultiple(addedInts: List<Int>): Response {
        ints.addAll(addedInts)
        return Response.ok().build()
    }

    companion object {

        private val ints = ArrayList<Int>()

        init {
            ints.add(1)
            ints.add(2)
            ints.add(3)
            ints.add(4)
        }
    }

}

