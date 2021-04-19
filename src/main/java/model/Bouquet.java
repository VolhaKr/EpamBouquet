package model;

import sun.font.Decoration;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bouquet {

    private List<AbstractPlant> plants;
    private double price;

    public Bouquet() {
        plants = new ArrayList<AbstractPlant>();
    }

    public void add(AbstractPlant plant) {
        plants.add(plant);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bouquet)) return false;
        Bouquet bouquet = (Bouquet) o;
        return Objects.equals(plants, bouquet.plants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plants);
    }

    @Override
    public String toString() {
        String bouquetString = new String();
        bouquetString = " plants= ";
        for ( AbstractPlant plant : plants ) {
            bouquetString = bouquetString + plant.getName() + " ; ";
        }
        return bouquetString;
    }

    public List<AbstractPlant> getPlants() {
        return plants;
    }

    public void add(Decoration decoration) {
    }
}
