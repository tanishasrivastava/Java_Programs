import java.util.Scanner;

public class CodesCracker
{
   public static void main(String[] args)
   { 
      int i=0, len;
      String hexadecimal;
      
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter the Hexadecimal Number: ");
      hexadecimal = s.nextLine();
      
      len = hexadecimal.length();
      char[] hexDigit = hexadecimal.toCharArray();
      
      System.out.print("\nEquivalent Binary Value = ");
      while(i<len)
      {
         switch(hexDigit[i])
         {
            case '0':
               System.out.print("0000");
               break;
            case '1':
               System.out.print("0001");
               break;
            case '2':
               System.out.print("0010");
               break;
            case '3':
               System.out.print("0011");
               break;
            case '4':
               System.out.print("0100");
               break;
            case '5':
               System.out.print("0101");
               break;
            case '6':
               System.out.print("0110");
               break;
            case '7':
               System.out.print("0111");
               break;
            case '8':
               System.out.print("1000");
               break;
            case '9':
               System.out.print("1001");
               break;
            case 'a':
            case 'A':
               System.out.print("1010");
               break;
            case 'b':
            case 'B':
               System.out.print("1011");
               break;
            case 'c':
            case 'C':
               System.out.print("1100");
               break;
            case 'd':
            case 'D':
               System.out.print("1101");
               break;
            case 'e':
            case 'E':
               System.out.print("1110");
               break;
            case 'f':
            case 'F':
               System.out.print("1111");
               break;
            default:
               System.out.println("\nInvalid Hexadecimal Digit!");
               return;
         }
         i++;
      }
   }
}
