package RockPaperScissors;

public class Computer implements GameBase {
    private int difficultLevel;
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

    public int getPointsNumber() {
        return pointsNumber;
    }

    public void addPoint() {
        pointsNumber++;
    }

    public Move getComputerMove(Move playerMove){
        if (difficultLevel == 1) {
            return Move.getRandomMove();
        } else {
            int randomInt = random.nextInt(4);
            switch (randomInt) {
                case 0:
                case 1:
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
            return Move.getRandomMove();
        }

    }
}
