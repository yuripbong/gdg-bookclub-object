package org.eternity.theater.step01;

public class Bag {
    private Long amount; // 현금
    private Invitation invitation; // 초대장
    private Ticket ticket; // 티켓

    // 현금만 있을 경우
    public Bag(long amount) {
        this(null, amount);
    }

    // 현금과 초대장을 함께 갖고 있는 경우
    public Bag(Invitation invitation, long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    // 초대장 확인
    public boolean hasInvitation() {
        return invitation != null;
    }

    // 티켓 확인
    public boolean hasTicket() {
        return ticket != null;
    }

    // 가방에 티켓 저장
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    // 현금 차감
    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    // 현금 증가
    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
