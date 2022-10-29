package lesson04;

import java.util.Calendar;
import java.util.List;

public class TicketProvider {
    List<Ticket> ticketList;

    public Ticket getTickets(int place, Calendar calendar, String destination) {
        int index = 0;
        for (int i = 0; i < ticketList.size(); i++) {
            if (ticketList.get(i).place == place ||
                    ticketList.get(i).calendar.equals(calendar) ||
                    ticketList.get(i).destination.equals(destination)) {
                index = i;
            }
        }
        return ticketList.get(index);
    }


    public boolean updateTicketStatus(Ticket ticket) {
        return true;
    }
}
