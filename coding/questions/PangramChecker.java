package coding.questions;

// Write a program to check whether given String is pangram or not

// A pangram is a sentence that contains all alphabets i.e from A to Z


public class PangramChecker {

    public static void main(String[] args) {

        String s = "The quick brown fox jumps over lazy dog";
        System.out.println("Given string is Pangram: " + checkIfPangram(s.toLowerCase()));
    }

    private static boolean checkIfPangram(String s) {
        if (s.length() < 26)
            return false;

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (s.indexOf(ch) < 0)
                return false;
        }
        return true;
    }
}