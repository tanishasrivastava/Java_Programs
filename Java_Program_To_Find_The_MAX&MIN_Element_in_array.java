import java.util.Scanner;
 public class Main {
     public static void main(String[]args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the size of the array: ");
         int size =sc.nextInt();
         int arr[]= new int[size];
         for(int i=0;i<size;i++){
             arr[i] = sc.nextInt();
         }
         for(int i=0;i<size;i++) {
             System.out.println(arr[i]);
         }
              int min = Integer.MAX_VALUE;
              int max = Integer.MIN_VALUE;
             for(int i=0;i<size;i++){
                 if(arr[i]< min){
                     min = arr[i];
                 }
                 if(arr[i]> max) {
                     max = arr[i];
                 }
             }
             System.out.println("max element is :"+ max);
             System.out.println("min element is :"+ min);

         }


     }

