package pctEx03;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int[][] numeros = {
			    {1, 2, 2,},
			    {3, 2, 3, },
			    {4, 1, 1, }
		};
			  for (int i = 0; i < numeros.length; i++) {

				    int soma = 0;

				    for (int j = 0; j < numeros[i].length; j++) {

				        soma += numeros[i][j];
				    }

				    System.out.println("Soma da linha " + i + ": " + soma);
				}
		
		
	}

}
