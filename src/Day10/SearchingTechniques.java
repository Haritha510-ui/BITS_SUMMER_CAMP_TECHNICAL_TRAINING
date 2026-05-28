package Day10;

import java.util.Scanner;

public class SearchingTechniques {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int target = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int idx = -1;

        for (int j = 0; j < n; j++) {
            if (arr[j] == target) {
                idx = j;
                break;
            }
        }

        if (idx != -1) {
            System.out.println("Element found at index: " + idx);
        } else {
            System.out.println("Element not found in the array.");
        }

        scanner.close();
    }
}