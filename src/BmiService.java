public class BmiService {
    public double calculate(int Weight, double Height) {
        double bmi = Weight / (Height * Height);
        return (int) bmi;
    }
}
