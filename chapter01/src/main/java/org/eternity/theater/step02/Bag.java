package org.eternity.theater.step02;


public class Bag {
    private Long amount; // 현금
    private Invitation invitation; // 초대장
    private Ticket ticket; // 티켓

    public Long hold(Ticket ticket) {
        if (hasInvitation()) {
            setTicket(ticket);
            return 0L;
        } else {
            setTicket(ticket);
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }

    // 초대장 확인
    public boolean hasInvitation() {
        return invitation != null;
    }

    // 가방에 티켓 저장
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    // 현금 차감
    public void minusAmount(Long amount) {
        this.amount -= amount;
    }
}

