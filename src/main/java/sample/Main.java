package sample;

import com.sun.javafx.css.Stylesheet;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        /*
        Parent root = FXMLLoader.load(getClass().getResource("/sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        */
        primaryStage.setTitle("JavaFX Welcome");

        StackPane root = new StackPane();
        Scene scene = new Scene(root, 300, 250);

        Label label = new Label ("Values");
        label.setFont(new Font("Cambria", 32));
        label.setRotate(270);
        label.setTranslateY(50);

        Label label3 = new Label("A label that needs to be wrapped");
        label3.setWrapText(true);
        label3.setOnMouseEntered((MouseEvent e) -> {
            label3.setScaleX(1.5);
            label3.setScaleY(1.5);
        });
        label3.setOnMouseExited((MouseEvent e) -> {
            label3.setScaleX(1);
            label3.setScaleY(1);
        });

        root.getChildren().add(label);
        root.getChildren().add(label3);

        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
