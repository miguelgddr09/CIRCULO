package package1;

public class CIRCULO {
	
	public double radio;
	public double circunferencia, area, pi;
	public CIRCULO(float radio) {
		this.radio = radio;
		//c=2pi*R
		//A=pi*r^2
		pi=Math.PI;
	}
	CIRCULO(){
		this(178607);
	}
	public double impresionA() {
		circunferencia = (2*pi)*radio;
		return circunferencia;
	}
	public double impresionB() {
		area=pi*((double)Math.pow(radio, 2));
		return area;
	}
}
