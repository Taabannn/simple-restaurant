package ir.maktab58.homework3.question3.composition;

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void move(){
        if (engine != null) {
            engine.work();
            System.out.println("Car is moving!");
        }
    }
}
