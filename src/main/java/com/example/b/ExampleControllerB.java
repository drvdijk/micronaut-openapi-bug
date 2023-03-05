package com.example.b;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/api/example/b")
public class ExampleControllerB {

    @Get
    public Entity entity() {
        return new Entity("b");
    }
}
