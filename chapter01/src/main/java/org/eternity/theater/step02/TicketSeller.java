package org.eternity.theater.step02;

public class TicketSeller {
    private TicketOffice ticketOffice;

    // 판매원이 일하는 매표소
    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    // 판매원이 매표소에 직접 접근
    public void sellTo(Audience audience) {
        ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
    }
}
