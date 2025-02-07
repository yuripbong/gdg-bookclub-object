package org.eternity.theater.step02;

public class Audience {
    private Bag bag; // 관객의 가방

    // 티켓 구매
    public Long buy(Ticket ticket) {
        return bag.hold(ticket);
    }
}
