package RockPaperScissors;

public class RockPaperScissorsRunner implements GameBase{
    public static void main(String[] args) {

        System.out.println("What's your name?");
        Player player = new Player(scanner.nextLine());
        Computer computer = new Computer();
        int pointsToWin = 10;

        System.out.println("Choose a difficulty level of the new game: \n 1 - Easy \n 2 - Hard\n ");
        computer.setComputerDifficult();
        Game game = new Game();
        game.playGame(player, computer, pointsToWin);
    }
}


