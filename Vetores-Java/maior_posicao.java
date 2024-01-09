/*Problema "maior_posicao"
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero).*/

import java.util.Locale;
import java.util.Scanner;

public class maior_posicao
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n, i, pos_maior=0;
		double maior_val=0;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		double[] numeros = new double[n];
		
		for(i=0; i<n; i++){
		    System.out.print("Digite um numero: ");
		    numeros[i]=sc.nextDouble();
		    if(i == 0){
		        maior_val=numeros[i];
		        pos_maior=i;
		    }else if(numeros[i]>maior_val){
		        maior_val=numeros[i];
		        pos_maior=i;
		    }
		}
		
		System.out.print("\nMAIOR VALOR = "+ String.format("%.1f", maior_val)+"\nPOSICAO DO MAIOR VALOR = "+pos_maior);
		
		sc.close();
	}
}
