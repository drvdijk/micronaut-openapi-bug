package com.example;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "swagger-server",
                version = "1.0",
                description = "Example"
        )
)
public class ExampleApplication {

    public static void main(String[] args) {
        Micronaut.run(ExampleApplication.class);
    }
}
