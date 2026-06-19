package control_structures;

import java.util.Scanner;

enum Seasons { SPRING, SUMMER, AUTUMN, WINTER }

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Seasons season = Seasons.valueOf(scanner.nextLine());

        int temperature = switch (season) {
            case SPRING -> 15;
            case SUMMER -> 25;
            case AUTUMN -> 10;
            case WINTER -> 0;
        };

        System.out.println(temperature);
    }
}