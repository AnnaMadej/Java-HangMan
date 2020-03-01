package pl.edu.agh.hangman;

import java.io.IOException;

public class Hangman {

    private WordsPicker wordsPicker;
    private BoardPrinter boardPrinter;
    private UserInputReceiver userInputReceiver;
    private TriesCounter triesCounter;
    private WordChecker wordChecker;

    public void play() throws IOException {
        while (true) {
            playNewWord();
        }
    }

    private void playNewWord() throws IOException {
        String currentWord = wordsPicker.pickAWord();
        wordChecker.startNewWord(currentWord);

        do {
            boardPrinter.printHangMan(wordChecker.getCurrentWord(), wordChecker.getGuessedLetters(), triesCounter.getTryNumber() );
            char userInput = userInputReceiver.inputFirstLetter();
            wordChecker.guessLetter(userInput);

        } while (wordChecker.getGuessedLetters().size() != wordChecker.getCurrentWord().length() && triesCounter.getTryNumber() < triesCounter.getMaxNumberOfTries());
        boardPrinter.printHangMan(wordChecker.getCurrentWord(), wordChecker.getGuessedLetters(), triesCounter.getTryNumber() );


        boolean isWinner = triesCounter.checkIfWinner();
        boardPrinter.printResult(isWinner);
    }


    public Hangman(WordsPicker wordsPicker, BoardPrinter boardPrinter, UserInputReceiver userInputReceiver, TriesCounter triesCounter, WordChecker wordChecker) {
        this.wordsPicker = wordsPicker;
        this.boardPrinter = boardPrinter;
        this.userInputReceiver = userInputReceiver;
        this.triesCounter = triesCounter;
        this.wordChecker = wordChecker;
    }
}
