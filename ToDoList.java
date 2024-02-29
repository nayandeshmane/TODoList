import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> mytasks = new ArrayList<>(); // it is used as ArrayList object

        while (true) {
            System.out.println("Todo List:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Remove Task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    mytasks.add(scanner.nextLine());
                    scanner.nextLine(); // Consume extra newline
                    System.out.println("Task added successfully!");
                    break;
                case 2:
                    if (mytasks.isEmpty()) {
                        System.out.println("No tasks in the list.");
                    } else {
                        System.out.println("\nTasks:");
                        int index = 1;
                        for (String task : mytasks) {
                            System.out.println(index++ + ". " + task);
                        }
                    }
                    break;
                case 3:
                    if (mytasks.isEmpty()) {
                        System.out.println("No tasks to mark completed.");
                    } else {
                        System.out.println("\nTasks:");
                        int index = 1;
                        for (String task : mytasks) {
                            System.out.println(index++ + ". " + task);
                        }
                        System.out.print("Enter the index of the task to mark completed: ");
                        int taskIndex = scanner.nextInt() - 1; // Adjust for zero-based indexing
                        if (taskIndex >= 0 && taskIndex < mytasks.size()) {
                            mytasks.set(taskIndex, "[COMPLETED] " + mytasks.get(taskIndex));
                            System.out.println("Task marked completed successfully!");
                        } else {
                            System.out.println("Invalid index!");
                        }
                    }
                    break;
                case 4:
                    if (mytasks.isEmpty()) {
                        System.out.println("No tasks to remove.");
                    } else {
                        System.out.println("\nTasks:");
                        int index = 1;
                        for (String task : mytasks) {
                            System.out.println(index++ + ". " + task);
                        }
                        System.out.print("Enter the index of the task to remove: ");
                        int taskIndex = scanner.nextInt() - 1; // Adjust for zero-based indexing
                        if (taskIndex >= 0 && taskIndex < mytasks.size()) {
                            mytasks.remove(taskIndex);
                            System.out.println("Task removed successfully!");
                        } else {
                            System.out.println("Invalid index!");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");

            }
        }
    }
}
