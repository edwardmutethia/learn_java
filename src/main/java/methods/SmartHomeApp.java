package methods;

import java.util.Scanner;

public class SmartHomeApp {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final int PASSWORD = 123456789;

    public static void accessSmartHome() {
        System.out.println("Welcome to Java Smart Home");
        System.out.print("Enter password: ");

        int passwordInput = readNumber();
        if (passwordInput == PASSWORD) {
            System.out.println("Access granted. House is listening.");
            chooseAction();
        } else {
            System.out.println("Incorrect password! Security lights are blinking.");
        }
    }

    public static void chooseAction() {
        boolean isRunning = true;

        while (isRunning) {
            System.out.println();
            System.out.println("Choose the object: 1 - speakers, 2 - lamp, 3 - door, 4 - kettle, 0 - exit");
            System.out.print("Your choice: ");

            int option = readNumber();
            switch (option) {
                case 1 -> controlMusic();
                case 2 -> controlLamp();
                case 3 -> controlDoor();
                case 4 -> controlKettle();
                case 0 -> {
                    System.out.println("Smart home is sleeping. Goodbye.");
                    isRunning = false;
                }
                default -> System.out.println("Unknown device. Try 1, 2, 3, 4, or 0.");
            }
        }
    }

    public static void controlDoor() {
        System.out.println("Door control: lock, unlock, peek");
        System.out.print("Command: ");
        String command = SCANNER.next().toLowerCase();

        switch (command) {
            case "lock" -> System.out.println("Front door locked. Digital deadbolt engaged.");
            case "unlock" -> System.out.println("Front door unlocked. Welcome mat lights turned on.");
            case "peek" -> System.out.println("Camera view: porch clear, one package near the door.");
            default -> System.out.println("Invalid door command.");
        }
    }

    public static void controlLamp() {
        System.out.println("Lamp control: on, off, dim, party");
        System.out.print("Command: ");
        String command = SCANNER.next().toLowerCase();

        switch (command) {
            case "on" -> System.out.println("Lamp is on. Warm white mode selected.");
            case "off" -> System.out.println("Lamp is off. Room is now calm.");
            case "dim" -> {
                System.out.print("Brightness percent: ");
                int brightness = readNumber();
                if (brightness >= 0 && brightness <= 100)
                    System.out.println("Lamp brightness set to " + brightness + "%.");
                else
                    System.out.println("Brightness must be between 0 and 100.");
            }
            case "party" -> System.out.println("Lamp is cycling blue, green, pink, and gold.");
            default -> System.out.println("Invalid lamp command.");
        }
    }

    public static void controlKettle() {
        System.out.println("Kettle control: tea, coffee, boil, off");
        System.out.print("Command: ");
        String command = SCANNER.next().toLowerCase();

        switch (command) {
            case "tea" -> System.out.println("Kettle heating to 85C for tea.");
            case "coffee" -> System.out.println("Kettle heating to 94C for coffee.");
            case "boil" -> System.out.println("Kettle heating to 100C. Steam mode ready.");
            case "off" -> System.out.println("Kettle is off.");
            default -> System.out.println("Invalid kettle command.");
        }
    }

    public static void controlMusic() {
        System.out.println("Speaker control: on, off, chill, focus, volume");
        System.out.print("Command: ");
        String tumbler = SCANNER.next().toLowerCase();

        switch (tumbler) {
            case "on" -> System.out.println("The music is on.");
            case "off" -> System.out.println("The music is off.");
            case "chill" -> System.out.println("Playing soft lo-fi beats in the living room.");
            case "focus" -> System.out.println("Playing deep focus piano at low volume.");
            case "volume" -> {
                System.out.print("Volume level: ");
                int volume = readNumber();
                if (volume >= 0 && volume <= 10)
                    System.out.println("Speaker volume set to " + volume + "/10.");
                else
                    System.out.println("Volume must be between 0 and 10.");
            }
            default -> System.out.println("Invalid operation.");
        }
    }

    private static int readNumber() {
        while (!SCANNER.hasNextInt()) {
            System.out.print("Please enter a number: ");
            SCANNER.next();
        }

        return SCANNER.nextInt();
    }

    static void main(String[] args) {
        accessSmartHome();
    }
}
