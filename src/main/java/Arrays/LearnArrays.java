package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LearnArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;

        System.out.print("Size of the Array: ");
        int len = scanner.nextInt();

        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            sum += array[i];
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Sum of the elements: " + sum);
    }
}
