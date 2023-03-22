package main.java.ieseuropa;

public class Array {
	
	public static double mediana (int [] a) {
		Arrays.sort(a);
		double mediana = 0;
		if (a.length % 2 != 0) {
			mediana = a[(a.length/2)];
		}else {
			int n = a[a.length / 2 - 1];
			int m = a[a.length / 2];
			mediana = (n+m) / 2;
		}
		return mediana;
	}
	private static int mayor(int[] numeros) {
		int num = Integer.MIN_VALUE;
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i]>num) num = numeros[i];
		}
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola");
		int [] a = {3, 6, 2, 7, 4, 8}
		System.out.println(mediana(a));
		System.out.println("El número mayor del array es: " + mayor(a));
	}

}
