package io.github.js.enums.one;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTypeTest {

    @Test
    void 코드에_따라_서로다른_계산하기_enum() {
        // given
        CalculatorType code = CalculatorType.CALC_A;
        long originValue = 10000L;

        // when
        long result = code.calculate(originValue);

        // then
        assertThat(result).isEqualTo(10000L);
    }
}