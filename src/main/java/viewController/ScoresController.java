package viewController;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class ScoresController{
  @FXML
  private Button play = new Button();
  
  @FXML
  private Button scores = new Button();
  
  @FXML
  private Button credits = new Button();
 
  
  @FXML
  public void handleClickPlay(ActionEvent event) throws IOException {
	  Stage primaryStage = (Stage) play.getScene().getWindow();
	  primaryStage.hide();
	  
	  Stage stage = new Stage();
	  new PlayView(stage);
  }
  
  @FXML
  public void handleClickScores(ActionEvent event) throws IOException {
	  Stage primaryStage = (Stage) scores.getScene().getWindow();
	  primaryStage.hide();
	  
	  Stage stage = new Stage();
	  new ScoresView(stage);
  }
  
  @FXML
  public void handleClickCredits(ActionEvent event) throws IOException {
	  Stage primaryStage = (Stage) credits.getScene().getWindow();
	  primaryStage.hide();
	  
	  Stage stage = new Stage();
	  new CreditsView(stage);
  }
  
  @FXML
  public void initialize() {
	  
}
  

}
