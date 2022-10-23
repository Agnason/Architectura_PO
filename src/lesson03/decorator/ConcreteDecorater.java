package lesson03.decorator;

public class ConcreteDecorater extends Decorator{

    public ConcreteDecorater(Component component) {
        super(component);
    }

    public void doAddConcreteDecorater(){
        System.out.println("add for ConcreteDecorator");
    }
    @Override
    public void operation() {
        super.operation();
        doAddConcreteDecorater();
    }
}
