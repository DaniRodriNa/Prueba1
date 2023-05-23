package es.cursojava.vararg;

public class Media {
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
