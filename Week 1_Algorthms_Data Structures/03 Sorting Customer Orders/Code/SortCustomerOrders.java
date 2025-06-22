package work;
import java.util.*;

class Order {
    int orderId;
    String customerName;
    double totalPrice;

    Order(int id, String name, double price) {
        this.orderId = id;
        this.customerName = name;
        this.totalPrice = price;
    }
}

public class SortCustomerOrders {
    static void bubbleSort(Order[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j].totalPrice > arr[j + 1].totalPrice) {
                    Order temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    static void quickSort(Order[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(Order[] arr, int low, int high) {
        double pivot = arr[high].totalPrice;
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j].totalPrice < pivot) {
                i++;
                Order temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        Order temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    static void display(Order[] arr) {
        for (Order o : arr) {
            System.out.println(o.orderId + " " + o.customerName + " " + o.totalPrice);
        }
    }

    public static void main(String[] args) {
    	System.out.print("Enter number of orders: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Order[] orders1 = new Order[n];
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            double price = sc.nextDouble();
            orders1[i] = new Order(id, name, price);
        }
        Order[] orders2 = Arrays.copyOf(orders1, n);
        bubbleSort(orders1);
        quickSort(orders2, 0, n - 1);
        System.out.println("Bubble Sorted Orders:");
        display(orders1);
        System.out.println("Quick Sorted Orders:");
        display(orders2);
    }
}
