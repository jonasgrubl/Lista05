package pctEx09;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		
		  int linhas = 5;
	        int colunas = 2;
	        
	        int[][] matriz1 = new int[linhas][colunas];
	        int[][] matriz2 = new int[linhas][colunas];
	        int[][] matrizSoma = new int[linhas][colunas];

	    
	        System.out.println("digite os valores da primeira matriz:");
	        for (int i = 0; i < linhas; i++) {
	            for (int j = 0; j < colunas; j++) {
	                System.out.printf("matriz 1 : ", i, j);
	                matriz1[i][j] = scanner.nextInt();
	            }
	        }

	        
	        System.out.println("digite os valores da segunda matriz :");
	        for (int i = 0; i < linhas; i++) {
	            for (int j = 0; j < colunas; j++) {
	                System.out.printf("matriz 2 : ", i, j);
	                matriz2[i][j] = scanner.nextInt();
	            }
	        }

	        
	        for (int i = 0; i < linhas; i++) {
	            for (int j = 0; j < colunas; j++) {
	                matrizSoma[i][j] = matriz1[i][j] + matriz2[i][j];
	            }
	        }


	        System.out.println(" resultado: terceira matriz");
	        for (int i = 0; i < linhas; i++) {
	            for (int j = 0; j < colunas; j++) {
	                System.out.print(matrizSoma[i][j] + "\t");
	            }
	            System.out.println();
	        }
	        
	        scanner.close();
	    
	}

}
