package basics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // System.out.println("Hello, world!");
        // String currentUTF = System.getProperty("file.encoding");
        // String mode = System.getProperty("mode");

        // System.out.println(currentUTF);
        // System.out.println(mode);

        // Create a Scanner object to read input
        Scanner in = new Scanner(System.in);

        // Read the next integer
        int n = in.nextInt();

        // Compute and print the square of n
        System.out.println(n * n);
        // Compute and print the cube of n
        System.out.println(n * n * n);
        // Compute and print the fourth power of n
        System.out.println(n * n * n * n);

        in.close();
    }
}
