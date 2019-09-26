import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FXPractice extends Application {

  public void start(Stage stage){
    Text hello = new Text(50, 50, "Hello World!");
    Text question = new Text(120, 80, "How's it going?");
    Rectangle box = new Rectangle(20, 20, 120, 50);

    box.setStroke(Color.BLUE);
    box.setFill(null);

    Group root = new Group(hello, question, box);
    Scene scene = new Scene(root, 300, 120, Color.LIGHTGREEN);

    stage.setTitle("FXPractice");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args){
    launch(args);
  }
}
