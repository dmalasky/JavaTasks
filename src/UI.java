import java.util.Scanner;

public class UI {

    TaskManager taskManager = new TaskManager();
    private final Scanner scanner = new Scanner(System.in);

    public String MainMenu()
    {
        System.out.println("\nHello Welcome to JavaTasks!\n");
        System.out.println("Please select one of the following:\n");
        System.out.println("1. Add task");
        System.out.println("2. Display tasks");
        System.out.println("3. Remove task");
        System.out.println("4. Save tasks");
        System.out.println("5. Load tasks");
        System.out.println("6. Quit");


        return scanner.nextLine();


    }

    // Create Task
    public void Menu1()
    {
        System.out.println("Please fill out the following information:\n");
        taskManager.CreateTask();
    }

    // Display Tasks
    public void Menu2()
    {
        System.out.println("Your current tasks:\n");
        taskManager.DisplayTasks();
    }

    // Remove tasks
    public void Menu3()
    {
        taskManager.RemoveTask();
    }

    // Save tasks
    public void Menu4()
    {
        taskManager.SaveTasks();
    }

    // Load tasks
    public void Menu5()
    {
        System.out.println("Are you sure? This will erase any unsaved data. (y/n): ");
        String choice = scanner.nextLine();

        if (choice.equals("y")){
            taskManager.LoadTasks("TaskData.txt");
        } else {
            System.out.println("Canceled.");
        }
    }
}
