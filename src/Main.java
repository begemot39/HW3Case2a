public class Main {
    public static void main(String[] args) {
        BmiService bmi = new BmiService();
        double kilograms = 98;
        double meters = 1.87;
        double userBmi = bmi.calculate(kilograms, meters);
        System.out.println("Ваш индекс bmi равен: " + (int) userBmi);
    }
}