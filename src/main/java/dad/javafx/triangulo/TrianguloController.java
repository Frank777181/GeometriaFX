package dad.javafx.triangulo;

import javafx.beans.binding.Bindings;
import javafx.util.converter.NumberStringConverter;

public class TrianguloController {

	private TrianguloModel model;
	private TrianguloView view;
	
	public TrianguloController() {
		
		model = new TrianguloModel();
		view = new TrianguloView();
		
		model.baseProperty().setValue(50);
		model.alturaProperty().setValue(50);
		view.getBaseText().textProperty().bindBidirectional(model.baseProperty(), new NumberStringConverter());
		view.getAlturaText().textProperty().bindBidirectional(model.alturaProperty(), new NumberStringConverter());
		
		view.getAreaText().textProperty().bind(Bindings.selectString(model.areaProperty()));
		view.getPerimetroText().textProperty().bind(Bindings.selectString(model.perimeterProperty()));
		view.getTrianguloForma().baseProperty().bind(model.baseProperty());
		view.getTrianguloForma().alturaProperty().bind(model.alturaProperty());
	}
	
	public TrianguloView getRoot() {
		return view;
	}
}
