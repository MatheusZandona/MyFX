package br.univel;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			GridPane root = (GridPane)FXMLLoader.load(getClass().getResource("TelaPrincipal.fxml"));  // instancia o objeto com as configuracoes do fxml
			Scene scene = new Scene(root,400,400);  // oq vai aparecer na tela.
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm()); //na tela vc instancia o arquivo css
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
