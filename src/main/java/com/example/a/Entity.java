package com.example.a;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class Entity {

    private final String fieldA;

    public Entity(final String fieldA) {
        this.fieldA = fieldA;
    }

    public String getFieldA() {
        return fieldA;
    }
}
