package es.cursojava.ordeninicializacion;

public class ClaseA {
	private String nombre="Pepito";
	private String apellido="Gonzalez";
	{
		System.out.println("Hola, hola");
	}
	public ClaseA() {
		nombre="Josito";
		System.out.println("Estoy en el constructor");
	}
	public static void main(String[] args) {
		ClaseA ca=new ClaseA();
		System.out.println(ca.nombre);
	}
	{
		System.out.println(apellido);
	}
}
