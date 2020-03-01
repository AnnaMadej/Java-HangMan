package pl.edu.agh.hangman;

import java.util.HashSet;
import java.util.Set;

public class WordChecker {
    private String currentWord;
    private Set<Integer> guessedLetters;
    private TriesCounter triesCounter;


    public WordChecker(TriesCounter triesCounter) {
        this.triesCounter = triesCounter;
    }

    public String getCurrentWord() {
        return currentWord;
    }

    public  Set<Integer> getGuessedLetters() {
        return guessedLetters;
    }

    public void setGuessedLetters(Set<Integer> guessedLetters) {
        this.guessedLetters = guessedLetters;
    }


    public void guessLetter(char guessedLetter) {
    }


    public void fillKnownSigns(){
    }


    public void startNewWord(String word) {

    }



}
