package dad.javafx.rectangulo;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyDoubleWrapper;
import javafx.beans.property.SimpleDoubleProperty;

public class RectanguloModel {

	private DoubleProperty ancho = new SimpleDoubleProperty();
	private DoubleProperty alto = new SimpleDoubleProperty();
	
	private ReadOnlyDoubleWrapper area = new ReadOnlyDoubleWrapper();
	private ReadOnlyDoubleWrapper perimetro = new ReadOnlyDoubleWrapper();
	
	public RectanguloModel() {
		
		area.bind(ancho.multiply(alto));
		perimetro.bind(ancho.add(alto).multiply(2));
	}

	public final DoubleProperty anchoProperty() {
		return this.ancho;
	}
	

	public final double getAncho() {
		return this.anchoProperty().get();
	}
	

	public final void setAncho(final double ancho) {
		this.anchoProperty().set(ancho);
	}
	

	public final DoubleProperty alturaProperty() {
		return this.alto;
	}
	

	public final double getaltura() {
		return this.alturaProperty().get();
	}
	

	public final void setAltura(final double height) {
		this.alturaProperty().set(height);
	}
	

	public final javafx.beans.property.ReadOnlyDoubleProperty areaProperty() {
		return this.area.getReadOnlyProperty();
	}
	

	public final double getArea() {
		return this.areaProperty().get();
	}
	

	public final javafx.beans.property.ReadOnlyDoubleProperty perimetroProperty() {
		return this.perimetro.getReadOnlyProperty();
	}
	

	public final double getPerimetro() {
		return this.perimetroProperty().get();
	}
	
}
