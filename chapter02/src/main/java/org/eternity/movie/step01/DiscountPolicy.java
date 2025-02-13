package org.eternity.movie.step01;

import org.eternity.money.Money;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 추상 클래스
public abstract class DiscountPolicy {
    // 하나의 할인 정책은 여러 개의 할인 조건 포함 가능
    private List<DiscountCondition> conditions = new ArrayList<>();

    public DiscountPolicy(DiscountCondition... conditions) {
        this.conditions = Arrays.asList(conditions);
    }

    public Money calculateDiscountAmount(Screening screening) {
        for(DiscountCondition each : conditions) {
            if (each.isSatisfiedBy(screening)) { // 할인 조건을 만족시키는지 확인
                return getDiscountAmount(screening); // 할인 요금 반환
            }
        }

        return Money.ZERO; // 만족하는 할인 조건이 하나도 존재하지 않는 경우 할인 요금 0원
    }

    // 만족하는 할인 조건이 있을 경우 호출
    abstract protected Money getDiscountAmount(Screening Screening);
}
