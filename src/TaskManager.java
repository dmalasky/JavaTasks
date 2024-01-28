import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class TaskManager {

    //Constructor
    public TaskManager(){

    }

    private final Scanner scanner = new Scanner(System.in);
    private final List<Task> tasks = new ArrayList<Task>();

    // Creates a task and adds it to "tasks"
    public void CreateTask() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Enter a start time (HH:mm):");
        String startTimeInput = scanner.nextLine();
        LocalTime startTime = LocalTime.parse(startTimeInput, formatter);

        System.out.println("Enter an end time (HH:mm): ");
        String endTimeInput = scanner.nextLine();
        LocalTime endTime = LocalTime.parse(endTimeInput, formatter);

        System.out.println("Enter task description: ");
        String taskDesc = scanner.nextLine();

        System.out.println("Enter task name: ");
        String taskName = scanner.nextLine();

        Task newTask = new Task(startTime, endTime, taskDesc, taskName);
        tasks.add(newTask);

        System.out.println("Task created successfully!");

    }

    // Remove a task from the list.
    public void RemoveTask() {
        System.out.println("Please type the name of the task you would like to remove: ");

        DisplayTaskNames();

        String taskToRemove = scanner.nextLine();

        // Create an iterator to safely remove from the list
        Iterator<Task> iterator = tasks.iterator();
        while (iterator.hasNext()){
            Task task = iterator.next();
            if (task.getTaskName().equals(taskToRemove)){
                iterator.remove();
                System.out.println("Task removed successfully");
                return;
            }
        }

        System.out.println("Task with name '" + taskToRemove + "' not found.");

    }

    // Display only task names
    public void DisplayTaskNames()
    {
        int count = 1;
        for (Task task : tasks)
        {
            System.out.println(count + ". " + task.getTaskName());
        }
    }

    // Displays all the tasks.
    public void DisplayTasks() {
        for (Task task : tasks){
            System.out.println(task.getStartTime() + " - " + task.getEndTime());
            System.out.println("Task name: " + task.getTaskName());
            System.out.println("Task description: " + task.getTaskDesc() + "\n");
        }

    }

    // Saves tasks to a file.
    public void SaveTasks(){

        // Create or overwrite file.
        try{
            FileWriter TaskData = new FileWriter("TaskData.txt");

            // Loops through tasks and save them to a file
            for (Task task : tasks){
                TaskData.write(task.TaskSaveFormat());
            }

            TaskData.close();
            System.out.println("File saved.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Loads tasks from a file.
    public void LoadTasks(String filename){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        // Open and read file.
        try {
            File fileToRead = new File(filename);
            Scanner fileReader = new Scanner(fileToRead);
            while (fileReader.hasNextLine()){
                String data = fileReader.nextLine();
                String[] taskArray = data.split(",");
                tasks.clear();

                // Changed the strings to LocalTimes
                LocalTime startTime = LocalTime.parse(taskArray[0], formatter);
                LocalTime endTime = LocalTime.parse(taskArray[1], formatter);

                // Recreate tasks
                Task task = new Task(startTime, endTime, taskArray[2], taskArray[3]);

                // Add tasks to list
                tasks.add(task);

            }
            fileReader.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
