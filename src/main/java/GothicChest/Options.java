package GothicChest;

import java.io.IOException;

public class Options {
    public void help() {
        System.out.println("Otwórz skrzynię przekręcając wytrych w lewo lub w prawo. \n" +
                "Gdy się pomylisz musisz zacząć otwierać skrzynie od początku. Zły ruch może złamać wytrych. " +
                "Im więcej masz umiejętności tym rzadziej będziesz je łamać. \nW grze używaj: \n" +
                " P - skręcisz wytrychem w prawo\n"+
                " L - skręcisz wytrychem w lewo\n" +
                " H - otworzysz pomoc \n" +
                " W - wyświetlisz ile zostało ci wytrychów \n" +
                " D - wyświetlisz poziom twojej zręczności \n" +
                " Q - zakończysz grę\n"
        );
    }

    public static void clearConsole(){
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {
            System.out.println(":(");
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
