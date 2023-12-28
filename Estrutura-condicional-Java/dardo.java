/*Problema "dardo"
No arremesso de dardo, o atleta tem três chances para lançar o dardo à maior distância que conseguir.
Você deve criar um programa para, dadas as medidas das três tentativas de lançamento, informar qual
foi a maior.*/

import  java.util.Locale;
import  java.util.Scanner;

public class dardo
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
	    Scanner sc = new Scanner(System.in);
	    
	    double d1, d2, d3;
	    
	    System.out.println("Digite as tres distancias: ");
	    d1=sc.nextDouble();
	    d2=sc.nextDouble();
	    d3=sc.nextDouble();
	
	    if(d1 > d2 && d1 > d3){
	        System.out.println("MAIOR DISTANCIA = "+ String.format("%.2f", d1));
	    }else if(d2 > d1 && d2 > d3){
	        System.out.println("MAIOR DISTANCIA = "+ String.format("%.2f", d2));
	    }else{
	        System.out.println("MAIOR DISTANCIA = "+ String.format("%.2f", d3));
	    }
	}
}
