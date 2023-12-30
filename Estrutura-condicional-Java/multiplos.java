/*Problema "multiplos" (adaptado de URI 1044)
Fazer um programa para ler dois números inteiros, e dizer se um número é múltiplo do outro. Os
números podem ser digitados em qualquer ordem. */

import java.util.Scanner;
import java.util.Locale;

public class multiplos
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n1,n2;
		
		System.out.println("Digite dois numeros inteiros:");
		n1=sc.nextInt();
		n2=sc.nextInt();
	    if(n1%n2 == 0 || n2%n1 == 0){
	        System.out.println("Sao multiplos");
	    }else{
	        System.out.println("Nao sao multiplos");
	    }
	}
}
