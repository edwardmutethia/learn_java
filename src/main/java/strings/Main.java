/**
 * Strings are immutable
 * string is a reference type consisting of characters
 */

package strings;

import com.sun.security.jgss.GSSUtil;

public class Main {
    static void main(String[] args) {

        String text = "The simple text string";

        boolean empty = text.isEmpty(); // false

        String textInUpperCase = text.toUpperCase();

        String textInLowerCase = text.toLowerCase();

        boolean startsWith = textInUpperCase.startsWith("THE"); // true

        String noSpaces = textInUpperCase.replace(" ", "");

        String phoneNumber = text.replaceAll(" ", "_");

        String trimedText = text.trim();

        String firstName = "John";
        String lastName = "Doe";

        String fullName = firstName.concat(" ").concat(lastName);

        // Creating strings using new keyword
        String text2 = new String("Java is amongst popular programming languages");

        // Comparing strings
        String first = "first";
        String second = "FIRST";

        // Using printf() Method
        System.out.printf("My name is %s, I was born in %d\n", "Mike", 1988);
        System.out.printf("The sum of %d and %d is %d\n", 5, 8, 5 + 8);

        char abbr = 'H';
        String element = "Hydrogen";

        System.out.printf("%c stands for %s\n", abbr, element);

        // Using String.format()
        int age = 22;
        char initial = 'M';
        String surname = "Anderson";
        double height = 1.72;

        String details = String.format(
                "My age is %c. %s.%nMy age is %d.%nMy height is %.2f.%n",
                initial, surname, age, height);

//        String class also has a newer and slightly simpler method
//        formatted(Object... args) that you can use instead of the static
//        String.format method.

        String person = "My age is %c. %s.%nMy age is %d.%nMy height is %.2f.%n"
                .formatted(initial, surname, age, height);

        System.out.println(details);
        System.out.println(person);

//        System.out.println(first.equals(second));
//        System.out.println(first.equalsIgnoreCase(second));
//
//        System.out.println(text2);
//
//        System.out.println(text.length());
//        System.out.println(empty);
//        System.out.println(textInUpperCase);
//        System.out.println(textInLowerCase);
//        System.out.println(startsWith);
//        System.out.println(noSpaces);
//        System.out.println(phoneNumber);
//        System.out.println(trimedText);
//        System.out.println(fullName);
    }

}
