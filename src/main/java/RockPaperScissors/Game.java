package RockPaperScissors;

public class Game implements GameBase{
    public void playGame(Player player, Computer computer, int pointsToWin) {
        boolean breaker = false;
        while (computer.getPointsNumber() != pointsToWin && player.getPointsNumber() != pointsToWin && !breaker) {
            player.setMove();
            System.out.println(gameMap.get(new Round(player.getMove(),computer.getComputerMove(player.getMove()))));
        }
    }
}
