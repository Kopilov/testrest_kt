package ru.bia.test.testrest_kt

import java.io.IOException
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.QueryParam

@Path("webresourceaccess")
class Rest {

    val string: String
        @GET
        @Produces("text/html")
        get() = "hello kotlin rest\n"

    val csv: String
        @GET
        @Produces("text/csv")
        get() = "1,2,3,a,b,c\n"

    @GET
    @Produces("application/json")
    @Throws(IOException::class)
    fun getJson(
            @QueryParam("ag") ag: Ints
    ): Array<Int> {

        //Jsonb jsonb = JsonbBuilder.create();
        //
        System.out.println(ag.toString())

        for (i in ag.iii) {
            println(i.toString())
        }
        return arrayOf(1, 2, 3)
    }
}
