import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      String str, word;
      int wordsLen, i, count=0;
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter the String: ");
      str = s.nextLine();
      System.out.print("\nEnter a Word to Find its Occurrence: ");
      word = s.next();
      
      String words[] = str.split(" ");
      wordsLen = words.length;
      
      for(i=0; i<wordsLen; i++)
      {
         if(word.equals(words[i]))
            count++;
      }
      
      System.out.println("\nTotal Occurrences = " +count);
   }
}
