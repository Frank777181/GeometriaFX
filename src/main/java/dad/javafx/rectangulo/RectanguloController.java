package dad.javafx.rectangulo;

import javafx.beans.binding.Bindings;
import javafx.util.converter.NumberStringConverter;

public class RectanguloController {

	private RectanguloModel model;
	private RectanguloView view;
	
	public RectanguloController() {
		
		model = new RectanguloModel();
		view = new RectanguloView();
		
		model.anchoProperty().setValue(50);
		model.alturaProperty().setValue(50);
		
		view.getAnchoText().textProperty().bindBidirectional(model.anchoProperty(), new NumberStringConverter());
		view.getAltoText().textProperty().bindBidirectional(model.alturaProperty(), new NumberStringConverter());
		
		view.getAreaText().textProperty().bind(Bindings.selectString(model.areaProperty()));
		view.getPerimetroText().textProperty().bind(Bindings.selectString(model.perimetroProperty()));
		
		view.getRectanguloForma().widthProperty().bind(model.anchoProperty());
		view.getRectanguloForma().heightProperty().bind(model.alturaProperty());
		
	}
	
	public RectanguloView getRoot() {
		return view;
	}
}
