import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Line;

public class Snowman extends Application {
  public void start (Stage stage){

    Scene scene = new Scene(root, 300, 120, Color.LIGHTBLUE);

    final double CENTER = 200;
    final double CENTEREYE = 160;
    final double CENTERARM = 250;

    final double RECT_Y = 400;
    final double WIDTH = 500;
    final double HEIGHT = WIDTH - CENTER;

    Rectangle ground = new Rectangle(0,RECT_Y, WIDTH, HEIGHT);
    ground.setFill(Color.WHITE);

    final double BUTT_X = CENTER;
    final double BUTT_Y = 325;
    final double BUTT_RAD = 60;

    Circle butt = new Circle(BUTT_X, BUTT_Y, BUTT_RAD);
    butt.setFill(Color.WHITE);
    butt.setStroke(Color.BLACK);

    final double TORSO_X = CENTER;
    final double TORSO_Y = CENTERARM;
    final double TORSO_RAD = 45;

    Circle torso = new Circle (TORSO_X, TORSO_Y, TORSO_RAD);
    torso.setFill(Color.WHITE);
    torso.setStroke(Color.BLACK);

    final double HEAD_X = CENTER;
    final double HEAD_Y = 175;
    final double HEAD_RAD = 25;

    Circle head = new Circle(HEAD_X, HEAD_Y, HEAD_RAD);
    head.setFill(Color.WHITE);
    head.setStroke(Color.BLACK);

    final double EYE_X = 180;
    final double EYE_Y = CENTEREYE;
    final double EYE_RAD = 5;

    Circle lefteye = new Circle(EYE_X, EYE_Y, EYE_RAD);
    lefteye.setFill(Color.BLACK);

    final double EYE_X2 = 220;

    Circle righteye = new Circle(EYE_X2, EYE_Y, EYE_RAD);
    righteye.setFill(Color.BLACK);

    final double START_X = CENTER;
    final double START_Y = CENTER - 60;
    final double END_X = CENTER - WIDTH;
    final double END_Y = 280;

    Line leftarm = new Line(START_X, START_Y, END_X, END_Y);
    leftarm.setStroke(Color.BROWN);

    final double START_X2 = CENTER;
    final double START_Y2 = CENTER + 60;
    final double END_X2 = CENTER + WIDTH;
    final double END_Y2 = 280;

    Line rightarm = new Line(START_X2, START_Y2, END_X2, END_Y2);
    rightarm.setStroke(Color.BROWN);

    final double P1 = 205;
    final double P2 = 180;
    final double P3 = 195;
    final double P4 = 180;
    final double P5 = 200;
    final double P6 = 185;

    Polygon nose = new Polygon(P1, P2, P3, P4, P5, P6);
    nose.setFill(Color.ORANGE);

    final double TOP_X = 150;
    final double TOP_Y = 130;
    final double TOP_WIDTH = 100;
    final double TOP_HEIGHT = 10;

    Rectangle tophat = new Rectangle(TOP_X, TOP_Y, TOP_WIDTH, TOP_HEIGHT);
    tophat.setFill(Color.BLACK);

    final double TOP_X2 = 155;
    final double TOP_Y2 = 80;
    final double TOP_WIDTH2 = 85;
    final double TOP_HEIGHT2 = 50;

    Rectangle tophat1 = new Rectangle(TOP_X2, TOP_Y2, TOP_WIDTH2, TOP_HEIGHT2);
    tophat1.setFill(Color.BLACK);

    Group primary = new Group(scene, ground, butt, torso, head, leftarm);
    Group extra = new Group(rightarm, lefteye, righteye, tophat, tophat1, nose);
    Group root = new Group(primary, extra);

    stage.setTitle("Snowman");
    stage.setScene(scene);
    stage.show();
  }
  public static void mian(String[] args){
    launch(args);
  }
}
