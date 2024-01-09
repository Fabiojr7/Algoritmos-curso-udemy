/*Problema "alturas"
Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.*/

import java.util.Locale;
import java.util.Scanner;

public class alturas
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n, i, menor=0;
		double media_alt, total_alt=0, perc_menor;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];
		
		for(i=0; i<n; i++){
		    System.out.println("Dados da "+ (i+1) +"a pessoa:");
		    System.out.print("Nome: ");
		    sc.nextLine();
		    nomes[i]=sc.nextLine();
		    System.out.print("Idade: ");
		    idades[i]=sc.nextInt();
		    if(idades[i] < 16){
		        menor++;
		    }
		    System.out.print("Altura: ");
		    alturas[i]=sc.nextDouble();
		    total_alt=total_alt+alturas[i];
		}
		
		media_alt=total_alt/(double)n;
		System.out.println("\nAltura média: "+ String.format("%.2f", media_alt));
		perc_menor=((double)menor/n)*100.0;
		System.out.println("Pessoas com menos de 16 anos: "+ String.format("%.1f", perc_menor)+"%");
		for(i=0; i<n; i++){
		    if(idades[i]<16){
		        System.out.println(nomes[i]);
		    }
		}
		
		sc.close();
	}
}
