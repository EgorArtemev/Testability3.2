public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bmi = (int) service.calculate(110, 1.85);
        System.out.println(bmi);

    }
}