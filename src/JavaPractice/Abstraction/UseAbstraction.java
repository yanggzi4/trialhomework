package JavaPractice.Abstraction;

public class UseAbstraction {
    public static void main(String[] args) {

        Car camry = new Toyota();
        camry.stop();
        camry.start();
        camry.carShape();

        Toyota corolla = new Toyota();

        corolla.stop();
        corolla.start();
        corolla.fuelType();
        corolla.motorType();
        corolla.carShape();

        Honda civic = new Honda();

        civic.stop();
        civic.start();
        civic.fuelType();
        civic.motorType();
        civic.carShape();
    }
}
