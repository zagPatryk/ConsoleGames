package GothicChest;

import java.util.Random;
import java.util.Scanner;

public interface GameBase {
    CombinationRandomizer combinationRandomizer = new CombinationRandomizer();
    Options options = new Options();
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    PlayerCreator playerCreator = new PlayerCreator();
    Game game = new Game();
}
