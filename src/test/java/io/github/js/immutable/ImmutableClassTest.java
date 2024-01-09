package io.github.js.immutable;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ImmutableClassTest {

    @Test
    void immutableTest() {
        ImmutableInnerClass innerClass1 = new ImmutableInnerClass("innerClass1");
        ImmutableInnerClass innerClass2 = new ImmutableInnerClass("innerClass2");

        List<ImmutableInnerClass> innerClasses1 = new ArrayList<>();
        innerClasses1.add(innerClass1);
        innerClasses1.add(innerClass2);
        ImmutableClass immutableClass = new ImmutableClass("immutableClass", innerClasses1);

        List<ImmutableInnerClass> innerClasses2 = immutableClass.getInnerClasses();
        innerClasses2.add(new ImmutableInnerClass("innerClass3"));

        assertThat(innerClasses1.size()).isNotEqualTo(innerClasses2.size());
    }
}
