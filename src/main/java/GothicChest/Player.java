package GothicChest;

import java.util.Random;

public class Player {
    private Random random = new Random();
    private String name;
    private int lockpicksNumber;
    private int dexterityLevel;
    private int goldNumber = 0;

    public Player(String name, int dexterityLevel, int lockpicksNumber) {
        this.name = name;
        this.dexterityLevel = dexterityLevel;
        this.lockpicksNumber = lockpicksNumber;
    }

    public String getName() {
        return name;
    }

    public int getLockpicksNumber() {
        return lockpicksNumber;
    }

    public void brokenLockpick() {
        if (dexterityLevel > random.nextInt(100)) {
            lockpicksNumber--;
            System.out.println("Złamałeś wytrych...");
        }
    }

    public void addLockpick(int newLockpicks) {
        lockpicksNumber += newLockpicks;
    }

    public int getDexterityLevel() {
        return dexterityLevel;
    }

    public void addDexterity() {
        if (dexterityLevel < 80 && dexterityLevel < random.nextInt(100)) {
            dexterityLevel++;
            System.out.println("Czegoś się nauczyłeś!");
        }
    }

    public int getGoldNumber() {
        return goldNumber;
    }

    public void addGold(int newGold) {
        goldNumber += newGold;
    }

    @Override
    public String toString() {
        return "Gracz " + name +
                " ma " + lockpicksNumber +
                " wytrychów i zręczność na poziomie " + dexterityLevel +
                '.' + " Gracz ma " + goldNumber + " złota\n";
    }
}
