import java.util.Scanner;

public class CodesCracker
{
   public static void main(String[] args)
   {
      String str;
      char ch;
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter the String: ");
      str = s.nextLine();
      
      System.out.println("\nNumbers available in the String are:");
      for(int i=0; i<str.length(); i++)
      {
         ch = str.charAt(i);
         if(Character.isDigit(ch))
            System.out.print(ch);
      }
   }
}
