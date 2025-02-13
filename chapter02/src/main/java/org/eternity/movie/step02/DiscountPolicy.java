package org.eternity.movie.step02;

import org.eternity.movie.step01.Money;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
