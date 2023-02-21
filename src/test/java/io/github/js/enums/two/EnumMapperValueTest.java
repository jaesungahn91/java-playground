package io.github.js.enums.two;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class EnumMapperValueTest {

    @Test
    void 열거형으로_전환_및_인터페이스_타입을_선언() {
        // when
        List<EnumMapperValue> result = Arrays.stream(FeeType.values())
                .map(EnumMapperValue::new)
                .toList();

        // then
        assertThat(result).hasSize(2);
    }

}