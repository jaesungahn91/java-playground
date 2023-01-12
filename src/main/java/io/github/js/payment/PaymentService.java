package io.github.js.payment;

public class PaymentService {

    public long getDiscountAmount(String discountCode, long productAmount) {
        Discountable discountPolicy = DiscountPolicy.getDiscountPolicy(discountCode);
        return discountPolicy.getDiscountAmount(productAmount);
    }

}
