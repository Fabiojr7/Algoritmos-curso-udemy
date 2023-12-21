/*Problema "retangulo"
Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida, mostrar o valor
da área, perímetro e diagonal deste retângulo, com quatro casas decimais, conforme exemplos. */
import  java.util.Locale;
import  java.util.Scanner;

public class retangulo
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double base_ret, altura_ret, area, perim, diagonal;
		
	    System.out.print("Base do retangulo: ");
	    base_ret=sc.nextDouble();
	    System.out.print("Altura do retangulo: ");
		altura_ret=sc.nextDouble();
		
		area = base_ret*altura_ret;
		perim = 2*(base_ret+altura_ret);
		diagonal = Math.sqrt(Math.pow(base_ret,2.0)+Math.pow(altura_ret,2.0));
		
		System.out.println("AREA = " + String.format("%.4f", area));
		System.out.println("PERIMETRO = " + String.format("%.4f", perim));
		System.out.println("DIAGONAL = " + String.format("%.4f", diagonal));
		
		sc.close();
	}
}
