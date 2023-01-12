package io.github.js.payment;

import java.util.Arrays;

public enum DiscountPolicy implements Discountable {

    NONE(0, 0) {
        @Override
        public long getDiscountAmount(long originAmount) {
            return 0;
        }
    },
    NAVER(10, 0L) {
        @Override
        public long getDiscountAmount(long originAmount) {
            return originAmount * this.discountRate / 100;
        }
    },
    KAKAO(15, 0L) {
        @Override
        public long getDiscountAmount(long originAmount) {
            return originAmount * this.discountRate / 100;
        }
    },
    GOOGLE(0, 1000L) {
        @Override
        public long getDiscountAmount(long originAmount) {
            return Math.min(originAmount, this.discountAmount);
        }
    }
    ;

    final int discountRate;
    final long discountAmount;

    DiscountPolicy(int discountRate, long discountAmount) {
        this.discountRate = discountRate;
        this.discountAmount = discountAmount;
    }

    public static DiscountPolicy getDiscountPolicy(String discountCode) {
        return Arrays.stream(values())
                .filter(discountPolicy -> discountPolicy.name().equals(discountCode))
                .findFirst().orElse(NONE);
    }

}
