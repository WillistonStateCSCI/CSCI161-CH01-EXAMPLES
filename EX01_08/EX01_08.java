package EX01_08;

public class EX01_08 {
    public static void main(String args[]) {
        double[] example = { 1.2, 2.3, 4.5, 9.8, 12.3 };
        sum(example);
    }

    public static double sum(double[] data) {
        double total = 0;
        for (double val : data) {
            total += val;
        }
        return total;
    }
}
