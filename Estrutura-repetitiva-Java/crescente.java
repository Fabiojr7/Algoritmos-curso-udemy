/*Problema "crescente" (adaptado de URI 1113)
Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para cada X e Y uma
mensagem que indique se estes valores foram digitados em ordem crescente ou decrescente. O
programa deve finalizar quando forem digitados dois valores iguais. */

import java.util.Scanner;
import java.util.Locale;

public class crescente
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int X,Y;
		
		System.out.println("Digite dois numeros:");
		X=sc.nextInt();
		Y=sc.nextInt();
		
		while(X != Y){
		    if(X > Y){
		        System.out.println("DESCRESCENTE!");
		    }else{
		        System.out.println("CRESCENTE!");
		    }
		    System.out.println("Digite outros dois numeros:");
		    X=sc.nextInt();
		    Y=sc.nextInt();
		}
	}
}
