package classes;

import static java.util.Arrays.*;

public class Main {

    static void main(String[] args) {
        int[] numbers = {10, 4, 5, 47, 5, 12};

        sort(numbers); // Instead of Arrays.sort(numbers)

        int[] copy = copyOf(numbers, numbers.length); // Instead of Arrays.copyOf(numbers, numbers.length)

    }
}
