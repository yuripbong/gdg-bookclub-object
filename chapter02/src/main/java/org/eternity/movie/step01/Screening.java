package org.eternity.movie.step01;

import java.time.LocalDateTime;

public class Screening {
    private Movie movie; // 상영할 영화
    private int sequence; // 순번
    private LocalDateTime whenScreened; // 상영 시작 시간

    public Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
    }

    // 상영 시작 시간
    public LocalDateTime getStartTime() {
        return whenScreened;
    }

    // 순번 일치 여부
    public boolean isSequence(int sequence) {
        return this.sequence == sequence;
    }

    // 기본 요금
    public Money getMovieFee() {
        return movie.getFee();
    }
}
