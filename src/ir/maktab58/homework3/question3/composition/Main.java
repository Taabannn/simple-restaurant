package ir.maktab58.homework3.question3.composition;

public class Main {
    public static void main(String[] args) {
        Engine engine1 = new Engine();
        Car car1 = new Car(engine1);
        car1.move();
    }
}
