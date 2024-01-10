/*Problema "aprovados"
Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis).*/

import java.util.Scanner;
import java.util.Locale;

public class aprovados
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n, i;
		double media;
		System.out.print("Quantos alunos serao digitados? ");
		n = sc.nextInt();
		
		String[] nomes = new String[n];
		double[] notas1 = new double[n];
		double[] notas2 = new double[n];
		
		for(i=0; i<n; i++){
		    System.out.println("Digite nome, primeira e segunda nota do "+ (i+1) +"o aluno:");
		    sc.nextLine();
		    nomes[i]=sc.nextLine();
		    notas1[i]=sc.nextDouble();
		    notas2[i]=sc.nextDouble();
		}
		System.out.println("Alunos aprovados:");
        for(i=0; i<n; i++){
            media=(notas1[i]+notas2[i])/2;
            if(media >= 6.0){
                System.out.println(nomes[i]);
            }
        }
	}
}
