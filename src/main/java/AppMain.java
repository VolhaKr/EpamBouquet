import logic.BouquetLogic;
import model.Bouquet;
import model.DecorationPlant;
import model.Flower;
import view.BouquetPrinter;

import java.util.List;


public class AppMain {
    public static void main(String[] args) {

        FlowerCreator flowerCreator = new FlowerCreator();
        List<Flower> availableFlowers = flowerCreator.createFlowers();

        DecorationCreator decorationCreator = new DecorationCreator();
        List<DecorationPlant> availableDecorations = decorationCreator.createDecorations();

        BouquetCreator bouquetCreator = new BouquetCreator();
        Bouquet bouquet = bouquetCreator.createMaxOneFlowerWRW(availableFlowers, availableDecorations);

        BouquetLogic bouquetLogic = new BouquetLogic();
        String price = bouquetLogic.calculateTotalPrice(bouquet);
        System.out.println("bouguet price " + price);

        BouquetPrinter bouquetPrinter = new BouquetPrinter();
        System.out.println("bouguet:");
        bouquetPrinter.print(bouquet);

    }
}
