package ru.bia.test.testrest_kt

import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory
import java.io.IOException
import java.net.URI
import java.util.logging.Level
import java.util.logging.Logger

fun main(args: Array<String>) {
    val BASE_URI = URI.create("http://0.0.0.0:8080/")
    App(BASE_URI).run()
}

class App(val BASE_URI: URI) {
    fun run() {
        try {
            val server = GrizzlyHttpServerFactory.createHttpServer(BASE_URI, ApplicationConfig(), false)
            Runtime.getRuntime().addShutdownHook(Thread(Runnable { server.shutdownNow() }))
            server.start()

            println(String.format("Application started.%nStop the application using CTRL+C"))

            Thread.currentThread().join()
        } catch (ex: IOException) {

            Logger.getLogger(App::class.java!!.getName()).log(Level.SEVERE, null, ex)
        } catch (ex: InterruptedException) {
            Logger.getLogger(App::class.java!!.getName()).log(Level.SEVERE, null, ex)
        }
    }

}
