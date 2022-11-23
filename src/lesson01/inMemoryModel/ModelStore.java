package lesson01.inMemoryModel;

import lesson01.inMemoryModel.modelElements.Camera;
import lesson01.inMemoryModel.modelElements.Flash;
import lesson01.inMemoryModel.modelElements.PoligonalModel;
import lesson01.inMemoryModel.modelElements.Scene;

// создаём класс ModelStore
public class ModelStore {
    //    дальше идут поляю Если "+" - public, если "-" - то private, если "#" - protected
    public PoligonalModel models;
    public Scene scenes;
    public Flash flashes;
    public Camera cameras;


    // это геттер по полю Scene
    public Scene getScenes() {
        return scenes;
    }

    // это метод
    public void notifyChange(IModelChanger changer) {
//        здесь будет содержимое метода
    };
}
