package lesson03.adapter;

public class Client {
    public Client(Adaptor adaptor) {
        this.adaptor = adaptor;
    }

    Adaptor adaptor;
    public void doWork(){
        adaptor.methodA();
    }
}
