package io.github.js.immutable;

import java.util.ArrayList;
import java.util.List;

public record ImmutableClass(String name, List<ImmutableInnerClass> innerClasses) {

    public ImmutableClass(String name, List<ImmutableInnerClass> innerClasses) {
        this.name = name;
        this.innerClasses = new ArrayList<>(innerClasses);
    }

    public List<ImmutableInnerClass> getInnerClasses() {
        return this.innerClasses;
    }
}
