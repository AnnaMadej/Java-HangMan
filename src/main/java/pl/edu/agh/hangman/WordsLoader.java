package pl.edu.agh.hangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordsLoader {

    public List<String> loadWords(String path) throws FileNotFoundException {
        File file = new File(path);
        List<String> words = new ArrayList<>();
        Scanner fileReader = new Scanner(file);
        while (fileReader.hasNextLine()) {
            words.add(fileReader.nextLine().toUpperCase());
        }
        return words;
    }

}
