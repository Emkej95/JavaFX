import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import window.Software;

public class Main extends Application {

    Stage window;
    Scene main;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        //Name buttons
        Button back = new Button("Powrót");
        Button soft = new Button("Software Checklist");
        Button conf = new Button("Configuration Checklist");
        Button user = new Button("User Account Checklist");
        Button docs = new Button("Documentation Checklist");

        //Set size buttons
        soft.setMinSize(150,30);
        conf.setMinSize(150,30);
        user.setMinSize(150,30);
        docs.setMinSize(150,30);

        //Action on buttons
        back.setOnAction(e -> window.setScene(main));
        soft.setOnAction(e -> Software.softlist());
        conf.setOnAction(e -> Configuration.conflist());

        //Okno początkowe
        VBox start = new VBox(20);
        start.getChildren().addAll(soft, conf, user, docs);
        main = new Scene(start, 300, 200);
        start.setAlignment(Pos.CENTER);

        window.setScene(main);
        window.setTitle("FieldSupport Checklist");
        window.show();
    }
}
