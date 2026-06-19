package methods;

public class GreetUser {
    private static String getMessage(String username) {
        String message = "Hello, " + username + "!";
        return message;
    }

    static void main(String[] args) {
        System.out.println(getMessage("John"));
    }
}
