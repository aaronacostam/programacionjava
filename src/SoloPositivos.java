import java.util.Scanner;
public class SoloPositivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
		
		int i=0;
		while(i<5) {
			//i++;
			System.out.println("Leer numero (" + i + "): ");
	        int numero = in.nextInt();
	        if(numero>0)
	        	System.out.println("numero: " + numero);
	        i++;
		}
		
		/*
		for(int i=0;i<5;i++) {
			System.out.println("Leer numero (" + i + "): ");
	        int numero = in.nextInt();
	        if(numero>0)
	        	System.out.println("numero: " + numero);
		}
		*/
		
		
		
		/*
		int promedio = 100;
		int contador = 10;
		
		if(promedio >= 70) {
			
			contador = 90;
			if(promedio <= 90) {
				contador = 100;
			}
		}
		System.out.println(contador);
		*/


	}

}
