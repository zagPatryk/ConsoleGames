package RockPaperScissors;

import java.util.InputMismatchException;

public class Game implements GameBase {
    private int pointsToWin;

    public void playGame(Player player, Computer computer) {
        boolean breaker = false;
        while (computer.getPointsNumber() != pointsToWin && player.getPointsNumber() != pointsToWin && !breaker) {
            if (!player.setMove()) {
                breaker = true;
            } else {
                Move computerMove = computer.getComputerMove(player.getMove());
                System.out.println(player.getName() + ": " + player.getMove());
                System.out.println("Computer: " + computerMove);

                Result result = gameMap.get(new Round(player.getMove(), computerMove));
                System.out.println(result);
                switch (result) {
                    case PlayerWin:
                        player.addPoint();
                        break;
                    case ComputerWin:
                        computer.addPoint();
                        break;
                    default:
                        break;
                }
                System.out.println(player.getName() + " " + player.getPointsNumber() + " : " + computer.getPointsNumber() +
                        " Computer");
            }
        }

        if (!breaker && computer.getPointsNumber() == pointsToWin) {
            System.out.println("Computer WIN! \n");
        } else if (!breaker && player.getPointsNumber() == pointsToWin) {
            System.out.println(player.getName() + " WIN! \n");
        }

        player.zeroPoints();
        computer.zeroPoints();
    }

    public void setPointsToWin() {
        pointsToWin = -3;
        try {
            while (pointsToWin <= 0) {
                pointsToWin = scanner.nextInt();
                if (pointsToWin <= 0) {
                    System.out.println("Write a number greater than zero");
                }
            }
        } catch (InputMismatchException e) {
            pointsToWin = 3;
            System.out.println("The default 3 length has been set");
        }
    }
}
