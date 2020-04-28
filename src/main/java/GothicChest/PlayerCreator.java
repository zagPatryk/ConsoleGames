package GothicChest;

public class PlayerCreator implements GameBase {
    public Player playerCreator() {
        System.out.println("Jak się nazywasz?");
        String name = scanner.nextLine();
        System.out.println("Jesteś zręczny?\n 1 - Mam zręczne palce \n 2 - Nie jest tak źle \n 3 - Mam zesztywniałe palce");
        int dexterity = 0;
        while (dexterity == 0) {
            switch (scanner.nextLine()) {
                case "1":
                    dexterity = 80;
                    break;
                case "2":
                    dexterity = 40;
                    break;
                case "3":
                    dexterity = 20;
                    break;
                default:
                    System.out.println("Wpisz 1, 2 lub 3 aby wybrać trudność początkową");
                    break;
            }
        }

        System.out.println("Ile masz wytrychów?\n 1 - Dużo \n 2 - Kilka \n 3 - Mało");
        int lockpicksNumber = 0;
        while (lockpicksNumber == 0) {
            switch (scanner.nextLine()) {
                case "1":
                    lockpicksNumber = 20;
                    break;
                case "2":
                    lockpicksNumber = 12;
                    break;
                case "3":
                    lockpicksNumber = 7;
                    break;
                default:
                    System.out.println("Wpisz 1, 2 lub 3 aby wybrać ilość początkową wytrychów");
                    break;
            }
        }
        return new Player(name, dexterity, lockpicksNumber);
    }
}
