package work;
import java.util.*;

class Task {
    int taskId;
    String taskName;
    String status;
    Task next;

    Task(int id, String name, String stat) {
        taskId = id;
        taskName = name;
        status = stat;
        next = null;
    }
}

public class TaskManagement {
    static Task head = null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add 2. Search 3. View All 4. Delete 5. Exit");
            int ch = sc.nextInt();
            if (ch == 1) {
                System.out.print("Enter Task ID: ");
                int id = sc.nextInt();
                System.out.print("Enter Task Name: ");
                String name = sc.next();
                System.out.print("Enter Status: ");
                String stat = sc.next();
                Task t = new Task(id, name, stat);
                if (head == null) head = t;
                else {
                    Task temp = head;
                    while (temp.next != null) temp = temp.next;
                    temp.next = t;
                }
            } else if (ch == 2) {
                System.out.print("Enter Task ID to search: ");
                int id = sc.nextInt();
                Task temp = head;
                boolean found = false;
                while (temp != null) {
                    if (temp.taskId == id) {
                        System.out.println(temp.taskId + " " + temp.taskName + " " + temp.status);
                        found = true;
                        break;
                    }
                    temp = temp.next;
                }
                if (!found) System.out.println("Task not found");
            } else if (ch == 3) {
                Task temp = head;
                while (temp != null) {
                    System.out.println(temp.taskId + " " + temp.taskName + " " + temp.status);
                    temp = temp.next;
                }
            } else if (ch == 4) {
                System.out.print("Enter Task ID to delete: ");
                int id = sc.nextInt();
                if (head != null && head.taskId == id) {
                    head = head.next;
                } else {
                    Task prev = head;
                    Task temp = head.next;
                    while (temp != null && temp.taskId != id) {
                        prev = temp;
                        temp = temp.next;
                    }
                    if (temp != null) prev.next = temp.next;
                }
            } else break;
        }
    }
}
