package ru.bia.test.testrest_kt

import java.lang.reflect.Type
import javax.ws.rs.ext.ParamConverter
import javax.ws.rs.ext.ParamConverterProvider
import javax.ws.rs.ext.Provider

@Provider
class MyParamConverterProvider : ParamConverterProvider {

    override fun <T> getConverter(rawType: Class<T>, genericType: Type, annotations: Array<Annotation>): ParamConverter<T>? {

        return if (rawType == Ints::class.java) {

            MyParamConverter() as ParamConverter<T>

        } else null

    }

}
