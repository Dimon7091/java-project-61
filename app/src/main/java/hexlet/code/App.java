package hexlet.code;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                0 - Exit""");
        String choice = scanner.next();
        System.out.println("Your choice: " + choice);
        if (choice.equals("1")) {
            Cli.greeting();
        } else if (choice.equals("2")) {
            Cli.greeting();
            Even.game();
        } else {
            System.out.println("Incorrect number!");

        }
    }
}
