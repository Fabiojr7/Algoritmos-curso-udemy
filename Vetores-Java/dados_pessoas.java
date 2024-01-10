/*Problema "dados_pessoas"
Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens.*/

import java.util.Scanner;
import java.util.Locale;

public class dados_pessoas
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n, i, total_homens=0, total_mulheres=0;
		double talt_mulheres=0, med_alt_mulheres, maior_altura=0, menor_altura=0;
		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();
		
		char[] generos = new char[n];
		double[] alturas = new double[n];
		
		for(i=0; i<n; i++){
		    System.out.print("Altura da "+ (i+1) +"a pessoa: ");
		    alturas[i]=sc.nextDouble();
		    System.out.print("Genero da "+ (i+1) +"a pessoa: ");
		    generos[i]=sc.next().charAt(0);
		    if(i==0){
		        maior_altura=alturas[i];
		        menor_altura=alturas[i];
		    }else if(maior_altura < alturas[i]){
		        maior_altura=alturas[i];
		    }else if(menor_altura > alturas[i]){
		        menor_altura=alturas[i];
		    }
		    if(generos[i] == 'F'){
		        talt_mulheres=talt_mulheres+alturas[i];
		        total_mulheres++;
		    }else{
		        total_homens++;
		    }
		}
		
		System.out.print("Menor altura = "+String.format("%.2f", menor_altura)+"\nMaior altura = "+String.format("%.2f", maior_altura));
		med_alt_mulheres=talt_mulheres/(double)total_mulheres;
		System.out.print("\nMedia das alturas das mulheres = "+ String.format("%.2f", med_alt_mulheres)+"\nNumero de homens = "+total_homens);
	}
}
