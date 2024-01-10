/*Problema "abaixo_da_media"
Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.*/

import java.util.Scanner;
import java.util.Locale;

public class abaixo_da_media
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n, i;
		double soma_total=0, media;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		
		double[] vet = new double[n]; 
		
		
		for(i=0; i<n; i++){
		    System.out.print("Digite um numero: ");
		    vet[i]=sc.nextDouble();
		    soma_total=soma_total+vet[i];
		}
		media=soma_total/n;
		System.out.println("\nMEDIA DO VETOR = "+ String.format("%.3f",media));
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for(i=0; i<n; i++){
		    if(vet[i]<media){
		        System.out.println(String.format("%.1f", vet[i]));
		    }
		}
		
		sc.close();
	}
}
