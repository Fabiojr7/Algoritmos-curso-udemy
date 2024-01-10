/*Problema "soma_vetores"
Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado.*/

import java.util.Scanner;
import java.util.Locale;

public class soma_vetores
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n, i;
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		n = sc.nextInt();
		
		int[] vet1 = new int[n]; 
		int[] vet2 = new int[n];
		int[] vet_res = new int[n];
		
		System.out.println("Digite os valores do vetor A:");
		for(i=0; i<n; i++){
		    vet1[i]=sc.nextInt();
		}
		System.out.println("Digite os valores do vetor B:");
		for(i=0; i<n; i++){
		    vet2[i]=sc.nextInt();
		    vet_res[i]=vet1[i]+vet2[i];
		}
		System.out.println("VETOR RESULTANTE:");
		for(i=0; i<n; i++){
		    System.out.println(vet_res[i]);
		}
	}
}
