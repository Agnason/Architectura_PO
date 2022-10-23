package lesson03.decorator;

public class Task {
    public static void main(String[] args) {
        Component component =new ConcreteComponent();
        component.operation();


        System.out.println("another");
        Component component1 = new ConcreteDecorater(new Decorator(new Component()));
        component1.operation();
    }
}
