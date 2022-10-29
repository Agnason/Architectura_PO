package lesson04;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Customer {
    public int id;
    CashProvider cash;
    List<Ticket> ticketList;

    // проверка на контракт
    public boolean buyTicket(Ticket ticket) {
        if (ticket != null) {
            ticket.isValid = false;
            cash.buy(ticket.price);
        }
        return true;
    }

    public List<Ticket> searchTicket(Calendar calendar, String destination) {
        List<Ticket> searchTicket = new ArrayList<>();
        for (Ticket ticket : ticketList) {
            if (ticket.calendar.equals(calendar) ||
                    ticket.destination.equals(destination)) {
                searchTicket.add(ticket);
            }
        }
        return searchTicket;
    }

}
