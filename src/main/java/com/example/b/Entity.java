package com.example.b;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class Entity {

    private final String fieldB;

    public Entity(final String fieldB) {
        this.fieldB = fieldB;
    }

    public String getFieldB() {
        return fieldB;
    }
}
