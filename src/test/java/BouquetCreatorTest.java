import model.Bouquet;
import model.DecorationPlant;
import model.Flower;
import model.FlowerOne;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static model.FlowerColor.RED;
import static model.FlowerColor.WHITE;
import static org.junit.Assert.assertTrue;

public class BouquetCreatorTest {
    BouquetCreator bouquetCreator;
    List<Flower> availableFlowers;
    List<DecorationPlant> availableDecorations;
    Bouquet outputBouquet;


    @Before
    public void prepare() {
        FlowerCreator flowerCreator = new FlowerCreator();
        availableFlowers = flowerCreator.createFlowers();

        DecorationCreator decorationCreator = new DecorationCreator();
        availableDecorations = decorationCreator.createDecorations();

        BouquetCreator bouquetCreator = new BouquetCreator();
    }

    @Test
    public void testFlowerMaxWRWCreatorShouldReturn() {
        FlowerOne maxExpectedWhiteOutput = new FlowerOne("rose", 2f, WHITE, 80);
        FlowerOne maxExpectedRedOutput = new FlowerOne("rose", 2f, RED, 80);
        List <Flower> bwbExpectedFlowersOutput  = new ArrayList<>();
        bwbExpectedFlowersOutput.add(maxExpectedWhiteOutput);
        bwbExpectedFlowersOutput.add(maxExpectedWhiteOutput);
        bwbExpectedFlowersOutput.add(maxExpectedRedOutput);
        outputBouquet = bouquetCreator.createMaxOneFlowerWRW(availableFlowers, availableDecorations);
        assertTrue(outputBouquet.getPlants().size() == bwbExpectedFlowersOutput.size() &&
                outputBouquet.getPlants().containsAll(bwbExpectedFlowersOutput) && bwbExpectedFlowersOutput.containsAll(outputBouquet.getPlants()));
        }
    }

