public class BmiService {
    public int calculate(double kilograms, double meters) {
        double bmi = kilograms / (meters * meters);
        return (int) bmi;
    }
}