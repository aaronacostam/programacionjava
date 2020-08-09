public class SumaVectores {

	public static void main(String[] args) {
		int [] v1 = new int [] {
				1,-3, 6,8,-9,19,-20,0,200,200
		};
		int [] v2 = new int [] {
				1,-3, 1,80,-9,19,-20,0,-50,200
		};
		int totalv1 = 0, totalv2 = 0;
		
		for (int i = 0; i < v1.length;i++) {
			totalv1 += v1[i];
			totalv2 += v2[i];
		}
		if (totalv1 > totalv2) {
			System.out.println("Vector 1 es mayor: "+ totalv1);
		} else if (totalv2 > totalv1){
			System.out.println("Vector 2 es mayor: "+ totalv2);
		} else {
			System.out.println("Vector 1 y 2 son iguales: "+ totalv1);
		}

	}

}
