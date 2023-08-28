import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      int n, r, ncr, fact=1, numerator, denominator, i=1, sub;
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter the Value of n: ");
      n = s.nextInt();
      System.out.print("Enter the Value of r: ");
      r = s.nextInt();
      
      while(i<=n)
      {
         fact = fact*i;
         i++;
      }
      numerator = fact;       // n!
      sub = n-r;
      fact = 1;
      i = 1;
      while(i<=sub)
      {
         fact = fact*i;
         i++;
      }
      denominator = fact;     // (n-r)!
      fact = 1;
      i = 1;
      while(i<=r)
      {
         fact = fact*i;
         i++;
      }
      denominator = (fact*denominator);    // r!(n-r)!
      ncr = numerator/denominator;
      
      System.out.println("\nnCr = " +ncr);
   }
}
