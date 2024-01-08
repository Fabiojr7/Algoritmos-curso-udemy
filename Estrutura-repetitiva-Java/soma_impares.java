/*Problema "soma_impares" (adaptado de URI 1071)
Leia 2 valores inteiros X e Y (em qualquer ordem). A seguir, calcule e mostre a soma dos números
impares entre eles. */

import  java.util.Scanner;
import  java.util.Locale;

public class soma_impares
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int x, y, i, resultado=0;
		
		System.out.println("Digite dois numeros:");
		x=sc.nextInt();
		y=sc.nextInt();
		if(x < y){
		    for(i=x+1; i < y; i++){
    		  if(i % 2 != 0){
    		      resultado= resultado+i;
		        }
		    }
		}else{
		    for(i=y+1; i < x; i++){
    		  if(i % 2 != 0){
    		      resultado= resultado+i;
		        }
		    }
		}
		System.out.println("SOMA DOS IMPARES = "+ resultado);
	}
}
