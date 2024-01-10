/*Problema "mais_velho"
Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha.*/

import java.util.Scanner;
import java.util.Locale;

public class mais_velho
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n, i, pos_maior=0;
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		
		for(i=0; i<n; i++){
		    System.out.println("Dados da "+ (i+1) +"a pessoa:");
		    System.out.print("Nome: ");
		    sc.nextLine();
		    nomes[i]=sc.nextLine();
		    System.out.print("Idade: ");
		    idades[i]=sc.nextInt();
		    if(i==0){
		        pos_maior=i;
		    }else if(idades[pos_maior] < idades[i]){
		        pos_maior=i;
		    }
		}
		
		System.out.print("PESSOA MAIS VELHA: "+ nomes[pos_maior]);
	}
}
