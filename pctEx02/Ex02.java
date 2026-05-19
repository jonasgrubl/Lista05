package pctEx02;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] letras = {
	            {"a", "b", "c", "d", "e"},
	            {"f", "g", "h", "i", "j"},
	            {"l", "m", "n", "o", "p"},
	            {"q", "r", "s", "t", "u"}
	        };

	        int[][] numeros = {
	            {19, 25, 100, 99},
	            {10, 7, 25, 14},
	            {35, 2, 47, 74}
	        };

	        double[][] numdecimal = {
	            {1.9, 2.5, 10.0},
	            {1.0, 7.5, 2.5},
	            {3.5, 2.2, 4.7}
	        };

	        System.out.println("Matriz de letras:");

	        for (int i = 0; i < letras.length; i++) {

	            for (int j = 0; j < letras[i].length; j++) {

	                System.out.print(letras[i][j] + " ");
	            }

	            System.out.println();
	        }

	        System.out.println("\nMatriz de números:");

	        for (int i = 0; i < numeros.length; i++) {

	            for (int j = 0; j < numeros[i].length; j++) {

	                System.out.print(numeros[i][j] + " ");
	            }

	            System.out.println();
	        }

	        System.out.println("\nMatriz decimal:");

	        for (int i = 0; i < numdecimal.length; i++) {

	            for (int j = 0; j < numdecimal[i].length; j++) {

	                System.out.print(numdecimal[i][j] + " ");
	            }

	            System.out.println();
	        }
	}}
