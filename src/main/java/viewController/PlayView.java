package viewController;

import java.io.IOException;


import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PlayView {
	
	
	public PlayView (Stage stage) throws IOException {
		stage = new Stage();
		
		stage.setTitle("Who wants his TOEIC ?");
		
		FXMLLoader loader = new FXMLLoader();
	    loader.setLocation(getClass().getResource("/fxml/play.fxml"));
		Parent root = loader.load();
		
		stage.setOnCloseRequest(event -> {
		 Platform.exit();
		});
		stage.setScene(new Scene(root, 1000, 700));
		stage.setResizable(false);
		stage.show();
	}

}
