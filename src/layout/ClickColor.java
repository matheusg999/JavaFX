package layout;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class ClickColor extends GridPane {

	public ClickColor() {

		Button c1 = new Button("Azul");
		Button c2 = new Button("Rosa");
		Button c3 = new Button("Verde");
		Button c4 = new Button("Vermelho");

		c1.setMinSize(200, 200);
		c1.setMaxSize(200, 200);
                      
		c2.setMinSize(200, 200);
		c2.setMaxSize(200, 200);
                        
		c3.setMinSize(200, 200);
		c3.setMaxSize(200, 200);
		              
		c4.setMinSize(200, 200);
		c4.setMaxSize(200, 200);

		setGridLinesVisible(true);

		c1.setOnAction(e -> setColor(c1, Color.BLUE));
		c2.setOnAction(e -> setColor(c2, Color.PINK));
		c3.setOnAction(e -> setColor(c3, Color.GREEN));
		c4.setOnAction(e -> setColor(c4, Color.RED));

		add(c1, 0, 0);
		add(c2, 0, 1);
		add(c3, 1, 0);
		add(c4, 1, 1);

	}

	private void setColor(Button botao, Color color) {
		botao.setStyle("-fx-background-color: " + toRgbString(color) + ";");
	}

	private String toRgbString(Color color) {
		int r = (int) (color.getRed() * 255);
		int g = (int) (color.getGreen() * 255);
		int b = (int) (color.getBlue() * 255);

		return String.format("#%02x%02x%02x", r, g, b);
	}

}
