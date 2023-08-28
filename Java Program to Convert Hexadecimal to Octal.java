import java.util.Scanner;
import java.lang.Math;

public class CodesCracker
{
   public static void main(String[] args)
   {
      int decimal=0, rem, i=0, len;
      String hexadecimal;
      int[] octal = new int[20];
      
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter the Hexadecimal Number: ");
      hexadecimal = s.nextLine();
      
      len = hexadecimal.length();
      len--;
      
      while(len>=0)
      {
         rem = hexadecimal.charAt(len);
         if(rem>=48 && rem<=57)
            rem = rem-48;
         else if(rem>=65 && rem<=70)
            rem = rem-55;
         else if(rem>=97 && rem<=102)
            rem = rem-87;
         else
         {
            System.out.println("\nInvalid Hexadecimal Digit!");
            return;
         }
         decimal = (int) (decimal + (rem*Math.pow(16, i)));
         i++;
         len--;
      }
      
      i=0;
      while(decimal!=0)
      {
         octal[i] = decimal%8;
         i++;
         decimal = decimal/8;
      }
      
      System.out.print("\nEquivalent Octal Value = ");
      for(i=(i-1); i>=0; i--)
         System.out.print(octal[i]);
   }
}
