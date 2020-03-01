package pl.edu.agh.hangman;

import java.util.Scanner;

public class UserInputReceiver {

    private Scanner sc = new Scanner(System.in);

    public char inputFirstLetter() {
        System.out.print("guess>");
        String input = sc.next();
        return input.charAt(0);
    }
}
