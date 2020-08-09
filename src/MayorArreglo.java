public class MayorArreglo {

	public static void main(String[] args) {
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
		numeros[9] = 100;
		
		int NumeroMayor = numeros [0];
		int posicion = 0;
		
		for (int i = 0; i<numeros.length;i++) {
			if( NumeroMayor < numeros [i]) {
				NumeroMayor = numeros[i];
				posicion = i;
			}
		}
		
		System.out.println("El numero mayor es: " + NumeroMayor);
		System.out.println("La posición es: " + posicion);		
	}
}
