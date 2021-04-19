import model.BunchType;
import model.Flower;
import model.FlowerBunch;
import model.FlowerOne;

import java.util.ArrayList;
import java.util.List;

import static model.FlowerColor.*;

public class FlowerCreator {

    public List<Flower> createFlowers() {
        List<Flower> flowers = new ArrayList<>();
        flowers.add(new FlowerOne("rose", 2, RED, 8));
        flowers.add(new FlowerOne("rose", 2, WHITE, 8));
        flowers.add(new FlowerOne("rose", 1, RED, 6));
        flowers.add(new FlowerOne("rose", 1, WHITE, 6));
        flowers.add(new FlowerOne("rose", 1, PINK, 6));
        flowers.add(new FlowerBunch("lily", 1, WHITE, BunchType.FASCICLE));
        return flowers;
    }
}
