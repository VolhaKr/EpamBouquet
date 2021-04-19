import model.DecorationPlant;

import java.util.ArrayList;
import java.util.List;

import static model.DecorationPlantType.GRASS;
import static model.DecorationPlantType.PLUM;

public class DecorationCreator {

    public List<DecorationPlant> createDecorations() {

        List<DecorationPlant> decorations = new ArrayList<>();
        decorations.add(new DecorationPlant("gipsofila", 0.99f, PLUM));
        decorations.add(new DecorationPlant("bergrass", 1, GRASS));
        return decorations;

    }
}

