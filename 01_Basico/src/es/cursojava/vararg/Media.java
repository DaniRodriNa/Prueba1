package es.cursojava.vararg;

public class Media {
	//Metodo media(): calcula la media de una cantidad de numeros que les pasamos por parametro
	public float media(int...nums) {
		int sum=0;
		float resultado=0;
		if(nums.length>0) {
			for(int x:nums) {
				sum+=x;
			}
			resultado=(float)sum/nums.length;
		}
		return resultado;
	}
}
