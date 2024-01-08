/*Problema "pares_consecutivos" (adaptado de URI 1159)
O programa deve ler um valor inteiro X indefinidas vezes. (O programa irá parar quando o valor de X
for igual a 0). Para cada X lido, imprima a soma dos 5 pares consecutivos a partir de X, inclusive o X
, se for par. Se o valor de entrada for 4, por exemplo, a saída deve ser 40, que é o resultado da operação:
4+6+8+10+12, enquanto que se o valor de entrada for 11, por exempo, a saída deve ser 80, que é a
soma de 12+14+16+18+20. */

import  java.util.Scanner;
import  java.util.Locale;

public class pares_consecutivos
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int x, soma_total=0, aux=0;
		
		System.out.print("Digite um numero inteiro: ");
		x=sc.nextInt();
	    while(x != 0){
	        if(x % 2 == 0){
	            while(aux!=5){
	                 soma_total= soma_total+x;
	                 x= x+2;
	                 aux++;
	            }
	            aux=0;
	        }else{
	            x=x+1;
	            while(aux!=5){
	                 soma_total= soma_total+x;
	                 x= x+2;
	                 aux++;
	            }
	            aux=0;
	        }
	        System.out.println("SOMA = " + soma_total);
	        soma_total=0;
	        System.out.print("Digite um numero inteiro: ");
		    x=sc.nextInt();
	    }
	}
}
