/*Problema "negativos"
Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.*/

import java.util.Locale;
import java.util.Scanner;

public class negativos
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n, i;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		int[] vet = new int[n];
		for(i=0; i<n; i++){
		    System.out.print("Digite um numero: ");
		    vet[i]=sc.nextInt();
		}
		System.out.println("NUMEROS NEGATIVOS:");
		for(i=0; i<n; i++){
		    if(vet[i] < 0){
		        System.out.println(vet[i]);
		    }
		}
		
		sc.close();
	}
}
