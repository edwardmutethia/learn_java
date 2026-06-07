package basics;

import java.util.Scanner;

public class Greating {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, " + scanner.nextLine() + "! I'm " + scanner.nextLine() + "!");

        scanner.close();
    }
}
