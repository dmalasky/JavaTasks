import java.util.Objects;

public class Main {

    public static void main(String[] args){

        UI ui = new UI();
        boolean done = false;

        // Shows main menu and loops until player is done.
        while (!done){
            String choice = ui.MainMenu();

            switch (choice) {
                case "1" -> ui.Menu1();
                case "2" -> ui.Menu2();
                case "3" -> ui.Menu3();
                case "4" -> ui.Menu4();
                case "5" -> ui.Menu5();
                default -> done = true;
            }
        }

    }
}
