/*Problema "baskara"
Fazer um programa para ler os três coeficientes de uma equação do segundo grau. Usando a fórmula
de Baskara, calcular e mostrar os valores das raízes x1 e x2 da equação com quatro casas decimais,
conforme exemplo. Se a equação não possuir raízes reais, mostrar uma mensagem. */

import java.util.Scanner;
import java.util.Locale;

public class baskara
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    double a, b, c, delta, x1, x2;
	    
	    System.out.print("Coeficiente a: ");
	    a=sc.nextDouble();
	    System.out.print("Coeficiente b: ");
	    b=sc.nextDouble();
	    System.out.print("Coeficiente c: ");
	    c=sc.nextDouble();
	    
	    delta=(Math.pow(b,2))-4*a*c;
	    if(a == 0 || delta < 0){
	        System.out.println("Esta equacao nao possui raizes reais");
	    }else{
	        x1= (-b+Math.sqrt(delta))/(2*a);
	        x2= (-b-Math.sqrt(delta))/(2*a);
	        System.out.println("X1 = " + String.format("%.4f",x1));
	        System.out.println("X2 = " + String.format("%.4f",x2));
	    }
	    
	    sc.close();
	}
}
