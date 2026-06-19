package methods;

public class EvenOrOdd {
    public static void main(String[] args) {
        String result = findEvenOrOdd(11);
        System.out.println(result);
    }

    static String findEvenOrOdd(int num) {
        if (num % 2 == 0)
            return "Even";
        else
            return "Odd";
    }
}
