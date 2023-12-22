/*Problema "soma"
Fazer um programa para ler dois valores inteiros X e Y, e depois mostrar na tela o valor da soma destes
números. */

import  java.util.Scanner;
import  java.util.Locale;

public class soma
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int x,y, soma;
		
		System.out.print("Digite o valor de X: ");
		x=sc.nextInt();
	    System.out.print("Digite o valor de Y: ");
	    y=sc.nextInt();
		soma= x+y;
		
		System.out.println("SOMA = " + soma); 
		
		sc.close();
	}
}
