package com.example.a;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/api/example/a")
public class ExampleControllerA {

    @Get
    public Entity entity() {
        return new Entity("a");
    }
}
