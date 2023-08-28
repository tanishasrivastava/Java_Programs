import java.util.Scanner;

public class CodesCracker
{
   public static void main(String[] args)
   {
      String str, firstCharacter, remainingCharacters, capitalizedWord;
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter the String: ");
      str = s.nextLine();
      
      String words[] = str.split("\\s");
      
      System.out.println("\nThe string is capitalized. The new string is:");
      for(String word: words)
      {
         firstCharacter = word.substring(0, 1);
         firstCharacter = firstCharacter.toUpperCase();
         remainingCharacters = word.substring(1);
         capitalizedWord = firstCharacter + remainingCharacters;
         System.out.print(capitalizedWord + " ");
      }
   }
}
