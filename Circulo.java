package figurasGeometricas;


public class Circulo {

    private float raio;

    public static final double PI = 3.14;
    public Circulo(float Raio) {
    
    }
    public double CalcularPerimetro() {
    	return 2 * raio * PI;
    }
    public double calcularArea() {
    	return raio * raio *PI;
    }
    public float getRaio() {
    	return raio;
    }
	public static double getPi() {
		return PI;
	}
	public void setRaio(float raio) {
		this.raio = raio;
	}
}