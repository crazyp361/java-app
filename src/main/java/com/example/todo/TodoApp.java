package com.example.todo;

import java.util.*;

public class TodoApp {
    private static List<Todo> todos = new ArrayList<>();
    private static int counter = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add Todo\n2. View Todos\n3. Complete Todo\n4. Exit");
            System.out.print("Choose option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    String task = scanner.nextLine();
                    todos.add(new Todo(counter++, task));
                    break;
                case 2:
                    todos.forEach(System.out::println);
                    break;
                case 3:
                    System.out.print("Enter task ID to complete: ");
                    int id = scanner.nextInt();
                    todos.stream()
                         .filter(t -> t.getId() == id)
                         .findFirst()
                         .ifPresent(Todo::complete);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    public static List<Todo> getTodos() {
        return todos;
    }
}
