package pl.edu.agh.hangman;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

public class Demo {

    private static WordsLoader wordsLoader;
    private static Hangman hangman;

    public static void main(String[] arg) {

        wordsLoader = new WordsLoader();
        WordsPicker wordsPicker = new WordsPicker();
        BoardPrinter boardPrinter = new BoardPrinter();
        UserInputReceiver userInputReceiver = new UserInputReceiver();
        TriesCounter triesCounter = new TriesCounter();
        WordChecker wordChecker = new WordChecker(triesCounter);
        hangman = new Hangman(wordsPicker, boardPrinter, userInputReceiver, triesCounter, wordChecker);

        try {
            List<String> words = wordsLoader.loadWords("src/main/resources/slowa.txt");
            wordsPicker.setWords(words);
        } catch (FileNotFoundException e) {
            System.out.println("Nie można załadować listy słów z pliku!");
        }

        try {
            hangman.play();
        } catch (NoSuchElementException e) {
            System.out.println("Lista słów nie istnieje!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
