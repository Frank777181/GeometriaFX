package dad.javafx.hexagono;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.ReadOnlyFloatProperty;
import javafx.beans.property.ReadOnlyFloatWrapper;
import javafx.beans.property.SimpleFloatProperty;

public class HexagonModel {

	private FloatProperty radio = new SimpleFloatProperty();
	
	private ReadOnlyFloatWrapper area = new ReadOnlyFloatWrapper();
	private ReadOnlyFloatWrapper perimetro = new ReadOnlyFloatWrapper();
	
	
	public HexagonModel() {
		
		area.bind(new AreaHexagono(radioProperty()));
		perimetro.bind(radio.multiply(6));
	}


	public final FloatProperty radioProperty() {
		return this.radio;
	}
	


	public final float getRadio() {
		return this.radioProperty().get();
	}
	


	public final void setRadio(final float radius) {
		this.radioProperty().set(radius);
	}
	


	public final ReadOnlyFloatProperty areaProperty() {
		return this.area;
	}
	


	public final float getArea() {
		return this.areaProperty().get();
	}
	


	public final ReadOnlyFloatProperty perimetroProperty() {
		return this.perimetro;
	}
	


	public final float getPerimeter() {
		return this.perimetroProperty().get();
	}
	


	
	
	
	
	
	
}
