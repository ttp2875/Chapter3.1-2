import javafx.application.Application;
import javafx.stage.Stage;
import java.util.Optional;
import javafx.scene.control.TextInputDialog;

public class IfElseStatement extends Application {

    @Override
    public void start(Stage primaryStage)  {
        TextInputDialog textInputDialog = new TextInputDialog("CSC200") ;
        Optional<String> input = textInputDialog.showAndWait();
        String option = input.get();

        if(option.equals("CSC200")) {
            System.out.println("You have select the CSC200 section. Enter a different numerous or characters for more information!");
        }  else {
            System.out.println("Welcome Tai");
            System.out.println("Year of attended: 1997");
            System.out.println("Your current GPA is: 3.5");
            System.out.println("Average GPA of other colleges: 3.65");


        }
    }
}