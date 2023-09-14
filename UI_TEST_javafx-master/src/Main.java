import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import static javafx.scene.paint.Color.INDIANRED;

public class Main extends Application {

    @Override
    public void start(Stage window) {

        BorderPane layout = new BorderPane();




        VBox buttons = new VBox();

        buttons.autosize();

        buttons.setSpacing(150);

        buttons.setPrefSize(100, 100);
        buttons.getChildren().add(new Button("Pat. 1"));
        buttons.getChildren().add(new Button("Pat. 2"));
        buttons.getChildren().add(new Button("Pat. 3"));
        buttons.setStyle("-fx-border-color: yellow; -fx-text-fill: blue; -fx-border- \n" +
                "                width: 3px; -fx-font-size: 30px;");
        layout.setCenter(buttons);

        layout.setTop(new Label("Top"));
        layout.setRight(new Label("Right"));
        layout.setBottom(new Label("Bottom"));
        layout.setLeft(new Label("Left"));
        layout.setStyle("-fx-background-color: SILVER");

        Scene view = new Scene(layout, 200, 600);
        view.setFill(Color.BLUE);
        window.setScene(view);
        window.show();

    }

    public static void main(String[] args) {
        launch(Main.class);
    }
}
