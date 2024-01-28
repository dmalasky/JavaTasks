import java.util.Objects;

public class Main {

    public static void main(String[] args){

        UI ui = new UI();


        boolean done = false;

        while (!done){
            String choice = ui.MainMenu();

            switch (choice) {
                case "1" -> ui.Menu1();
                case "2" -> ui.Menu2();
                case "3" -> ui.Menu3();
                default -> done = true;
            }
        }


        // TODO

        /*Get tasks working for one day in the console.
            -Create a Hashmap with time keys and empty spots

        */

    }
}
