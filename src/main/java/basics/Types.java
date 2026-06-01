package basics;

public class Types {

    public static void main(String[] args) {
        /**
         * Integer numbers:
         *  integer type is calculated as (2^n - 1) to (2^n - 1) - 1
         *      byte - 8-bit signed integer (-128 to 127)
         *      short - 16-bit signed integer (-32,768 to 32,767)
         *      int - 32-bit signed integer (-2,147,483,648 to 2,147,483,647)
         *      long - 64-bit signed integer (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
         */

        int one = 1;
        long million = 1_000_000L;

        System.out.println(one);
        System.out.println(million);

        /**
         * Floating-point numbers:
         *      float - 32-bit floating-point number
         *      double - 64-bit floating-point number
         */
        double pi = 3.1415;
        float e = 2.71828f;

        System.out.println(pi);
        System.out.println(e);

        /**
         * Character type:
         *      char - 16-bit (2 bytes) Unicode character
         */
        char letter = 'A';
        System.out.println(letter);

        /**
         * Boolean type:
         *      boolean - true or false
         */
        boolean enabled = true;
        boolean bugFound = false;

        System.out.println(enabled);
        System.out.println(bugFound);
    }
}

