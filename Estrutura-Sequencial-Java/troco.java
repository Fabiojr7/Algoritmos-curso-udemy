/*Problema "troco"
Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia.
O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto,
e o valor em dinheiro dado pelo cliente (suponha que haja dinheiro suficiente). Seu programa deve
mostrar o valor do troco a ser devolvido ao cliente. */

import  java.util.Scanner;
import  java.util.Locale;

public class troco
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int qtd_comp;
		double valor_prod, valor_receb, troco;
		
		System.out.print("Preço unitário do produto: ");
		valor_prod=sc.nextDouble();
	    System.out.print("Quantidade comprada: ");
	    qtd_comp=sc.nextInt();
		System.out.print("Dinheiro recebido: ");
		valor_receb=sc.nextDouble();
		troco= valor_receb-(valor_prod*(double)qtd_comp);
		
		System.out.println("TROCO = " + String.format("%.2f", troco)); 
		
		sc.close();
	}
}
