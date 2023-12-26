/*Problema "consumo"
Fazer um programa para ler a distância total (em km) percorrida por um carro, bem como o total de
combustível gasto por este carro ao percorrer tal distância. Seu programa deve mostrar o consumo
médio do carro, com três casas decimais.*/

import java.util.Scanner;
import java.util.Locale;

public class consumo
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    double comb_gasto, media;
	    int distancia;
	    
	    System.out.print("Distancia percorrida: ");
	    distancia=sc.nextInt();
	    System.out.print("Combustível gasto: ");
	    comb_gasto=sc.nextDouble();
	    media= (double)distancia/comb_gasto;
	    System.out.println("Consumo medio = "+ String.format("%.3f", media));
	    sc.close();
	}
}
