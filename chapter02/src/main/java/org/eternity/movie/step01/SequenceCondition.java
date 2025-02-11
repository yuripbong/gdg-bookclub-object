package org.eternity.movie.step01;

public class SequenceCondition implements DiscountCondition {
    private int sequence; // 순번

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(sequence);
    }
}
