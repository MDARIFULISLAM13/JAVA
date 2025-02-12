package Array;

import java.util.Scanner;
import java.util.Arrays;

public class array {

    public static void main(String[] args) {
        // Declare and initialize the array
        int[] arr = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Create Scanner object to read input
        Scanner scn = new Scanner(System.in);

        // Take input for the size of the array
        int n = scn.nextInt();

        // Consume the newline character left by nextInt()
        scn.nextLine();

        // Create an array of size n
        String[] Name = new String[n];

        // Take input for each name
        for (int i = 0; i < n; i++) {
            Name[i] = scn.nextLine();  // Read the name input
        }
Arrays.sort(Name);
        // Output the entered names
        for (int i = 0; i < n; i++) {
            System.out.println(Name[i]);
        }

    }
}
