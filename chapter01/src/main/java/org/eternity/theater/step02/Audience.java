package org.eternity.theater.step02;

public class Audience {
    private Bag bag; // 관객의 가방

    // 관객은 무조건 가방을 가져야 함
    public Audience(Bag bag) {
        this.bag = bag;
    }

    // 티켓 구매
    public Long buy(Ticket ticket) {
        if (bag.hasInvitation()) { // 초대장이 있는 경우
            bag.setTicket(ticket);
            return 0L;
        } else { // 초대장이 없는 경우 티켓 구매
            bag.setTicket(ticket);
            bag.minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }
}
