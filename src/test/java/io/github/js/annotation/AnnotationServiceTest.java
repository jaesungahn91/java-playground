package io.github.js.annotation;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class AnnotationServiceTest {

    private final AnnotationService annotationService = new AnnotationService();

    @ParameterizedTest
    @MethodSource(value = "getPersonParameter")
    void getGreetings(Person person, String words) {
        // when
        String actual = annotationService.getGreetings(person);

        // then
        assertThat(actual).isEqualTo(words);
    }

    static Stream<Arguments> getPersonParameter() {
        return Stream.of(
                arguments(new American("미국인"), "Hello"),
                arguments(new Korean("한국인"), "안녕하세요")
        );
    }
}