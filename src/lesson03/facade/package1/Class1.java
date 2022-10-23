package lesson03.facade.package1;


import lesson03.facade.package2.Class2;

// создаем один из классов (который за что-то отвечает), который потом будет входит в поля класса фасада
public class Class1 {
    // из UML-диаграммы в классе Class1 есть вот такие методы
    Integer x;
    Integer y;

    public void doStuff(Class2 class2) {
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }
}
