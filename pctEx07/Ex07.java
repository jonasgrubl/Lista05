package pctEx07;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matriz = {
	            {10, 25, 30},
	            {5, 18, 40},
	            {22, 7, 15},
	            {60, 12, 9},
	            {33, 45, 2},
	            {27, 50, 14}
	        };

	        int maior = matriz[0][0];
	        int menor = matriz[0][0];

	        
	        for (int i = 0; i < 6; i++) {

	            for (int j = 0; j < 3; j++) {

	                if (matriz[i][j] > maior) {

	                    maior = matriz[i][j];
	                }

	                if (matriz[i][j] < menor) {

	                    menor = matriz[i][j];
	                }
	            }
	        }

	        
	        System.out.println("Maior elemento: " + maior);
	        System.out.println("Menor elemento: " + menor);
	    }
		
	}

