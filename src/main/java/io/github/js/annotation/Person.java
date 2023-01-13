package io.github.js.annotation;

public abstract class Person {

    protected String name;

    protected Person(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

}
