package es.cursojava.ordeninicializacion;

public class ClaseA {
	/**
	 * String nombre-> almacena el nombre de una persona tipo String
	 * String apellido-> almacena el apellido de una persona tipo String
	 */
	private String nombre="Pepito";
	private String apellido="Gonzalez";
	
	//Bloque de inicialización
	{
		System.out.println("Hola, hola");
	}
	//Constructor de la clase
	public ClaseA() {
		nombre="Josito";
		System.out.println("Estoy en el constructor");
	}
	public static void main(String[] args) {
		//Instanciamos la clase y la ejecutamos con el main
		ClaseA ca=new ClaseA();
		System.out.println(ca.nombre);
	}
	{
		System.out.println(apellido);
	}
}
