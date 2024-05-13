package layout;

import javafx.scene.layout.StackPane;

public class TesteStackPane2 extends StackPane {

	public TesteStackPane2() {

		Caixa c1 = new Caixa().comTexto("1");
		Caixa c2 = new Caixa().comTexto("2");
		Caixa c3 = new Caixa().comTexto("3");
		Caixa c4 = new Caixa().comTexto("4");
	
		getChildren().addAll(c1 ,c2 ,c3 ,c4);

	
		
	}
}
