package model;

public abstract class AbstractPlant {
    private String name;
    private float price;
    private int heignt;

    public AbstractPlant(String name, float price) {
        this.name = name;
        if (price > 0) {
            this.price = price;
        }
    }

    public AbstractPlant(String name, float price, int heignt) {
        this.name = name;
        this.price = price;
        this.heignt = heignt;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getHeignt() {
        return heignt;
    }
}
