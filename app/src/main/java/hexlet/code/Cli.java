package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String greeting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName);
        return userName;
    }
}
