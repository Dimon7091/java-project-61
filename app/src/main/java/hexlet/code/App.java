package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Even;
import hexlet.code.games.Calculator;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");
        String choice = scanner.next();
        System.out.println("Your choice: " + choice);
        int numberOfGame = Integer.parseInt(choice);
        switch (numberOfGame) {
            case 1:
                Cli.greeting();
                break;
            case 2:
                Even.game();
                break;
            case 3:
                Calculator.game();
                break;
            case 4:
                Gcd.game();
                break;
            case 5:
                Progression.game();
                break;
            case 6:
                Prime.game();
                break;
            case 0:
                break;
            default:
                System.out.println("Game not found");
        }
    }
}
