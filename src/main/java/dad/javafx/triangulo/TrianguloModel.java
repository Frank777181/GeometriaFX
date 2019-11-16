package dad.javafx.triangulo;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyDoubleWrapper;
import javafx.beans.property.SimpleDoubleProperty;

public class TrianguloModel {

	private DoubleProperty base = new SimpleDoubleProperty();
	private DoubleProperty altura = new SimpleDoubleProperty();
	
	private ReadOnlyDoubleWrapper area = new ReadOnlyDoubleWrapper();
	private ReadOnlyDoubleWrapper perimetro = new ReadOnlyDoubleWrapper();
	
	public TrianguloModel() {
		
		area.bind(base.multiply(altura).divide(2)); // (Base * altura) / 2
		perimetro.bind(altura.multiply(2).add(base)); // 2 * Altura + Base
	}

	public final DoubleProperty baseProperty() {
		return this.base;
	}
	

	public final double getBase() {
		return this.baseProperty().get();
	}
	

	public final void setBase(final double base) {
		this.baseProperty().set(base);
	}
	

	public final DoubleProperty alturaProperty() {
		return this.altura;
	}
	

	public final double getHeight() {
		return this.alturaProperty().get();
	}
	

	public final void setHeight(final double height) {
		this.alturaProperty().set(height);
	}
	

	public final javafx.beans.property.ReadOnlyDoubleProperty areaProperty() {
		return this.area.getReadOnlyProperty();
	}
	

	public final double getArea() {
		return this.areaProperty().get();
	}
	

	public final javafx.beans.property.ReadOnlyDoubleProperty perimeterProperty() {
		return this.perimetro.getReadOnlyProperty();
	}
	

	public final double getPerimeter() {
		return this.perimeterProperty().get();
	}
	

	
}
