package lesson07.logika;

public class Reader {
    // запрос от сайта в виде JSON или XML или XPATH
    // упрости. Будем получать запрос на поставщикам
    String provider;

    public Reader(String provider) {
        this.provider = provider;
    }

    public void getRequest(String request) {
        System.out.println("This is "+ request);
    }
}
