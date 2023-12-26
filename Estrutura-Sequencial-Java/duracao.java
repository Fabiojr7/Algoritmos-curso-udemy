/*Problema "duracao"
Fazer um programa para ler uma duração de tempo em segundos, daí imprimir na tela esta duração no
formato horas:minutos:segundos. */

import java.util.Scanner;
import java.util.Locale;

public class duracao
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    int duracao, resto, horas, minutos, segundos;
	    
	    System.out.print("Digite a duracao em segundos: ");
	    duracao=sc.nextInt();
	    
	    horas= duracao/3600;
	    resto= duracao%3600;
	    minutos= resto/60;
	    segundos= resto%60;
	    
	    System.out.println(horas+":"+minutos+":"+segundos);
	    
	    sc.close();
	}
}
