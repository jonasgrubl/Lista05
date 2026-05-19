package pctEx04;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matriz = {
	            {1, 2, 3, 4, 5},
	            {6, 7, 8, 9, 10},
	            {11, 12, 13, 14, 15},
	            {16, 17, 18, 19, 20},
	            {21, 22, 23, 24, 25}
	        };

	        int somaImpares = 0;

	       
	        for (int i = 0; i < 5; i++) {

	            for (int j = 0; j < 5; j++) {

	                if (matriz[i][j] % 2 != 0) {

	                    somaImpares += matriz[i][j];
	                }
	            }
	        }

	        System.out.println("Soma dos números ímpares: " + somaImpares);

	        System.out.println("\nSoma das colunas:");

	        for (int j = 0; j < 5; j++) {

	            int somaColuna = 0;

	            for (int i = 0; i < 5; i++) {

	                somaColuna += matriz[i][j];
	            }

	            System.out.println("Coluna " + j + ": " + somaColuna);
	        }

	        
	        System.out.println("\nSoma das linhas:");

	        for (int i = 0; i < 5; i++) {

	            int somaLinha = 0;

	            for (int j = 0; j < 5; j++) {

	                somaLinha += matriz[i][j];
	            }

	            System.out.println("Linha " + i + ": " + somaLinha);
		
		
	        }
		
	}

}
