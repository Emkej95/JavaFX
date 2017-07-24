package window;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Software {

    public static void softlist() {
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Software Checklist");
        window.setMinWidth(250);
        window.setMinHeight(300);

        //Checkboxes
        CheckBox cb1 = new CheckBox("Aktywacja MS Windows");
        CheckBox cb2 = new CheckBox("Instalacja sterowników Dell");
        CheckBox cb3 = new CheckBox("Instalacja Skype for Business");

        Button previous = new Button("Powrót");

        //Okno ustawienia
        VBox main = new VBox(5);
        main.getChildren().addAll(previous, cb1, cb2, cb3);

        previous.setOnAction(e -> window.close());

        Scene scene = new Scene(main);
        window.setScene(scene);
        window.show();
    }
}
