/*Problema "media_pares "
Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR"*/

import java.util.Scanner;
import java.util.Locale;

public class media_pares
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n, i, soma_pares=0, cont_pares=0;
		double media_par;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		
		int[] vet = new int[n]; 
		
		for(i=0; i<n; i++){
		    System.out.print("Digite um numero: ");
		    vet[i]=sc.nextInt();
		    if(vet[i]%2 == 0){
		        soma_pares= soma_pares+vet[i];
		        cont_pares++;
		    }
		}
		if(cont_pares == 0){
		    System.out.println("NENHUM NUMERO PAR");
		}else{
		    media_par=(double)soma_pares/(double)cont_pares;
		    System.out.println("MEDIA DOS PARES = "+ String.format("%.1f", media_par));
		}
		
		sc.close();
	}
}
