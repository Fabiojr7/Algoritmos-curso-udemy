/*Problema "coordenadas" (adaptado de URI 1041)
Leia os valores das coordenadas X e Y de um ponto no plano
cartesiano. A seguir, determine qual o quadrante ao qual pertence o
ponto (Q1, Q2, Q3 ou Q4). Se o ponto estiver na origem, escreva a
mensagem “Origem”. Se o ponto estiver sobre um dos eixos escreva
“Eixo X” ou “Eixo Y”, conforme for a situação.*/

import java.util.Scanner;
import java.util.Locale;

public class coordenadas
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double X,Y;
		
		System.out.print("Valor de X: ");
		X=sc.nextDouble();
		System.out.print("Valor de Y: ");
		Y=sc.nextDouble();
		
		if(X==0 && Y==0){
		    System.out.println("Origem");
		}else if(X == 0){
		    System.out.println("Eixo Y");
		}else if(Y == 0){
		    System.out.println("Eixo X");
		}else if(X > 0 && Y > 0){
		    System.out.println("Q1");
		}else if(X < 0 && Y > 0){
		    System.out.println("Q2");
		}else if(X < 0 && Y < 0){
		    System.out.println("Q3");
		}else{
		    System.out.println("Q4");
		}
	}
}
