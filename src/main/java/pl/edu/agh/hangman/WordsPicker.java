package pl.edu.agh.hangman;

import java.util.List;
import java.util.Random;

public class WordsPicker {
    private List<String> words;

    public void setWords(List<String> words) {
        this.words = words;
    }

    public String pickAWord() {
	return "Słowo!";
    }
}
