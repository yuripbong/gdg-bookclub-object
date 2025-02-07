package org.eternity.theater.step02;

public class TicketSeller {
    private TicketOffice ticketOffice;

    // 판매원이 일하는 매표소
    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }
}
