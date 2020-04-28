package RockPaperScissors;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public interface GameBase {
    Scanner scanner = new Scanner(System.in);
    Game game = new Game();
    Random random = new Random();
    Map<Round, Result> gameMap = new HashMap<>();

    enum Move {
        ROCK, PAPER, SCISSORS;
        public static Move getRandomMove() {
            return values()[random.nextInt(values().length)];
        }
    }

    enum Result {
        PlayerWin, ComputerWin, Draw;
    }

    static void gameResults() {
        gameMap.put(new Round(Move.ROCK, Move.ROCK), Result.Draw);
        gameMap.put(new Round(Move.ROCK, Move.PAPER), Result.ComputerWin);
        gameMap.put(new Round(Move.ROCK, Move.SCISSORS), Result.PlayerWin);
        gameMap.put(new Round(Move.PAPER, Move.ROCK), Result.PlayerWin);
        gameMap.put(new Round(Move.PAPER, Move.PAPER), Result.Draw);
        gameMap.put(new Round(Move.PAPER, Move.SCISSORS), Result.ComputerWin);
        gameMap.put(new Round(Move.SCISSORS, Move.ROCK), Result.ComputerWin);
        gameMap.put(new Round(Move.SCISSORS, Move.PAPER), Result.PlayerWin);
        gameMap.put(new Round(Move.SCISSORS, Move.SCISSORS), Result.Draw);
    }
}
