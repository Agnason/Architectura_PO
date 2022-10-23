package lesson03.facade;

import lesson03.facade.package1.Class1;
import lesson03.facade.package2.Class2;
import lesson03.facade.package3.Class3;

// сам класс Facade, в поля которого прописываем классы Class1, Class2, Class3
public class Facade {
    Class1 class1;
    Class2 class2;
    Class3 class3;

    public Integer doSomething() {
        Class1 c1 = new Class1();
        Class2 c2 = new Class2();
        Class3 c3 = new Class3();
        c1.doStuff(c2);
        c3.setX(c1.getX());
        return c3.getY();
    }
}
