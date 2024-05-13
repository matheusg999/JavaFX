package layout;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppLayout extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent raiz = null;
		
		raiz = new TesteAnchorPane();
		raiz = new TesteTilePane();
		raiz = new TesteBorderPane();
		raiz = new TesteStackPane();
		raiz = new TesteFlowPane();
		raiz = new ClickColor();
		raiz = new TesteGridPane();
	
		
		Scene principal = new Scene(raiz ,600, 600);
		
		primaryStage.setScene(principal);
		primaryStage.setTitle("Gerenciadores de Layout");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
		
	}
}
