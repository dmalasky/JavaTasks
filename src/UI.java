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
        System.out.println("4. Quit");


        return scanner.nextLine();


    }

    public void Menu1()
    {
        System.out.println("Please fill out the following information:\n");
        taskManager.CreateTask();
    }

    public void Menu2()
    {
        System.out.println("Your current tasks:\n");
        taskManager.DisplayTasks();
    }

    public void Menu3()
    {
        taskManager.RemoveTask();
    }

}
