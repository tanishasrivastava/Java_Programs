import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
public class java {
    public static void main(String[] args) {
    	
        HashSet<String> dictionary = new HashSet<>();
        
        // Reading the dictionary.txt file.
        try (Scanner dictionaryScanner = new Scanner(new File("dictionary.txt"))) {
            while (dictionaryScanner.hasNext()) {
                String word = dictionaryScanner.next().toLowerCase();
                dictionary.add(word);
            }
        } 
        catch (FileNotFoundException e) {
            System.out.println("the dictionary.txt file is not found.");
            return;
        }

        //Checking misspelled words in words.txt
        try (Scanner wordsScanner = new Scanner(new File("words.txt"))) {
            while (wordsScanner.hasNext()) {
                String word = wordsScanner.next().toLowerCase();
                if (!dictionary.contains(word)) {
                    System.out.println("Misspelled word: " + word);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("the words.txt file is not found.");
        }
    }
}
