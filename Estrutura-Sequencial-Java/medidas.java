/*Problema "medidas"
Fazer um programa para ler três medidas A, B e C. Em seguida, calcular e mostrar (imprimir os dados
com quatro casas decimais):
a) a área do quadrado que tem lado A
b) a área do triângulo retângulo que base A e altura B
c) a área do trapézio que tem bases A e B, e altura C */

import java.util.Scanner;
import java.util.Locale;

public class medidas
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    double med_a, med_b, med_c, area_quad, area_tria, area_trap;
	    
	    System.out.print("Digite a medida A: ");
	    med_a=sc.nextDouble();
	    System.out.print("Digite a medida B: ");
	    med_b=sc.nextDouble();
	    System.out.print("Digite a medida C: ");
	    med_c=sc.nextDouble();
	    
	    area_quad= Math.pow(med_a,2);
	    area_tria= (med_a*med_b)/2;
	    area_trap= ((med_a+med_b)*med_c)/2;
	    
	    System.out.println("AREA DO QUADRADO = "+ String.format("%.4f", area_quad));
	    System.out.println("AREA DO TRIANGULO = "+ String.format("%.4f", area_tria));
	    System.out.println("AREA DO TRAPEZIO = "+ String.format("%.4f", area_trap));
	    sc.close();
	}
}
