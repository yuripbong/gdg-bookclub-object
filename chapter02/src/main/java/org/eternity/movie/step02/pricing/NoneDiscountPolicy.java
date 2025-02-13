package org.eternity.movie.step02.pricing;

import org.eternity.movie.step01.DiscountPolicy;
import org.eternity.movie.step01.Money;
import org.eternity.movie.step01.Screening;

// 할인되지 않는 영화 계산
public class NoneDiscountPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
