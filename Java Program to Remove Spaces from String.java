import java.util.Scanner;

public class CodesCracker
{
   public static void main(String[] args)
   {
      String str;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the String: ");
      str = scan.nextLine();
      
      str = str.replaceAll(" ", "");
      
      System.out.println("\nString without Spaces = " +str);
   }
}
