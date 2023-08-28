import java.util.Scanner;

public class CodesCracker
{
   public static void main(String[] args)
   {
      int binaryOne, binaryTwo, remOne, remTwo, i=0, carry=0;
      int[] res = new int[10];
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the First Binary Number: ");
      binaryOne = scan.nextInt();
      System.out.print("Enter the Second Binary Number: ");
      binaryTwo = scan.nextInt();
      
      while(binaryOne!=0)
      {
         remOne = binaryOne%10;
         remTwo = binaryTwo%10;
         if(remOne==0 && remTwo==0)
         {
            if(carry==0)
            {
               res[i] = (res[i]*10) + 0;
            }
            else
            {
               res[i] = (res[i]*10) + 1;
               carry = 0;
            }
         }
         else if(remOne==0 && remTwo==1)
         {
            if(carry==0)
            {
               res[i] = (res[i]*10) + 1;
            }
            else
            {
               res[i] = (res[i]*10) + 0;
               carry = 1;
            }
         }
         else if(remOne==1 && remTwo==0)
         {
            if(carry==0)
            {
               res[i] = (res[i]*10) + 1;
            }
            else
            {
               res[i] = (res[i]*10) + 0;
               carry = 1;
            }
         }
         else if(remOne==1 && remTwo==1)
         {
            if(carry==0)
            {
               res[i] = (res[i]*10) + 0;
               carry = 1;
            }
            else
            {
               res[i] = (res[i]*10) + 1;
               carry = 1;
            }
         }
         else
         {
            System.out.println("\nInvalid Input!");
            return;
         }
         binaryOne = binaryOne/10;
         binaryTwo = binaryTwo/10;
         i++;
      }
      if(carry==1)
         res[i] = (res[i]*10) + 1;
      System.out.print("\nResult = ");
      while(i>=0)
      {
         System.out.print(res[i]);
         i--;
      }
   }
}
