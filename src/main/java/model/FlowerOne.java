package model;

public class FlowerOne extends Flower {
    float flowerDiameter;

    public FlowerOne(String name, float price, FlowerColor color, float flowerDiameter) {
        super(name, price, color);
        this.flowerDiameter = flowerDiameter;
    }

    public float getFlowerDiameter() {
        return flowerDiameter;
    }
}
