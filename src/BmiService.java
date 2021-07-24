public class BmiService {
    public double calculate(int weight, double height) {
        return (weight / Math.pow(height, 2));
    }

    public double roundIndex(double index) {
        return Math.round(index * 100.0) / 100.0;
    }
}
