/*Problema "numeros_pares"
Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares.*/

import java.util.Locale;
import java.util.Scanner;

public class numeros_pares
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n, i, qtd_pares=0;
		
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		int[] numeros = new int[n];
		
		for(i=0; i<n; i++){
		    System.out.print("Digite um numero: ");
		    numeros[i]=sc.nextInt();
		    if(numeros[i]%2 == 0){
		        qtd_pares++;
		    }
		}
		
		System.out.println("\nNUMEROS PARES: ");
		for(i=0; i<n; i++){
		    if(numeros[i]%2 == 0){
		        System.out.print(numeros[i]+" ");
		    }
		}
		
		System.out.print("\n\nQUANTIDADE DE PARES = "+ qtd_pares);
		
		sc.close();
	}
}
