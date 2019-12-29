package layout;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AboutPane extends Stage {

	
	Stage stage;
    public AboutPane() {
        stage = this;
         Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("About.fxml"));
			Scene scene = new Scene(root);
	        stage.setScene(scene);
	        stage.show();
	        stage.setTitle("Hilfe");
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
