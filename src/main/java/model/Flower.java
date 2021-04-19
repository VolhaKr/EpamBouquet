package model;


public class Flower extends AbstractPlant {
    private Stem stem;
    private FlowerColor color;

    public Flower(String name, float price, FlowerColor color) {
        super(name, price);
        this.color = color;
    }

    public Flower(String name, float price, int heignt, Stem stem, FlowerColor color) {
        super(name, price, heignt);
        this.stem = stem;
        this.color = color;
    }

    public FlowerColor getColor() {
        return color;
    }

}
