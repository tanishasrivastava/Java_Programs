import java.util.Scanner;

public class CodesCracker
{
   public static void main(String[] args)
   {
      int binnum, hexDigit=0, m=1, c=1, rem, i=0;
      char[] hexnum = new char[20];
      
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the Binary Number: ");
      binnum = scan.nextInt();
      
      while(binnum!=0)
      {
         rem = binnum%10;
         hexDigit = hexDigit + (rem*m);
         if(c%4==0)
         {
            if(hexDigit<10)
               hexnum[i] = (char)(hexDigit+48);
            else
               hexnum[i] = (char)(hexDigit+55);
            m = 1;
            c = 1;
            hexDigit = 0;
            i++;
         }
         else
         {
            m = m*2;
            c++;
         }
         binnum = binnum/10;
      }
      
      if(c!=1)
         hexnum[i] = (char)(hexDigit+48);
      if(c==1)
         i--;
      
      System.out.print("\nEquivalent Hexadecimal Value = ");
      for(i=1; i>=0; i--)
         System.out.print(hexnum[i]);
   }
}
