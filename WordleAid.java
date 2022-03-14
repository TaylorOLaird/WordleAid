import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordleAid {
    public static void main(String[] args) {
        String fileName = "wordle-allowed-guesses.txt";
        int[] memo = getCharCount(fileName);
        Node[] nodeList = getNodeList(memo);

        return;
    }

    private static int[] getCharCount(String fileName) {
        Scanner in = null;
        try {
            in = new Scanner(new File("./" + fileName));
        } catch (FileNotFoundException s) {
            System.out.println("File does Not Exist, error: " + s);
        }

        int alphaBase = 26;
        int[] memo = new int[alphaBase];

        while (in.hasNextLine()) {
            String word = in.nextLine();
            for (int currentChar = 0; currentChar < word.length(); currentChar++) {
                memo[(int) (word.charAt(currentChar)) - (int) 'a']++;
            }
        }

        return memo;
    }

    public static Node[] getNodeList(int[] memo) {
        Node[] nodeList = new Node[memo.length];

        for (int i = 0; i < nodeList.length; i++)
            nodeList[i] = new Node((char) (i + (int) 'a'), memo[i]);

        return nodeList;
    }
}
