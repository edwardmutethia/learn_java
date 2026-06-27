package arrays;

import java.util.Arrays;

public class ArrayAsParam {

    public static void swapFirstAndLastElement(int[] nums) {
        if (nums.length < 1) {
            return;
        }

        int temp = nums[nums.length - 1];
        nums[nums.length - 1] = nums[0];
        nums[0] = temp;
    }

    public static void printNumberOfArguments(int... numbers) {
        System.out.println(numbers.length);
    }
    
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Before swapping: " + Arrays.toString(numbers));

        swapFirstAndLastElement(numbers);

        System.out.println("After swapping: " + Arrays.toString(numbers));

        printNumberOfArguments(1,2,4);
        printNumberOfArguments(new int[] {1,3,4,5,6,7,8});
    }
}