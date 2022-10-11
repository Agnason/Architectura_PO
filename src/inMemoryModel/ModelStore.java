package inMemoryModel;

// создаём класс ModelStore
public class ModelStore {
    //    дальше идут поляю Если "+" - public, если "-" - то private, если "#" - protected
    public PoligonalModel models;
    public Scene scenes;
    public Flash flashes;
    public Camera cameras;

    private IModelchangeObserver changeObserves;

    // это геттер по полю Scene
    public Scene getScenes() {
        return scenes;
    }

    // это метод
    public void notifyChange(IModelChanger changer) {
//        здесь будет содержимое метода
    };
}
