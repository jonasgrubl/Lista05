package pctEx01;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [][] Clientes = new String [5][5];
		Clientes[0][0]= "joao roberto";
		Clientes[0][1]= "rua das flores";
		Clientes[0][2]="cerejeiras";
		Clientes[0][3]="15991065012";
		Clientes[0][4]=" 50352119837;";
		Clientes[1][0]="maria silva";
		Clientes[1][1]="avenida dos anjos, n 01";
		Clientes[1][2]="cidade alta";
		Clientes[1][3]="15991065012";
		Clientes[1][4]="50352119837";
		Clientes[2][0]="pedro amaro";
		Clientes[2][1]="rua da liberdade";
		Clientes[2][2]="praça 67";
		Clientes[2][3]="15991065012";
		Clientes[2][4]="50352119837";
		//aqui vamos imprimir os clientes:
		for (int lin = 0; lin <3; lin++) {
			System.out.println("nome:"+ Clientes[lin][0]);
			System.out.println("endereço:" +Clientes[lin][1]);
			System.out.println("bairro:" + Clientes[lin][2]);
			System.out.println("numero de telefone: "+ Clientes[lin][3]);
			System.out.println("cpf:" + Clientes[lin][4]);
			System.out.println(" ");
			

	}
	}}
