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
        boolean guessed = false;
        for (int i = 0; i < getCurrentWord().length(); i++) {
            if (!guessedLetters.contains(i)){
                if (getCurrentWord().charAt(i) == Character.toUpperCase(guessedLetter)) {
                    guessedLetters.add(i);
                    guessed = true;
                }
            }
        }
        if (!guessed) triesCounter.incTryNumber();
    }


    public void fillKnownSigns(){
        for (int i = 0; i < getCurrentWord().length(); i++) {
            char currentChar = currentWord.charAt(i);
            if ( currentChar == ' ' || currentChar == '-'){
                guessedLetters.add(i);
            }
        }
    }


    public void startNewWord(String word) {
        //triesCounter.setTryNumber(0);
        setGuessedLetters(new HashSet<>());
        currentWord = word;
        fillKnownSigns();
    }



}
