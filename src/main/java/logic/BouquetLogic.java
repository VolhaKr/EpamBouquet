package logic;

import model.AbstractPlant;
import model.Bouquet;

public class BouquetLogic {

    public String calculateTotalPrice(Bouquet bouquet) {
        float price = 0;

        for ( AbstractPlant plant: bouquet.getPlants()){
           price = price + plant.getPrice();
        };

        return String.format("%.2f", price);
    }
}