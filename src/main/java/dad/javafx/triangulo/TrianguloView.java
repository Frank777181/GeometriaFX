package dad.javafx.triangulo;

import dad.javafx.recursosFormas.Triangulo;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class TrianguloView extends GridPane {

	private TextField baseText, alturaText;
	private Label areaText, perimetroText;
	private Label baseLabel, alturaLabel;
	private Label areaLabel, perimetroLabel;
	private Triangulo trianguloForma;
	
	public TrianguloView() {
		super();
		
		baseLabel = new Label("Base:");
		alturaLabel = new Label("Altura:");
		
		baseText = new TextField();
		baseText.setPromptText("Base");
		baseText.setPrefColumnCount(5);
		alturaText = new TextField();
		alturaText.setPromptText("Altura");
		alturaText.setPrefColumnCount(5);
		
		trianguloForma = new Triangulo(80,60);
		trianguloForma.setFill(Color.GREEN);
		trianguloForma.setStrokeWidth(2);
		trianguloForma.setStroke(Color.BLACK);	
		
		areaLabel = new Label("Area:");
		perimetroLabel = new Label("Perímetro:");
		
		areaText = new Label();
		perimetroText = new Label();

		addRow(0, baseLabel, baseText);
		addRow(1, alturaLabel, alturaText);
		addRow(2, trianguloForma);
		
		setColumnSpan(trianguloForma, 2);
		setHalignment(trianguloForma, HPos.CENTER);
		
		addRow(3, areaLabel, areaText);
		addRow(4, perimetroLabel, perimetroText);
		
		setAlignment(Pos.CENTER);
		setHgap(15);
		setVgap(5);
	}

	public TextField getBaseText() {
		return baseText;
	}

	public void setBaseText(TextField baseText) {
		this.baseText = baseText;
	}

	public TextField getAlturaText() {
		return alturaText;
	}

	public void setAlturaText(TextField alturaText) {
		this.alturaText = alturaText;
	}

	public Label getAreaText() {
		return areaText;
	}

	public void setAreaText(Label areaText) {
		this.areaText = areaText;
	}

	public Label getPerimetroText() {
		return perimetroText;
	}

	public void setPerimetroText(Label perimetroText) {
		this.perimetroText = perimetroText;
	}

	public Label getBaseLabel() {
		return baseLabel;
	}

	public void setBaseLabel(Label baseLabel) {
		this.baseLabel = baseLabel;
	}

	public Label getAlturaLabel() {
		return alturaLabel;
	}

	public void setAlturaLabel(Label alturaLabel) {
		this.alturaLabel = alturaLabel;
	}

	public Label getAreaLabel() {
		return areaLabel;
	}

	public void setAreaLabel(Label areaLabel) {
		this.areaLabel = areaLabel;
	}

	public Label getPerimetroLabel() {
		return perimetroLabel;
	}

	public void setPerimetroLabel(Label perimetroLabel) {
		this.perimetroLabel = perimetroLabel;
	}

	public Triangulo getTrianguloForma() {
		return trianguloForma;
	}

	public void setTrianguloForma(Triangulo trianguloForma) {
		this.trianguloForma = trianguloForma;
	}

	
}
