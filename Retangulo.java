package figurasGeometricas;

public class Retangulo {

    private float base;
    private float altura;

    public Retangulo(float altura,float base)
    {
        
    }

    public void setBase(float base) {
		this.base = base;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float calcularPerimetro()
    {
        return (2 * base + 2 * altura);
    }

    public float calcularArea() {
        return base * altura;
    }

    public float getAltura() {
        return altura;
    }
    public float getBase(){
        return base;
    }
}