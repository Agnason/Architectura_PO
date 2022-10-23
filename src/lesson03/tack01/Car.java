package lesson03.tack01;

import java.awt.*;

// Задание 1. Сдать код с семинара и сделать UML-диаграмму по коду.
// UML-диаграмму можно сделать в любом редакторе. Диаграмма сдается файлом формата jpg.

abstract class Car {
    private String label;
    private String model;
    private Color color;
    private TypeCar bodyType;
    private Integer numberOfWheels;
    private TypeFuel fuel;
    private TypeGearBox transmissionType;
    private Double engineCapacity;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public TypeCar getBodyType() {
        return bodyType;
    }

    public void setBodyType(TypeCar bodyType) {
        this.bodyType = bodyType;
    }

    public Integer getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(Integer numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public TypeFuel getFuel() {
        return fuel;
    }

    public void setFuel(TypeFuel fuel) {
        this.fuel = fuel;
    }

    public TypeGearBox getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(TypeGearBox transmissionType) {
        this.transmissionType = transmissionType;
    }

    public Double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(Double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void run() {

    }

    public void service() {

    }

    public boolean gear_shifting() {

        return false;
    }

    public boolean turning_on_the_headlights() {

        return false;
    }

    public boolean turning_on_the_wipers() {

        return false;
    }

    enum TypeCar {
        SEDAN,
        PICKUP
    }

    enum TypeFuel {
        GASOLINE,
        DIESEL
    }

    enum TypeGearBox {
        AT,
        MT
    }

}

class Pickup extends Car implements Refueling, Wiping {
    private int loadCapacity;

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void fuel() {

    }

    @Override
    public void wipWindshield() {

    }

    @Override
    public void wipHeadLights() {

    }

    @Override
    public void wipMirrors() {

    }
}

class FutureCar extends Car {
    public FutureCar() {
        this.setNumberOfWheels(3);
    }

    @Override
    public void run() {
        fly();
    }

    private void fly() {

    }
}

interface Refueling {
    void fuel();
}

interface Wiping {
    void wipWindshield();
    void wipHeadLights();
    void wipMirrors();
}

