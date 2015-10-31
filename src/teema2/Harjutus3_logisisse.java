package teema2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Scanner;

/**
 * 1. Loo sisse logimise ekraan (ainult visuaal)
 * 2. Määra üks võimalik kasutaja ja parool (andmebaasi veel ei kasuta)
 * 3. Ebaõnnestunud katse näitab kasutajale errorit
 * 4. Õnnestunud katse puhul vaheta pilt uue vastu (kasvõi roheline ring), .
 */
public class Harjutus3_logisisse extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox vbox = new VBox();
        Scene stseen = new Scene(vbox);
        primaryStage.setScene(stseen);
        primaryStage.show();

        Label kasutajaLabel = new Label("Kasutajanimi");
        TextField kasutajainput = new TextField();
        vbox.getChildren().addAll(kasutajaLabel, kasutajainput);

        Label salasonaLabel = new Label("Salasõna");
        PasswordField salasonainput = new PasswordField();
        vbox.getChildren().addAll(salasonaLabel, salasonainput);

        Button btn = new Button("Logi sisse");
        btn.setOnAction(event -> {
            String kasutajaSisu = kasutajainput.getText();
            String kasutajaSisu = salasonainput.getText();



        });
        vbox.getChildren().addAll(btn);


    }
}
