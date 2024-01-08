/*Problema "tabuada"
Ler um número inteiro N, daí mostrar na tela a tabuada de N para 1 a 10, conforme exemplo.*/

import  java.util.Scanner;
import  java.util.Locale;

public class tabuada
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n, i, resultado=0;
		
		System.out.print("Deseja a tabuada para qual valor? ");
		n=sc.nextInt();
		for(i=1; i<11; i++){
		    resultado= n*i;
		    System.out.println(n +" X "+ i +" = "+ resultado);
		    resultado=0;
		}
	}
}
