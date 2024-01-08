/*Problema "par_impar" (adaptado de URI 1074)
Leia um valor inteiro N. Este valor será a quantidade de números inteiros que serão lidos em seguida.
Para cada valor lido, mostre uma mensagem dizendo se este valor lido é PAR ou IMPAR, e também
se é POSITIVO ou NEGATIVO. No caso do valor ser igual a zero (0), seu programa deverá imprimir
apenas NULO.*/

import  java.util.Scanner;
import  java.util.Locale;

public class par_impar
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n, x, i;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n=sc.nextInt();
		for(i=0; i<n; i++){
		    System.out.print("Digite um numero: ");
		    x=sc.nextInt();
		    if(x == 0){
		        System.out.println("NULO");
		    }else if(x % 2 != 0){
		        if(x > 0){
		           System.out.println("IMPAR POSITIVO");
		        }else{
		           System.out.println("IMPAR NEGATIVO");
		        }
		    }else{
		        if(x > 0){
		           System.out.println("PAR POSITIVO");
		        }else{
		           System.out.println("PAR NEGATIVO");
		        }
		    }
		}
	}
}
