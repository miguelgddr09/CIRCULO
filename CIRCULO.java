package package1;

public class CIRCULO {
	
	public double radiox;
	public double circunferencia, area, pi;
	public CIRCULO(float radio) {
		radiox = radio;
		//c=2pi*R
		//A=pi*r^2
		pi=Math.PI;
		circunferencia = (2*pi)*radiox;
		area=pi*((double)Math.pow(radiox, 2));
	}
	
	public double impresionA() {
		return circunferencia;
	}
	public double impresionB() {
		return area;
	}
}
