import java.util.Scanner;

public class CodesCracker
{
   public static void main(String[] args)
   { 
      int decimal, rem, i=0;
      char[] hexadecimal = new char[20];
      
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the Decimal Number: ");
      decimal = scan.nextInt();
      
      while(decimal!=0)
      {
         rem = decimal%16;
         if(rem<10)
            rem = rem+48;
         else
            rem = rem+55;
         hexadecimal[i] = (char)rem;
         i++;
         decimal = decimal/16;
      }
      
      System.out.print("\nEquivalent Hexadecimal Value = ");
      for(i=(i-1); i>=0; i--)
         System.out.print(hexadecimal[i]);
   }
}
