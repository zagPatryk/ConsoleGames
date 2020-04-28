package GothicChest;

public class GameRunner implements GameBase {

    public static void main(String[] args) {
        boolean breaker = false;

        Player player = playerCreator.playerCreator();
        System.out.println(player);
        options.help();

        // umożliwić pokazanie zręczności w menu i poziomu golda i wytrychów
        // coś zrobić żeby wyszyścić koonsole po nieudanych ruchu by utrudnić
        // dodać dźwięki zamiast tekstów

        while (!breaker && player.getLockpicksNumber() > 0) {
            if (player.getLockpicksNumber() == 0) {
                breaker = true;
            }
            System.out.println("Jaki zamek chcesz otworzyć?\n 1 - Prosty \n 2 - Klasyczny \n 3 - Prawdziwe wyzwanie \n" +
                    " Q - Koniec gry" );
            switch (scanner.nextLine()) {
                case "1":
                    game.playGame(player,4);
                    break;
                case "2":
                    game.playGame(player,8);
                    break;
                case "3":
                    game.playGame(player,15);
                    break;
                case "Q":
                    breaker = true;
                    break;
                default:
                    break;
            }
        }
        System.out.println(player);
    }
}
