import java.util.Scanner;

public class CodesCracker
{
   public static void main(String[] args)
   { 
      int decimal, rem, i=0;
      int[] octal = new int[20];
      
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the Decimal Number: ");
      decimal = scan.nextInt();
      
      while(decimal != 0)
      {
         rem = decimal%8;
         octal[i] = rem;
         i++;
         decimal = decimal/8;
      }
      
      System.out.print("\nEquivalent Octal Value = ");
      for(i=(i-1); i>=0; i--)
         System.out.print(octal[i]);
   }
}
