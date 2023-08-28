import java.util.Scanner;

public class CodesCracker
{
   public static void main(String[] args)
   {
      String strOne, strTwo, strTemp;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the First String: ");
      strOne = scan.nextLine();
      System.out.print("Enter the Second String: ");
      strTwo = scan.nextLine();
      
      System.out.println("\nString before Swap:");
      System.out.println("strOne = " +strOne);
      System.out.println("strTwo = " +strTwo);
      
      strTemp = strOne;
      strOne = strTwo;
      strTwo = strTemp;
      
      System.out.println("\nString after Swap:");
      System.out.println("strOne = " +strOne);
      System.out.println("strTwo = " +strTwo);
   }
}
