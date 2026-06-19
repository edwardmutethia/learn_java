package methods;

public class Main {
    public static int countSeeds(int parrotWeight, int parrotAge) {
        return parrotWeight / 5 + parrotAge;
    }

    public static void printSeedsCount(int seeds) {
        System.out.println("Give you parrot " + seeds + "g of seeds per day.");
    }

    static void main(String[] args) {
        int myParrotWeight = 100;
        int myParrotAge = 3;

        /**
         * Now myParrotPortion 23
         * because our method countSeeds, as described above,
         * calculates parrotWeight / 5 + parrotAge
         */

        int myParrotPortion = countSeeds(myParrotWeight, myParrotAge);
        printSeedsCount(myParrotPortion);
    }

}
