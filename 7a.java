import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the text:");
        
        String text = scanner.nextLine();

        scanner.close();

        StringTokenizer tokenizer = new StringTokenizer(text, " .");

        Map<String, Integer> wordFrequency = new HashMap<>();

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken().toLowerCase();
            if (wordFrequency.containsKey(word)) {

                int count = wordFrequency.get(word);
                wordFrequency.put(word, count + 1);
            } else {

                wordFrequency.put(word, 1);
            }
        }
        System.out.println("Word Frequencies:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
