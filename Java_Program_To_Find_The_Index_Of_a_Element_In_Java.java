import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element whose index is need to be found: ");
        int x = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("x found at " + i);

            }
        }
    }
}
