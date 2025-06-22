package work;
import java.util.*;

public class FinancialForecast {
    static double futureValue(double value, double rate, int years) {
        if (years == 0) return value;
        return futureValue(value * (1 + rate), rate, years - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial value: ");
        double value = sc.nextDouble();
        System.out.print("Enter growth rate (e.g., 0.1 for 10%): ");
        double rate = sc.nextDouble();
        System.out.print("Enter number of years: ");
        int years = sc.nextInt();
        double result = futureValue(value, rate, years);
        System.out.printf("Predicted future value: %.2f\n", result);
    }
}
