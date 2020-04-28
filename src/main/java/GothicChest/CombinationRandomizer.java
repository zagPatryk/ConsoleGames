package GothicChest;

import java.util.*;

public class CombinationRandomizer implements GameBase{

    List<String> combination = new ArrayList<>();

    public List<String> getCombination (int length){
        for (int i = 0; i < length; i++) {
            if (random.nextBoolean()) {
                combination.add("L");
            } else {
                combination.add("P");
            }
        }
        return combination;
    }
}
