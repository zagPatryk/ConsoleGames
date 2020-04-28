package RockPaperScissors;

public class Round implements GameBase{
    private Move playerMove;
    private Move computerMove;

    public Round(Move playerMove, Move computerMove) {
        this.playerMove = playerMove;
        this.computerMove = computerMove;
    }

    public Move getPlayerMove() {
        return playerMove;
    }

    public Move getComputerMove() {
        return computerMove;
    }
}
