package persona;

public class Persona {

	private String nombre;
	private int edad;
	private float peso;
	private float altura;
	
	
	public Persona () {
	}
	
	public Persona(String nombre, int edad, float peso, float altura) {
		this.nombre=nombre;
		this.edad=edad;
		this.peso=peso;
		this.altura=altura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public boolean esMayorEdad(int edad) {
		if (edad<19) {
			return true;
		} else {
			return false;
		}
	}
	
	public void calcularIMC(float peso, float altura) {
		float IMC;
		
		IMC=peso/(altura*altura);
		
		if (IMC<18.5) {
			System.out.println("peso insuficiente");
		} else if ((IMC>=18.5) && (IMC<25)) {
			System.out.println("peso normal");
		} else if ((IMC>=25) && (IMC<30)) {
			System.out.println("sobrepeso");
		} else {
			System.out.println("obesidad");
		}	
}
}

