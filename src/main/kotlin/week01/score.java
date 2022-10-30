package week01;

public class score {
    public static void main(String[] args) {
        int first = 4;//score of the first player
        int second = 5;//score of the second player
        boolean firstStarted = true;//variable telling which player started first
        int winner;//variable to store the winner
        // Script to determine the winner
        if (first > second) {
            winner = 1;
        } else if (second > first) {
            winner = 2;
        } else {
            if (firstStarted) {
                winner = 2;
            } else {
                winner = 1;
            }
        }
    }
}


