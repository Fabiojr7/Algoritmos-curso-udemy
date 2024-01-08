/*Problema "divisao" (adaptado de URI 1116)
Escreva um algoritmo que leia dois números e imprima o resultado da divisão do primeiro pelo
segundo. Caso não for possível, mostre a mensagem “DIVISAO IMPOSSIVEL”.*/

import  java.util.Scanner;
import  java.util.Locale;

public class divisao
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n, i, v1, v2;
	    double resultado;
		
		System.out.print("Quantos casos voce vai digitar? ");
		n=sc.nextInt();
		for(i=0; i<n; i++){
		    System.out.print("Entre com o numerador: ");
		    v1=sc.nextInt();
		    System.out.print("Entre com o denominador: ");
		    v2=sc.nextInt();
		    if(v2 == 0){
		        System.out.println("DIVISAO IMPOSSIVEL");
		    }else{
		        resultado = (double)v1/(double)v2;
		        System.out.println("DIVISAO = "+ String.format("%.2f",resultado));
		    }
		}
	}
}
