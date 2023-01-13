package io.github.js.annotation;

import java.lang.annotation.Annotation;

public class AnnotationService {

    public String getGreetings(Person person) {
        Annotation[] declaredAnnotations = person.getClass().getDeclaredAnnotations();
        for (Annotation annotation : declaredAnnotations) {
            if (annotation instanceof Greetings greetings) {
                return greetings.words();
            }
        }
        return null;
    }

}
