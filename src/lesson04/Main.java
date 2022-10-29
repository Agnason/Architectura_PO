package lesson04;

import java.util.*;

public class Main {
    public static void main(String[] args) {
// Пока не будет использовать базу данных.
// Создадим базу билетов в TicketProvider
        TicketProvider ticketProvider = new TicketProvider();
        List<Ticket> poolTickets = new ArrayList<>();
        ticketProvider.ticketList = poolTickets;
// Создадим 3 маршрута. По каждому маршруту будут известны дата и время выезда, номер маршрута, пункт назначения, цена и наличие мест
// Маршрут №1.
// Время - 2022-04-25 19:45. Пункт назначения -Saint_Petersburg, Цена - 500 руб. Всего - 3 места

        // Задаем время - 2022-04-25 19:45

        Calendar calendarRouteOne = new GregorianCalendar();
        calendarRouteOne.set(Calendar.YEAR, 2022);
        calendarRouteOne.set(Calendar.MONTH, Calendar.APRIL);
        calendarRouteOne.set(Calendar.DAY_OF_MONTH, 25);
        calendarRouteOne.set(Calendar.HOUR_OF_DAY, 19);
        calendarRouteOne.set(Calendar.MINUTE, 45);
        calendarRouteOne.set(Calendar.SECOND, 0);

        //  Создадим билеты для маршрута №1
        Integer[] countRouteOne = new Integer[3];
        for (int i = 0; i < countRouteOne.length; i++) {
            poolTickets.add(new Ticket(1, "Saint-Petersburg", i + 1, 500, calendarRouteOne, true));
        }

// End. Маршрут №1

//  Маршрут №2.
//  Время - 2022-04-25 21:45. Пункт назначения -Saint_Petersburg, Цена - 500 руб. Всего -2 места
        // Задаем время - 2022-04-25 21:45

        Calendar calendarRouteTwo = new GregorianCalendar();
        calendarRouteTwo.set(Calendar.YEAR, 2022);
        calendarRouteTwo.set(Calendar.MONTH, Calendar.APRIL);
        calendarRouteTwo.set(Calendar.DAY_OF_MONTH, 25);
        calendarRouteTwo.set(Calendar.HOUR_OF_DAY, 21);
        calendarRouteTwo.set(Calendar.MINUTE, 45);
        calendarRouteTwo.set(Calendar.SECOND, 0);

//  Создадим билеты для маршрута №2
        //  Создадим билеты для маршрута №1
        Integer[] countRouteTwo = new Integer[2];
        for (int i = 0; i < countRouteTwo.length; i++) {
            poolTickets.add(new Ticket(1, "Saint-Petersburg", i + 1, 500, calendarRouteTwo, true));
        }
//  End. Маршрут №2

//  Маршрут №3. Время - 2022-04-26 08:15. Пункт назначения -Moscow, Цена - 1000 руб. Всего - 4 места
//
        // Задаем время - 2022-04-26 08:15

        Calendar calendarRouteThree = new GregorianCalendar();
        calendarRouteThree.set(Calendar.YEAR, 2022);
        calendarRouteThree.set(Calendar.MONTH, Calendar.APRIL);
        calendarRouteThree.set(Calendar.DAY_OF_MONTH, 26);
        calendarRouteThree.set(Calendar.HOUR_OF_DAY, 8);
        calendarRouteThree.set(Calendar.MINUTE, 15);

//  Создадим билеты для маршрута №3
        //  Создадим билеты для маршрута №3
        Integer[] countRouteThree = new Integer[4];
        for (int i = 0; i < countRouteThree.length; i++) {
            poolTickets.add(new Ticket(1, "Moscow", i + 1, 1000, calendarRouteThree, true));
        }
//  End. Маршрут №3


// cоздаем scanner
        Scanner sc = new Scanner(System.in);
// Создадим заказчика(Customer), которому надо купить билет на 25-04-25 до Москвы. На карте у него 2000 руб
        Customer customer = new Customer();
// идентификатор заказчика. По нему же и будем авторизоваться и получать данные об его кошельке
        System.out.println("Enter your identification");
        if (sc.hasNextInt()) {
            customer.id = sc.nextInt();
//  присваиваем CashProvider. Пока живет customer, будет жить и его CashProvider
            customer.cash = new CashProvider();
            CashProvider cash = customer.cash;
// проходим авторизацию нашего заказчика (customer)
// пока нет базы данных, будет авторизоваться по id заказчика. Пусть у нас будут только 3 заказчика с id=1, id=2, id=3
            customer.cash.autorization(customer);
            if (cash.isAutorization) {
                System.out.println("Your cash is " + cash.card);
            } else {
                System.out.println("Sorry. Your id is not in our base");
            }
        }
// запрашиваем пункт прибытия
        System.out.println("Enter your destination");
// в будущем можно попробовать сделать enum городов России
        String destination = sc.next();
// запрашиваем дату
        Calendar calendar = new GregorianCalendar();
        System.out.println("Enter year");
        int year = sc.nextInt();
        System.out.println("Enter month (0-11)");
        int month = sc.nextInt();
        System.out.println("Enter date (1-31)");
        int date = sc.nextInt();
        calendar.set(2022, Calendar.APRIL, 26);

// подбор подходящих билетов
        customer.ticketList = poolTickets;
        List<Ticket> searchTicket = customer.searchTicket(calendar, destination);
        if (!searchTicket.isEmpty()) {
            for (Ticket ticket : searchTicket) {
                System.out.println(ticket.toString());
            }
        } else {
            System.out.println("Tickets are not found!");
        }
// покупаем билет по месту посадки
        System.out.println("Which place are chosen?");
        int place= sc.nextInt();
        System.out.println("You choose that's ticket");
        Ticket chosenTicket=ticketProvider.getTickets(place,calendar, destination);
        System.out.println(chosenTicket.toString());
        customer.buyTicket(chosenTicket);
        System.out.println("You bought ticket"+ "\n"+"Your cash is " + customer.cash.card);

        System.out.println("Finish");
    }
}




