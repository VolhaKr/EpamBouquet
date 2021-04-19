import model.Bouquet;
import model.DecorationPlant;
import model.Flower;
import model.FlowerOne;
import sun.font.Decoration;

import java.util.ArrayList;
import java.util.List;

import static model.FlowerColor.RED;
import static model.FlowerColor.WHITE;

public class BouquetCreator {

    public Bouquet createMaxOneFlowerWRW(List<Flower> availableFlowers, List<DecorationPlant> availablDecorations) {

        Bouquet bouquet = new Bouquet();
        List<FlowerOne> availableOneFlowers = new ArrayList<>();

        availableOneFlowers = getFlowerOnes(availableFlowers);

        FlowerOne largestWhite = availableOneFlowers.get(0);
        FlowerOne largestRed = availableOneFlowers.get(0);


        for ( FlowerOne flower : availableOneFlowers ) {
            if ((flower.getColor() == RED) && (flower.getFlowerDiameter() > largestRed.getFlowerDiameter())) {
                largestRed = flower;
                if ((flower.getColor() == WHITE) && (flower.getFlowerDiameter() > largestRed.getFlowerDiameter())) {
                    largestWhite = flower;
                }
            }
        }

        bouquet.add(largestWhite);
        bouquet.add(largestRed);
        bouquet.add(largestWhite);
        return bouquet;
    }

    private static List<FlowerOne> getFlowerOnes(List<Flower> availableFlowers) {
        List<FlowerOne> availableOneFlowers = new ArrayList<>();
        for ( Flower flower : availableFlowers ) {
            if (flower instanceof FlowerOne) {
                availableOneFlowers.add((FlowerOne) flower);
            }
        }
        return availableOneFlowers;
    }

}
