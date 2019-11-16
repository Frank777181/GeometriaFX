package dad.javafx.circulo;

import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class CirculoView extends GridPane {

	private Circle circulo;
	private Label areaLabelText, perimetroLabelText;
	private Label radioLabel;
	private Label areaLabel, perimetroLabel;
	private TextField textoRadio;
	
	public CirculoView() {
		super();
		
		circulo = new Circle();
		circulo.setFill(Color.RED);
		circulo.setStrokeWidth(4);
		circulo.setStroke(Color.BLACK);
		
		radioLabel = new Label("Radio del circulo:");
		
		textoRadio = new TextField();
		textoRadio.setPromptText("Radio");
		textoRadio.setPrefColumnCount(5);
		
		areaLabel = new Label("Area del circulo:");
		perimetroLabel = new Label("Perímetro:");
		
		areaLabelText = new Label();
		perimetroLabelText = new Label();
		
		addRow(0, radioLabel, textoRadio);
		addColumn(3, circulo);
		
		setColumnSpan(circulo, 2);
		setHalignment(circulo, HPos.CENTER);
		
		addRow(1, areaLabel, areaLabelText);
		addRow(2, perimetroLabel, perimetroLabelText);
		
		setAlignment(Pos.CENTER);
		setHgap(10);
		setVgap(5);
	}

	public TextField getRadioTexto() {
		return textoRadio;
	}

	public Label getAreaLabelTexto() {
		return areaLabelText;
	}

	public Label getPerimetroLabelTexto() {
		return perimetroLabelText;
	}

	public Circle getCirculo() {
		return circulo;
	}
}
