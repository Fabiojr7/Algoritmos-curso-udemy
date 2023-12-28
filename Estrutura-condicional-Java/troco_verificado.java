/*Problema "troco_verificado"
Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia.
O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto,
e o valor em dinheiro dado pelo cliente. Seu programa deve mostrar o valor do troco a ser devolvido
ao cliente. Se o dinheiro dado pelo cliente não for suficiente, mostrar uma mensagem informando o
valor restante conforme exemplo.*/

import  java.util.Locale;
import  java.util.Scanner;

public class troco_verificado
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
	    Scanner sc = new Scanner(System.in);
	    
	    int qtd_prod;
	    double val_prod, val_rec, val_final, troco, falta;
	    
	    System.out.print("Preço unitário do produto: ");
	    val_prod=sc.nextDouble();
	    System.out.print("Quantidade comprada: ");
	    qtd_prod=sc.nextInt();
	    System.out.print("Dinheiro recebido: ");
	    val_rec=sc.nextDouble();
	    val_final=val_prod*qtd_prod;
	    
	    if(val_rec < val_final){
	        falta=val_final-val_rec;
	        System.out.println("DINHEIRO INSUFICIENTE. FALTAM "+ String.format("%.2f", falta) +" REAIS");
	    }else{
	        troco=val_rec-val_final;
	        System.out.print("TROCO = "+ String.format("%.2f",troco));
	    }
	}
}
