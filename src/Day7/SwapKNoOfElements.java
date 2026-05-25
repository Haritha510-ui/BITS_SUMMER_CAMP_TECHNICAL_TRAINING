package Day7;
import java.util.Scanner;

public class SwapKNoOfElements {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = 5;
        int[] arr = new int[size];

        System.out.println("Enter 5 elements:");

        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter k value:");
        int k = sc.nextInt();

        // Swapping first k elements with last k elements
        for(int i = 0; i < k; i++) {
            int temp = arr[i];
            arr[i] = arr[size - k + i];
            arr[size - k + i] = temp;
        }

        System.out.println("Array after swapping:");

        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
