package classes;

public class Human {

    String name;
    int age;

    public static void averageWorking() {
        System.out.println("An average human works 40 hours per week.");
    }

    public void work() {
        System.out.println(this.name + " loves working!");
    }

    public void workTogetherWith(Human other) {
        System.out.println(this.name + " loves working with " + other.name + '!');
    }

    static void main(String[] args) {
        Human.averageWorking();

        Human peter = new Human();
        peter.name = "Peter";
        peter.age = 25;
        peter.work();

        Human john = new Human();
        john.name = "John";
        john.age = 30;
        john.work();

        peter.workTogetherWith(john);
    }
}
