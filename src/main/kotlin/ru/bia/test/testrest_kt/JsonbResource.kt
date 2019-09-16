package ru.bia.test.testrest_kt

import java.util.ArrayList
import javax.ws.rs.*
import javax.ws.rs.core.Response

/**
 * An example resource utilizing JSONB.
 *
 * @author Adam Lindenthal (adam.lindenthal at oracle.com)
 *
 * Autotranslated to Kotlin
 */
@Path("cats")
@Consumes("application/json")
class JsonbResource {

    val all: List<Cat>
        @Path("all")
        @GET
        @Produces("application/json")
        get() = cats


    //    @Path("one")
    //    @GET
    //    @Produces("application/json")
    //    public Cat getCat() {
    //        return cats.get((int) (Math.round(Math.random() * 3)));
    //    }
    //
    //    @Path("all")
    //    @GET
    //    @Produces("application/json")
    //    public List<Cat> getAll() {
    //        return cats;
    //    }
    //
    //    @Path("schroedinger")
    //    @GET
    //    public String check() {
    //        return "The cat is 9x alive!";
    //    }
    //
    //    @Path("add")
    //    @POST
    //    public Response createCat(Cat cat) {
    //        System.out.println("Creating cat.");
    //        cats.add(cat);
    //        return Response.ok().build();
    //    }
    //
    @Path("addAll")
    @POST
    fun createMultiple(addedCats: List<Cat>): Response {
        cats.addAll(addedCats)
        return Response.ok().build()
    }

    companion object {

        private val cats = ArrayList<Cat>()

        init {
            cats.add(Cat("Rosa", "semi-british", "tabby", true))
            cats.add(Cat("Alfred", "semi-british", "ginger", true))
            cats.add(Cat("Mishan", "british blue", "blue/silver", true))
            cats.add(Cat("Costa", "common cat", "stracciatella", true))
        }
    }

}
