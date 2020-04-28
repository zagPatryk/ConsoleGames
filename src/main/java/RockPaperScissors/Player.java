package RockPaperScissors;

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

    public Move getMove() {
        return move;
    }

    public void setMove() {
        System.out.println("Rock, paper or scissors? Chose");
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
                default:
                    System.out.println("Rock, paper or scissors? Type R, P or S");
                    break;
            }
        }
    }

}
