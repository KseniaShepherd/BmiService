public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();
        double bmi = bmiService.calculate(61, 1.64);
        double roundBmi = bmiService.roundIndex(bmi);
        System.out.println("Индекс массы тела составляет: " + roundBmi);
    }
}

