package JavaPractice.Abstraction;

public class Honda implements Car,Motor{

    public void start() {
        System.out.println("Auto starting system");
    }

    public void stop() {
        System.out.println("Automatic stop");

    }

    public void carShape() {
        System.out.println("Convertible");
    }

    public void motorType() {
        System.out.println("Double turbo engine");
    }

    public void fuelType() {
        System.out.println("Gasoline");



    }
}
