import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FXProgram extends Application {

  public void start(Stage stage){
    Text quote = new Text(70, 80, "It's not goodbye forever, it's just goodbye for now");
    Text author = new Text(100, 120, "~ Gillian McMahon");
    Rectangle r = new Rectangle();
    r.setX(50);
    r.setY(50);
    r.setWidth(300);
    r.setHeight(100);
    r.setArcWidth(20);
    r.setArcHeight(20);

    Line line = new Line();
    line.setStartX(110.0f);
    line.setStartY(110.0f);
    line.setEndX(110.0f);
    line.setEndY(110.0f);


    r.setStroke(Color.BLUE);
    r.setFill(null);

    line.setFill(Color.BLUE);

    Group root = new Group(quote, author, r, line);
    Scene scene = new Scene(root, 300, 120, Color.LIGHTGREEN);

    stage.setTitle("FXProgram");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args){
    launch(args);
  }
}
