package JavaPractice.Abstraction;

public class Toyota extends Moderncar implements Car, Motor {
    public void start() {
        System.out.println("start and let's drive");
    }

    public void stop() {
        System.out.println("brake and stop");
    }

    public void carShape() {
        System.out.println("6 feet long car");
    }

    public void hydraulicBrake() {
        System.out.println("hydraulic brake car");
    }

    public void motorType() {
        System.out.println("engine with turbo");
    }

    public void fuelType() {
        System.out.println("gas type");
    }

    public void carColor() {
        System.out.println("multiple colors available");
    }
}
