package Arrays;

public class Average {
    static void main(String[] args) {
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

        float avg, sum = 0;
        int min = ages[0], max = ages[0], length = ages.length;

        for (int value : ages) {
            sum += value;

            if (value < min)
                min = value;

            if (value > max)
                max = value;
        }

        avg = sum / length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Max Age: " + max);
        System.out.println("Min Age: " + min);
    }
}
