public class CodesCracker
{
   public static void main(String[] args)
   {
      int val, i, totalDigit, r, temp, rem, pow, k;
      
      System.out.println("Armstrong Numbers between 1 to 1000 are:");
      for(i=1; i<=1000; i++)
      {
         totalDigit=0;
         r=0;
         val = i;
         temp = val;
         while(temp>0)
         {
            totalDigit++;
            temp = temp/10;
         }
         temp = val;
         while(temp>0)
         {
            rem = temp%10;
            pow = 1;
            k = 0;
            while(k<totalDigit)
            {
               pow = pow*rem;
               k++;
            }
            r = r+pow;
            temp = temp/10;
         }
         if(r==val)
            System.out.print(r+ " ");
      }
   }
}
