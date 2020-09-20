package GothicChest;

import java.util.*;

public class CombinationRandomizer implements GameBase {

    public List<String> getCombination(int length) {
        List<String> combination = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            combination.add(random.nextBoolean() ? "L" : "P");
        }
        return combination;
    }
}
