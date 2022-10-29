package lesson04;

import java.util.Calendar;
import java.util.Date;

public class Ticket {

    public int rootNumber;
    public String destination;
    public int place;
    public int price;
    Calendar calendar;
    public boolean isValid;

    public Ticket(int rootNumber, String destination, int place, int price, Calendar calendar, boolean isValid) {
        this.rootNumber = rootNumber;
        this.destination = destination;
        this.place = place;
        this.price = price;
        this.calendar = calendar;
        this.isValid = isValid;
    }

    @Override
    public String toString() {
        return "Ticket#" + place + "\n" +
                "Place " + place + "\n" +
                "Destination: " + destination + "\n" +
                "Calendar: " + calendar.getTime();
    }
}


