package main.viewController;

import java.io.IOException;


import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CreditsView {


	public CreditsView (Stage stage) throws IOException {
		stage = new Stage();

		stage.setTitle("Who wants his TOEIC ?");
		Parent root = FXMLLoader.load(getClass().getResource("credits.fxml"));

		stage.setOnCloseRequest(event -> {
			Platform.exit();
		});
		stage.setScene(new Scene(root, 1000, 700));
		stage.setResizable(false);
		stage.show();
	}

}
