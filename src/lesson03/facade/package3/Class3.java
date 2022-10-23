package lesson03.facade.package3;

// создаем один из классов (который за что-то отвечает), который потом будет входит в поля класса фасада
public class Class3 {
    Integer x;
    Integer y;
    // из UML-диаграммы в классе Class1 есть вот такие методы

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
