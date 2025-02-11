package org.eternity.movie.step01.pricing;

import org.eternity.movie.step01.DiscountCondition;
import org.eternity.movie.step01.DiscountPolicy;
import org.eternity.movie.step01.Money;
import org.eternity.movie.step01.Screening;

// 할인 조건을 만족할 경우 일정 금액 할인
public class AmountDiscountPolicy extends DiscountPolicy {
    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
