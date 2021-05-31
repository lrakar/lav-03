// args: 
// author: Lovro Rakar 
// menthor: Marko Kastelic 
/*<StartComments>
dostop do javafx knjižnice zahteva nekaj dodatnih korakov
potrebno je dodatno namestiti pravo verzijo java fx, skladno z verzijo jave, ni že nameščena (po novem)!
v vs code je treba v zavihku java project, referenced library dodati javafx knjižnico.
potem pa dela:)
</endComments>*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Naloga1 extends Application{
    Button button;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Naslov programa");
        
        button = new Button();
        button.setText("Start");

        StackPane layout = new StackPane(); //pozicionirajmo tipko na sredino
        layout.getChildren().add(button);
        
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

