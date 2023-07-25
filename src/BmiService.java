public class BmiService {
    public double calculate(int W, double H) {
        double bmi = W / (H * H);
        return (int) bmi;
    }
}
