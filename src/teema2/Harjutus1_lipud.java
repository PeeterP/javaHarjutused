package teema2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * 1. Joonista eesti lipp kasutades kolme Rectangle
 * 2. Joonista Jaapani lipp kasutades Rectangle ja Circle
 */
public class Harjutus1_lipud extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Scene stseen = new Scene(pane);

        Pane pane2 = new Pane();
        Scene stseen2 = new Scene(pane2);

        eestiLipp(pane);
        jaapaniLipp(pane2);

        Stage lava = new Stage();

        lava.setScene(stseen2);
        lava.show();

        primaryStage.setScene(stseen);
        primaryStage.show();
    }

    private void jaapaniLipp(Pane pane2) {
        Rectangle kastj = new Rectangle(700, 400);
        kastj.setFill(Color.WHITE);
        Circle ring = new Circle(350, 200, 100);
        ring.setFill(Color.RED);
        pane2.getChildren().add(kastj);
        pane2.getChildren().add(ring);

    }

    private void eestiLipp(Pane pane) {
        Rectangle kast1 = new Rectangle(0, 0, 1100, 200);
        Rectangle kast2 = new Rectangle(0, 200, 1100, 200);
        Rectangle kast3 = new Rectangle(0, 400, 1100, 200);
        kast1.setFill(Color.BLUE);
        kast3.setFill(Color.WHITE);
        pane.getChildren().add(kast1);
        pane.getChildren().add(kast2);
        pane.getChildren().add(kast3);
    }
}
