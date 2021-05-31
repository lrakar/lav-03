// args: 
// author: Lovro Rakar 
// menthor: Marko Kastelic 
/*<StartComments>
</endComments>*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class Naloga4 extends Application{
    Stage window;
    Scene scene1, scene2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        Button button1 = new Button("pojdi na sceno 2");
        button1.setOnAction(e -> window.setScene(scene2));

        //Layout 1 - Children are laid out in vertical column
        StackPane layout1 = new StackPane();
        layout1.getChildren().add(button1);
        scene1 = new Scene(layout1, 200, 200);

        //button 2
        Button button2 = new Button("go back");
        button2.setOnAction(e -> window.setScene(scene1));

        //Layout 2
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2, 200, 200);

        window.setScene(scene1);
        window.setTitle("Naloga4");
        window.show();
    }
}
