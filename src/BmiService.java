public class BmiService {
    public double calculate( double kilograms, double meters ) {
        double bmi = kilograms / ( meters * meters );
        return ( int ) bmi;
    }
}