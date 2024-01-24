import com.sun.jdi.Value;

import java.util.HashMap;
import java.util.Scanner;

public class HellloWorld {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);


        System.out.println("Welcome to the task app");
        System.out.println("What do you wanna do today? ");
        String task = reader.nextLine();
        System.out.println("At what time? ");
        String time = reader.nextLine();
        System.out.println(task + time);

        // Creating a HashMap
        HashMap<String, String> TaskMap = new HashMap<String, String>();

        TaskMap.put("8pm", "Shower");
        TaskMap.put("8am", "eat");

        for (String key : TaskMap.keySet()){
            String value = TaskMap.get(key);
            System.out.println("Key:" + key + "\nValue: " + value);
        }

        // TODO
        /*
        Get tasks working for one day in the console.
            -Create a Hashmap with time keys and empty spots
         */


    }
}
