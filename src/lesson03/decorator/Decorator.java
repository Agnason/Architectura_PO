package lesson03.decorator;

public class Decorator extends Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void addDecorator() {
        System.out.println("add for Decorator");
    }

    @Override
    public void operation() {
        super.operation();
        addDecorator();
    }
}
