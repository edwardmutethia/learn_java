package methods;

public class Rectangle {
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    static void main(String[] args) {
        System.out.println(calculateRectangleArea(4.5, 2.3));
    }
}
