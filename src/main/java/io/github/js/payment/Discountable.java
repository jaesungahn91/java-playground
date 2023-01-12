package io.github.js.payment;

public interface Discountable {

    Discountable NONE = originAmount -> 0;

    long getDiscountAmount(long originAmount);

}

class NaverDiscountPolicy implements Discountable {
    @Override
    public long getDiscountAmount(long originAmount) {
        return (long) (originAmount * 0.1);
    }
}

class KakaoDiscountPolicy implements Discountable {
    @Override
    public long getDiscountAmount(long originAmount) {
        return (long) (originAmount * 0.15);
    }
}

