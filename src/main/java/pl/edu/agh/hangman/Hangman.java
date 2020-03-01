package pl.edu.agh.hangman;

import java.io.IOException;

public class Hangman {

    private WordsPicker wordsPicker;
    private BoardPrinter boardPrinter;
    private UserInputReceiver userInputReceiver;
    private TriesCounter triesCounter;
    private WordChecker wordChecker;

    public void play(){
    }

    private void playNewWord(){
	
    }


    public Hangman(WordsPicker wordsPicker, BoardPrinter boardPrinter, UserInputReceiver userInputReceiver, TriesCounter triesCounter, WordChecker wordChecker) {
        this.wordsPicker = wordsPicker;
        this.boardPrinter = boardPrinter;
        this.userInputReceiver = userInputReceiver;
        this.triesCounter = triesCounter;
        this.wordChecker = wordChecker;
    }
}
