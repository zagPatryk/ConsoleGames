package RockPaperScissors;

import java.util.Objects;

public class Player implements GameBase {
    private final String name;
    private int pointsNumber = 0;
    private Move move;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPointsNumber() {
        return pointsNumber;
    }

    public void addPoint() {
        pointsNumber++;
    }

    public void zeroPoints() {
        pointsNumber = 0;
    }

    public Move getMove() {
        return move;
    }

    public boolean setMove() {
        System.out.println("Rock, paper or scissors? Chose. Type Q to exit.");
        boolean breaker = false;
        while (!breaker) {
            String input = scanner.nextLine();
            switch(input){
                case "R":
                    move = Move.ROCK;
                    breaker = true;
                    break;
                case "P":
                    move = Move.PAPER;
                    breaker = true;
                    break;
                case "S":
                    move = Move.SCISSORS;
                    breaker = true;
                    break;
                case "Q":
                    return false;
                default:
                    System.out.println("Rock, paper or scissors? Type R, P, S or Q");
                    break;
            }
        }
        return true;
    }
}
