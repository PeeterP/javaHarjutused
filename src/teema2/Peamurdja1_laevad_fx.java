package teema2;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Joonista laevade pommitamine kasutades JavaFXi.
 */
public class Peamurdja1_laevad_fx extends Application {
    Stage lava;
    StackPane maailm;
    GridPane laud;
    int laevaServaPikkus = 150;
    int lauaPikkus = 3;
    Image laevaPilt = new Image("teema2/pirate.png");
    ImagePattern laevaMuster = new ImagePattern(laevaPilt);

    @Override
    public void start(Stage primaryStage) throws Exception {
        lava = primaryStage;
        seadistaLava();
        genereeriGrid();
        reageeriKlikile();
    }

    private void reageeriKlikile() {
        laud.setOnMouseClicked(event -> {
            Rectangle ruut = (Rectangle) event.getTarget();
            String ruuduId = ruut.getId();
            if (ruuduId.equals("laev")) {
                ruut.setFill(laevaMuster);
                ruut.setId("põhjas");
            } else if (ruuduId.equals("meri")) {
                ruut.setFill(Color.DARKBLUE);
            } else if (ruuduId.equals("põhjas")) {
                System.out.println("ou, juba lasid siia");
            }
            if (!laevasidAlles()) {
                gameover();
            }
        });
    }

    private void gameover() {
        Label tekst = new Label("Tubli, võitsid ühepoolse mängu.");
        maailm.getChildren().add(tekst);
    }

    private boolean laevasidAlles() {
        for (Node ruut : laud.getChildren()) {
            if (ruut.getId().equals("laev")) {
                return true;
            }
        }
        return false;
    }

    private void genereeriGrid() {
        for (int i = 0; i < lauaPikkus; i++) {
            for (int j = 0; j < lauaPikkus; j++) {
                Rectangle ruut = new Rectangle(laevaServaPikkus, laevaServaPikkus);
                int rand = (int) (Math.random() * 2);
                if (rand == 1) {
                    ruut.setId("meri");
                } else {
                    ruut.setId("laev");
                }
                ruut.setFill(Color.BLUE);
                ruut.setStroke(Color.BLACK);
                laud.add(ruut, i, j);
            }
        }
    }

    private void seadistaLava() {
        maailm = new StackPane();
        laud = new GridPane();

        maailm.getChildren().add(laud);

        Scene manguStseen = new Scene(maailm, laevaServaPikkus*lauaPikkus, laevaServaPikkus*lauaPikkus);
        lava.setScene(manguStseen);
        lava.show(); // näita akent
        lava.setOnCloseRequest(event -> { System.exit(0); }); // akna sulgedes läheb programm kinni
    }
}
