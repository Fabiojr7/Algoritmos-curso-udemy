/*Problema "fatorial" (adaptado de URI 1153)
Fazer um programa para ler um número natural N (valor máximo: 15), e depois calcular e mostrar o
fatorial de N.*/

import  java.util.Scanner;
import  java.util.Locale;

public class fatorial
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n, i, resultado=1;
		
		System.out.print("Digite o valor de N: ");
		n=sc.nextInt();
		if(n != 0){
    		for(i=n; i>0; i--){
    		    resultado= resultado*i;
    		}
		}
		System.out.println("FATORIAL = " + resultado);
	}
}
