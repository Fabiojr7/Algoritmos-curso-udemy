/*Problema "experiencias" (adaptado de URI 1094)
Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para
organizar os experimentos de um laboratório o qual ela é responsável. Ela quer saber no final do ano,
quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada. Este
laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. Para obter estas
informações, ela sabe exatamente o número de experimentos que foram realizados, o tipo de cobaia
utilizada e a quantidade de cobaias utilizadas em cada experimento. Faça um programa que leia um
valor inteiro N que indica os vários casos de teste que vem a seguir. Cada caso de teste contém um
inteiro que representa a quantidade de cobaias utilizadas e uma letra ('C', 'R' ou 'S'), indicando o tipo
de cobaia (R:Rato S:Sapo C:Coelho). Apresente o total de cobaias utilizadas, o total de cada tipo de
cobaia utilizada e o percentual de cada uma em relação ao total de cobaias utilizadas, sendo que o
percentual deve ser apresentado com dois dígitos após o ponto. */

import  java.util.Scanner;
import  java.util.Locale;

public class experiencias
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n, i, resultado=1, qtd_cobaias, qtd_total=0, rat=0, sap=0, co=0;
		double perc_rat, perc_sap, perc_co;
		char tipo_cobaia;
		
		System.out.print("Digite o valor de N: ");
	    n=sc.nextInt();
	    for(i=0; i<n; i++){
	        System.out.print("Quantidade de cobaias: ");
	        qtd_cobaias=sc.nextInt();
	        qtd_total=qtd_total+qtd_cobaias;
	        System.out.print("Tipo de cobaia: ");
	        sc.nextLine();
	        tipo_cobaia=sc.next().charAt(0);
	        if(tipo_cobaia == 'C'){
	            co= co+qtd_cobaias;
	        }else if(tipo_cobaia == 'R'){
	            rat= rat+qtd_cobaias;
	        }else if(tipo_cobaia == 'S'){
	            sap= sap+qtd_cobaias;
	        }
	    }
	    
	    perc_co=((double)co/qtd_total)*100.0;
	    perc_rat=((double)rat/qtd_total)*100.0;
	    perc_sap=((double)sap/qtd_total)*100.0;
	    
	    System.out.print("\nRELATORIO FINAL:\nTotal: "+ qtd_total + " cobaias\n" + "Total de coelhos: "+ co +"\nTotal de ratos: "+ rat +"\nTotal de sapos: "+ sap +"\nPercentual de coelhos: "+ String.format("%.2f", perc_co)+"\nPercentual de ratos: "+ String.format("%.2f", perc_rat)+"\nPercentual de sapos: "+ String.format("%.2f", perc_sap));
	    
	    sc.close();
	}
}
