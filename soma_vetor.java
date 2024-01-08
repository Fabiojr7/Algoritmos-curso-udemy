/*Problema "soma_vetor"
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor*/

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n, i;
		double soma=0, media;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		double[] vet = new double[n];
		for(i=0; i<n; i++){
		    System.out.print("Digite um numero: ");
		    vet[i]=sc.nextDouble();
		}
		System.out.print("VALORES = ");
		for(i=0; i<n; i++){
		        System.out.print(String.format("%.1f",vet[i])+" ");
		        soma=soma+vet[i];
		}
		media=soma/n;
		
		System.out.print("\nSOMA = "+ String.format("%.2f", soma)+"\nMEDIA = "+ String.format("%.2f", media));
		
		sc.close();
	}
}
