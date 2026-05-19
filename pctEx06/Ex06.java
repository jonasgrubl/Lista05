package pctEx06;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[][] matriz = {
		            {10, 20},
		            {30, 40},
		            {50, 60},
		            {70, 80},
		            {90, 100}
		        };

		        int soma = 0;
		        int quantidade = 0;
		        double media;

		        for (int i = 0; i < 5; i++) {

		            	for (int j = 0; j < 2; j++) {

		            		soma += matriz[i][j];
		            		quantidade++;
		            }
		        }

		        
		        	media = (double) soma / quantidade;

		        
		        	System.out.println("A média dos elementos da matriz é: " + media);
		    }
	}

