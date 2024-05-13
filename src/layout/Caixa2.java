package layout;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

public class Caixa2 extends HBox {


	public Caixa2() {
		this(100, 100);
	}

	public Caixa2(int largura, int altura) {
		setAlignment(Pos.CENTER);

		setMinWidth(largura);
		setMinHeight(altura);

	}

	public Caixa2 comTexto(String texto) {
		Label label = new Label(texto);
		label.setFont(new Font(24));
		getChildren().add(label);
		return this;
	}
}
