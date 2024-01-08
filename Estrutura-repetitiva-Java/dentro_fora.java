/*Problema "dentro_fora" (adaptado de URI 1072)
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo,
conforme exemplo*/

import  java.util.Scanner;
import  java.util.Locale;

public class dentro_fora
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n, x, i, dentro=0, fora=0;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n=sc.nextInt();
		for(i=0; i<n; i++){
		    System.out.print("Digite um numero: ");
		    x=sc.nextInt();
		    if(x >= 10 && x <= 20){
		        dentro++;
		    }else{
		        fora++;
		    }
		}
		System.out.println(dentro +" DENTRO\n"+ fora +" FORA");
	}
}
