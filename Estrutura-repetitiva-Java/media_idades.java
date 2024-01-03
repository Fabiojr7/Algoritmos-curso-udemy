/*Problema "media_idades"
Faça um programa para ler um número indeterminado de dados, contendo cada um, a idade de um
indivíduo. O último dado, que não entrará nos cálculos, contém um valor de idade negativa. Calcular
e imprimir a idade média deste grupo de indivíduos. Se for entrado um valor negativo na primeira vez,
mostrar a mensagem "IMPOSSIVEL CALCULAR".*/

import java.util.Scanner;
import java.util.Locale;

public class media_idades
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int idade, soma_idade=0,cont_idade=0; 
		double media_idade;
		
		System.out.println("Digite as idades:");
		idade=sc.nextInt();
		if(idade < 0){
		    System.out.println("IMPOSSIVEL CALCULAR");
		}else{
		    while(idade > 0){
		        soma_idade= soma_idade+idade;
		        cont_idade++;
		        idade=sc.nextInt();
		    }
		    media_idade= (double)soma_idade/(double)cont_idade;
		    System.out.println("MEDIA = "+ String.format("%.2f", media_idade));
		}
	}
}
