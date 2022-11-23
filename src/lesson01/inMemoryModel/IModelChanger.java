package lesson01.inMemoryModel;

public interface IModelChanger {
    public default void notifyChange(IModelChanger sender) {

    };
}
