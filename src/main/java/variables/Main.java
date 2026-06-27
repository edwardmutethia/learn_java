package variables;

public class Main {

    static void main(String[] args) {
        /**
         * Constant variables - variables that should not be modified in a program
         * java provides a special keyword called 'final' to declare constant variables
         * Cannot reassign value to a constant variable
         */
        final double PI = 3.1415;
        final String HELLO_MSG = "Hello";

        // Final reference variable
        final StringBuilder builder = new StringBuilder();

        builder.append("Hello!");
        System.out.println(builder.toString());

    }
}
