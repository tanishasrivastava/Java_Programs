import java.util.Scanner;
import java.lang.Math;

public class Main
{
   public static void main(String[] args)
   {
      int decimal=0, i=0, len, rem;
      String hexadecimal;
      
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
      
      System.out.println("\nEquivalent Decimal Value = " +decimal);
   }
}
