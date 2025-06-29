package ex_2;

public class PerformanceTester {

    public void performTask() {
        long sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Finished performTask, sum = " + sum);
    }
}
