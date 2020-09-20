package GothicChest;

import java.util.*;

public class Game implements GameBase {

    public void playGame(Player player, int combinationLength) {
        List<String> combination = combinationRandomizer.getCombination(combinationLength);
        Deque<String> queue = new ArrayDeque<>(combination);
        String input;
        int e = 0;

        boolean breaker = false;
        System.out.println("W którą stonę skręcić wytrych? W lewo czy w prawo?");
        while (player.getLockpicksNumber() > 0 && queue.size() > 0 && !breaker) {

            input = scanner.nextLine();

            switch (input) {
                case "L":
                case "P":
                    if (queue.poll().equals(input)) {
                        player.addDexterity();
                        System.out.println("Dobrze!");
                    } else {
                        player.brokenLockpick();
                        queue = new ArrayDeque<>(combination);
                        if (player.getLockpicksNumber() > 0) {
                            System.out.println("Zacznij od początku...");
                        }
                    }
                    break;
                case "H":
                    options.help();
                    break;
                case "D":
                    System.out.println(player.getName() + " ma " + player.getDexterityLevel() + " zręczności");
                    break;
                case "W":
                    System.out.println(player.getName() + " ma " + player.getLockpicksNumber() + " wytrychów");
                    break;
                case "Q":
                    breaker = true;
                    break;
                default:
                    if (e == 3) {
                        options.help();
                    } else {
                        e++;
                    }
                    break;
            }
        }

        if (player.getLockpicksNumber() > 0 && queue.size() == 0) {
            int gold = (combinationLength - 2) * random.nextInt(100);
            int lockpicks = combinationLength - random.nextInt(combinationLength);

            player.addGold(gold);
            player.addLockpick(lockpicks);
            System.out.println("\nZnalazłeś " + gold + " złota i " + lockpicks + " wytrychy!");
        }
    }
}
