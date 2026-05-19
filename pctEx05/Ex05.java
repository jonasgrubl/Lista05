package pctEx05;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {10, 11, 12}
        };

        int valor;
        boolean encontrado = false;

        System.out.print("Digite um valor: ");
        valor = sc.nextInt();

               for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 3; j++) {

                if (matriz[i][j] == valor) {

                    encontrado = true;
                }
            }
        }

        
        if (encontrado) {

            System.out.println("O valor se encontra na matriz");

        } else {

            System.out.println("O valor nao se encontra na matriz");
        }

        sc.close();
    
	}

}
