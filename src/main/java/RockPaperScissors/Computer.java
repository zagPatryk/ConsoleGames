package RockPaperScissors;

import java.util.Objects;

public class Computer implements GameBase {
    private int difficultLevel = 1;
    private int pointsNumber;
    private Move move;

    public void setComputerDifficult() {
        boolean end = false;
        while (!end) {
            switch (scanner.nextLine()) {
                case "1":
                    difficultLevel = 1;
                    end = true;
                    break;
                case "2":
                    difficultLevel = 2;
                    end = true;
                    break;
                default:
                    System.out.println("Type: 1 or 2 to chose difficulty level.");
                    break;
            }
        }
    }

    public Move getComputerMove(Move playerMove){
        if (difficultLevel == 1) {
            return Move.getRandomMove();
        } else {
            int randomInt = random.nextInt(4);
            switch (randomInt) {
                case 0:
                case 1:
                    move = winningMove.get(playerMove);
                    break;
                case 2:
                    move = playerMove;
                    break;
                case 3:
                    break;
                default:
                    move = playerMove;
                    break;
            }
            return move;
        }

    }

    public void addPoint() {
        pointsNumber++;
    }

    public void zeroPoints() {
        pointsNumber = 0;
    }

    public int getPointsNumber() {
        return pointsNumber;
    }

}
