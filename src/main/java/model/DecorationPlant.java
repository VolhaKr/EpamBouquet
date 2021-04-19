package model;

public class DecorationPlant extends AbstractPlant {
    DecorationPlantType decorationPlantType;

    public DecorationPlant(String name, float price, DecorationPlantType decorationPlantType) {
        super(name, price);
        this.decorationPlantType = decorationPlantType;
    }
}
