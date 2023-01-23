package package1;

public class CIRCULO {
	
	public double radio;
	
	
	public CIRCULO(float radio) {
		this.radio = radio;
	}
	CIRCULO(){
		this(178607);
	}
	public double impresionA() {
		float pi=(float)Math.PI;
		double circunferencia = (2*pi)*radio;
		return circunferencia;
	}
	public double impresionB() {
		float pi=(float) Math.PI;
		double area=pi*((double)Math.pow(radio, 2));
		return area;
	}
}
