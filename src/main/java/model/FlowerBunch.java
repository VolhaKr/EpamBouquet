package model;

public class FlowerBunch extends Flower {
    BunchType bunchType;

    public FlowerBunch(String name, float price, FlowerColor color, BunchType bunchType) {
        super(name, price, color);
        this.bunchType = bunchType;
    }
}
