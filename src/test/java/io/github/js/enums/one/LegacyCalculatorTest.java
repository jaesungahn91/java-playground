package io.github.js.enums.one;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class LegacyCalculatorTest {

    @Test
    void 코드에_따라_서로다른_계산하기_기존방식() {
        // given
        String code = "CALC_A";
        long originValue = 10000L;

        // when
        long result = LegacyCalculator.calculate(code, originValue);

        // then
        assertThat(result).isEqualTo(10000L);
    }

}