package RockPaperScissors;

import java.util.Objects;

public class Round implements GameBase {
    private Move playerMove;
    private Move computerMove;

    public Round(Move playerMove, Move computerMove) {
        this.playerMove = playerMove;
        this.computerMove = computerMove;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Round round = (Round) o;
        return playerMove == round.playerMove &&
                computerMove == round.computerMove;
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerMove, computerMove);
    }

    @Override
    public String toString() {
        return "Round{" +
                "playerMove=" + playerMove +
                ", computerMove=" + computerMove +
                '}';
    }

    public Move getPlayerMove() {
        return playerMove;
    }

    public Move getComputerMove() {
        return computerMove;
    }
}
