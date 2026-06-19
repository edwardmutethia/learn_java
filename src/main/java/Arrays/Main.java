/**
 * Arrays are used to store multiple values in a single variable
 * instead of declaring separate variables for each value
 */
package Arrays;

import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Mazda", "Ford"};

        int[] myNum = {1,2,3,4,5,6};

        System.out.println(Arrays.toString(cars));
        System.out.println(Arrays.toString(myNum));
        System.out.println(myNum.length);
    }
}
