package lesson03.adapter;

public class Task {
    public static void main(String[] args) {
        Client client = new Client(new Adaptor());
        client.doWork();
    }
}
