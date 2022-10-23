package lesson03.decorator;

public class ConcreteComponent extends Component {
    public void addDoConcreteComponnt() {
        System.out.println("add for concreteComponent");
    }

    @Override
    public void operation() {
    super.operation();
    addDoConcreteComponnt();
    }
}
