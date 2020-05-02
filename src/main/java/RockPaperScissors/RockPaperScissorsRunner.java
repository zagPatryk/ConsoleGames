package RockPaperScissors;

public class RockPaperScissorsRunner implements GameBase{
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Player player = new Player(scanner.nextLine());

        System.out.println("How many points do we play?");
        game.setPointsToWin();

        System.out.println("Choose a difficulty level of the new game: \n 1 - Easy \n 2 - Hard\n ");
        Computer computer = new Computer();
        computer.setComputerDifficult();

        boolean breaker = false;
        while (!breaker) {
            System.out.println("Menu: \n 1 - Play new game \n 2 - Change difficult \n 3 - Change game length " +
                    "\n Q - Quit the game");
            switch (scanner.nextLine()) {
                case "1":
                    game.playGame(player, computer);
                    break;
                case "2":
                    System.out.println("Choose a difficulty level of the new game: \n 1 - Easy \n 2 - Hard\n ");
                    computer.setComputerDifficult();
                    break;
                case "3":
                    System.out.println("How many points do we play?");
                    game.setPointsToWin();
                    break;
                case "Q":
                    breaker = true;
                    break;
                default:
                    System.out.println("Type: 1, 2, 3 or Q.");
                    break;
            }
        }
    }
}


