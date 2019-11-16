package dad.javafx.hexagono;

import javafx.beans.binding.DoubleBinding;
import javafx.beans.binding.FloatExpression;

public class AreaHexagono extends DoubleBinding {

	private FloatExpression radio;
	
	public AreaHexagono(FloatExpression radio) {
		super();
		
		this.radio = radio;
		bind(radio);
		
		
	}
	@Override
	protected double computeValue() {
		
		double perimetro = radio.get() * 6; 
		double radioHexagono = radio.get();
		double operacion = Math.sqrt(radioHexagono*radioHexagono - (radioHexagono/2)*(radioHexagono/2));
		
		return (operacion * perimetro) / 2;
	}

}
