package lesson01.inMemoryModel;

// это интерфейс
public interface IModelChangeObserver {
    //   по диаграмме в данном интерфейсе только один метод
    public void applyUpdateModel();
}
