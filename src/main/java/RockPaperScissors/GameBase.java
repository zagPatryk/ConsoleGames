package RockPaperScissors;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public interface GameBase {
    Scanner scanner = new Scanner(System.in);
    Game game = new Game();
    Random random = new Random();
    Map<Round, Result> gameMap = new HashMap<Round, Result>() {
        {
            put(new Round(Move.ROCK, Move.ROCK), Result.Draw);
            put(new Round(Move.ROCK, Move.PAPER), Result.ComputerWin);
            put(new Round(Move.ROCK, Move.SCISSORS), Result.PlayerWin);
            put(new Round(Move.PAPER, Move.ROCK), Result.PlayerWin);
            put(new Round(Move.PAPER, Move.PAPER), Result.Draw);
            put(new Round(Move.PAPER, Move.SCISSORS), Result.ComputerWin);
            put(new Round(Move.SCISSORS, Move.ROCK), Result.ComputerWin);
            put(new Round(Move.SCISSORS, Move.PAPER), Result.PlayerWin);
            put(new Round(Move.SCISSORS, Move.SCISSORS), Result.Draw);
        }
    };

    Map<Move, Move> winningMove = new HashMap<Move, Move>() {
        {
            put(Move.ROCK, Move.PAPER);
            put(Move.PAPER, Move.SCISSORS);
            put(Move.SCISSORS, Move.ROCK);
        }
    };

    enum Move {
        ROCK, PAPER, SCISSORS;
        public static Move getRandomMove() {
            return values()[random.nextInt(values().length)];
        }
    }

    enum Result {
        PlayerWin, ComputerWin, Draw;
    }
}
