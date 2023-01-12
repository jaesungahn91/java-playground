package io.github.js.payment;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class PaymentServiceTest {

    private final PaymentService paymentService = new PaymentService();

    @ParameterizedTest
    @CsvSource({"3000,NAVER,0.1", "4000,KAKAO,0.15"})
    void 할인율_계산(int price, String discountCode, double discount) {
        // given
        long expected = (long) (price * discount);

        // when
        long actual = paymentService.getDiscountAmount(discountCode, price);

        // then
        assertThat(actual).isEqualTo(expected);
    }

}