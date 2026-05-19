package pctEx08;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner receba = new Scanner(System.in);

	      int[][] matriz = new int[3][3];
	      int[][] inversão = new int[3][3];

	      
	      System.out.println("diga os numeros das matrizes:");
	      for (int i = 0; i < 3; i++) {
	          for (int j = 0; j < 3; j++) {
	              System.out.print("[" + i + "][" + j + "]: ");
	              matriz[i][j] = receba.nextInt();
	          }
	      }

	      
	      for (int i = 0; i < 3; i++) {
	          for (int j = 0; j < 3; j++) {
	              inversão[j][i] = matriz[i][j];
	          }
	      }

	      
	      System.out.println("\nvalor matriz original:");
	      for (int i = 0; i < 3; i++) {
	          for (int j = 0; j < 3; j++) {
	              System.out.print(matriz[i][j] + " ");
	          }
	          System.out.println();
	      }

	     
	      System.out.println("\nvalor matriz invertida:");
	      for (int i = 0; i < 3; i++) {
	          for (int j = 0; j < 3; j++) {
	              System.out.print(inversão[i][j] + " ");
	          }
	          System.out.println();
	      }

	      receba.close();
	  }
}
