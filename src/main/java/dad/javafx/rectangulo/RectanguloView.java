package dad.javafx.rectangulo;

import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class RectanguloView extends GridPane {

	private TextField anchoText, altoText;
	private Label areaText, perimetroText;
	private Label anchoLabel, altoLabel;
	private Label areaLabel, perimetroLabel;
	private Rectangle rectanguloForma;
	
	public RectanguloView() {
		super();
		
		anchoLabel = new Label("Ancho:");
		altoLabel = new Label("Alto:");
		
		anchoText = new TextField();
		anchoText.setPromptText("Ancho");
		anchoText.setPrefColumnCount(5);
		altoText = new TextField();
		altoText.setPromptText("Alto");
		altoText.setPrefColumnCount(5);
		
		rectanguloForma = new Rectangle();
		rectanguloForma.setWidth(80);
		rectanguloForma.setHeight(60);
		rectanguloForma.setFill(Color.rgb(0, 162, 232));
		rectanguloForma.setStrokeWidth(2);
		rectanguloForma.setStroke(Color.BLACK);
		
		areaLabel = new Label("Area:");
		perimetroLabel = new Label("Perímetro:");
		
		areaText = new Label();
		perimetroText = new Label();

		addRow(0, anchoLabel, anchoText);
		addRow(1, altoLabel, altoText);
		addRow(2, rectanguloForma);
		
		setColumnSpan(rectanguloForma, 2);
		setHalignment(rectanguloForma, HPos.CENTER);
		
		addRow(3, areaLabel, areaText);
		addRow(4, perimetroLabel, perimetroText);
		
		setAlignment(Pos.CENTER);
		setHgap(15);
		setVgap(5);
	}

	public TextField getAnchoText() {
		return anchoText;
	}

	public TextField getAltoText() {
		return altoText;
	}

	public Label getAreaText() {
		return areaText;
	}

	public Label getPerimetroText() {
		return perimetroText;
	}

	public Rectangle getRectanguloForma() {
		return rectanguloForma;
	}
}
