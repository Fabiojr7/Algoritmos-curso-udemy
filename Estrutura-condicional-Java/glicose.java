/*Problema "glicose"
Fazer um programa para ler a quantidade de glicose
no sangue de uma pessoa e depois mostrar na tela a
classificação desta glicose de acordo com a tabela de
referência ao lado.*/

import  java.util.Locale;
import  java.util.Scanner;

public class glicose
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
	    Scanner sc = new Scanner(System.in);
	    
	    double glicose;
	    
	    System.out.print("Digite a medida da glicose: ");
	    glicose=sc.nextDouble();
	
	    if(glicose<=100){
	        System.out.println("Classificacao: normal");
	    }else if(glicose> 100 && glicose <= 140){
	        System.out.println("Classificacao: elevado");
	    }else{
	        System.out.println("Classificacao: diabetes");
	    }
	}
}
