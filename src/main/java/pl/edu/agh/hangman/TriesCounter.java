package pl.edu.agh.hangman;

public class TriesCounter {

    private int maxNumberOfTries = 6;
    private int tryNumber = 0;

    public int getTryNumber() {
        return tryNumber;
    }

    public void setTryNumber(int tryNumber) {
        this.tryNumber = tryNumber;
    }

    public void incTryNumber(){
        tryNumber = tryNumber+1;
    }
    public int getMaxNumberOfTries() {
        return maxNumberOfTries;
    }

    public boolean checkIfWinner() {
        return getTryNumber() < maxNumberOfTries;
    }
}
