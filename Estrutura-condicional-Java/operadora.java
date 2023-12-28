/*Problema "operadora"
Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito a 100 minutos de
telefone. Cada minuto que exceder a franquia de 100 minutos custa R$ 2.00. Fazer um programa para
ler a quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a ser pago. */

import  java.util.Locale;
import  java.util.Scanner;

public class operadora
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
	    Scanner sc = new Scanner(System.in);
	    
	    int qtd_minutos;
	    double valor_final=50.00;
	    
	    System.out.print("Digite a quantidade de minutos: ");
	    qtd_minutos=sc.nextInt();
	    
	    if(qtd_minutos<=100){
	        System.out.println("Valor a pagar: R$ "+ String.format("%.2f", valor_final));
	    }else{
	        valor_final= (valor_final+(((double)qtd_minutos-100)*2.00));
	        System.out.println("Valor a pagar: R$ "+ String.format("%.2f", valor_final));
	    }
	}
}
