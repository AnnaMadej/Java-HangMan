package pl.edu.agh.hangman;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Set;

public class BoardPrinter {

    public static final String[] HANGMANPICS = new String[]{
            "  +---+\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " /    |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " / \\  |\n" +
                    "      |\n" +
                    "========"
    };

    public static final String[] FACESPICS = new String[]{
            "\\( ﾟ▽ﾟ)/",
            "(｡•́︿•̀｡)"
    };

    private String drawLines(String currentWord, Set<Integer> guessedLetters) {
        StringBuilder lines = new StringBuilder();
        for (int i = 0; i < currentWord.length(); i++) {
            if (guessedLetters.contains(i)) lines.append(currentWord.charAt(i));
            else lines.append("_");
            lines.append(" ");
        }
        return lines.toString();
    }

    public void printHangMan(String currentWord, Set<Integer> guessedLetters, int tryNumber) throws IOException {
        String hangmanPic = HANGMANPICS[tryNumber];
        BufferedReader bufReader = new BufferedReader(new StringReader(hangmanPic));

        String line = null;
        int lineNumber = 0;
        while ((line = bufReader.readLine()) != null) {
            if (lineNumber == 2) System.out.println(line + "     " + drawLines(currentWord, guessedLetters));
            else System.out.println(line);
            lineNumber++;
        }

    }

    public void printResult(boolean winner) {
        System.out.println();
        if (winner) System.out.println(FACESPICS[0]);
        else System.out.println(FACESPICS[1]);
        System.out.println();

    }

}
