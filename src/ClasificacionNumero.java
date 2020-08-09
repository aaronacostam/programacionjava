public class ClasificacionNumero {

	public static void main(String[] args) {
		//int[] numeros = new int []{
		    //1,-3,6,8,-9,19,-20,0,17,200 };
		       
		int[] numeros = new int [10];
		
		numeros[0] = 1;
		numeros[1] = -8;
		numeros[2] = 10;
		numeros[3] = 76;
		numeros[4] = -8;
		numeros[5] = 19;
		numeros[6] = -20;
		numeros[7] = 0;
		numeros[8] = 17;
		numeros[9] = 65;
		
		System.out.println(numeros.length);
		int cero = 0;
		int positivo = 0;
		int negativo = 0;
		int sumapositivo = 0;
		int sumanegativo = 0;
		
		for (int i = 0; i<numeros.length;i++) {
			
			if(numeros[i]== 0) 
				cero++;
			
			else if (numeros [i] > 0) {
				positivo++;
			    sumapositivo += numeros[i];
			} else { 
				negativo++;
			    sumanegativo += numeros[i];
			}
		}
		System.out.println("El total de numero cero es: " + cero);
		System.out.println("El total de numero positivos es: " + positivo);
		System.out.println("El total de numero negativos es: " + negativo);
		System.out.println("Suma de numeros positivos: " + sumapositivo);
		System.out.println("Suma de numeros negativos: " + sumanegativo);
		
		}		
		
	}

