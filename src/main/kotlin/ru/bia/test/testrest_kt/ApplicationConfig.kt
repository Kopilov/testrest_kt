package ru.bia.test.testrest_kt

import org.glassfish.jersey.jackson.JacksonFeature
import org.glassfish.jersey.server.ResourceConfig

/**
 * Jersey resources list loaded on Grizzly startup
 */
class ApplicationConfig : ResourceConfig(
        Rest::class.java,
        JsonbResource::class.java,
        JsonbResourceInt::class.java,
        JacksonFeature::class.java,
        MyParamConverterProvider::class.java
)


