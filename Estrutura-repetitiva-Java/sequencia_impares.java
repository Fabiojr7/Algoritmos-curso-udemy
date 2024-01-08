/*Problema "sequencia_impares" (adaptado de URI 1067)
Leia um valor inteiro X. Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X,
se for o caso.*/

import  java.util.Scanner;
import  java.util.Locale;

public class sequencia_impares
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int x,i;
		
		System.out.print("Digite o valor de X: ");
		x=sc.nextInt();
		for(i=1; i<x+1;i++){
		    if(i % 2 != 0){
		        System.out.println(i);
		    }
		}
	}
}
