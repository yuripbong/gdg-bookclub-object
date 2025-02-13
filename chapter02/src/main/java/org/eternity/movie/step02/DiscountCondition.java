package org.eternity.movie.step02;

import org.eternity.movie.step01.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
