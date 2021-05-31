// args: 
// author: Lovro Rakar 
// menthor: Marko Kastelic 
/*<StartComments>
</endComments>*/
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Naloga5 extends Application{
    public static void main(String[] args) {
        launch(args);    
    }

    @Override
    public void start(Stage primaryStage) {
        Circle cir = new Circle();
        cir.setFill(Color.BLACK);
        cir.setRadius(50);
        cir.setLayoutX(50);
        cir.setLayoutY(50);

        TranslateTransition transition = new TranslateTransition();
        transition.setDuration(Duration.seconds(4));
        transition.setToX(500);
        transition.setToY(500);
        transition.setNode(cir);
        transition.play();

        Pane root = new Pane();
        root.getChildren().add(cir);
        Scene scene = new Scene(root, 600, 600);

        primaryStage.setTitle("Krogec");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}