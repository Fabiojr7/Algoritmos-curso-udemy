/*Problema "circulo"
Fazer um programa para ler o valor "r" do raio de um círculo, e depois mostrar o valor da área do
círculo com três casas decimais. A fórmula da área do círculo é a seguinte: 𝑎𝑟𝑒𝑎 = 𝜋. 𝑟
ଶ
. Você pode
usar o valor de 𝜋 fornecido pela biblioteca da sua linguagem de programação, ou então, se preferir, use
diretamente o valor 3.14159.  */

import  java.util.Scanner;
import  java.util.Locale;

public class circulo
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double valor_raio, area;
		
		System.out.print("Digite o valor do raio do circulo: ");
		valor_raio=sc.nextDouble();
		area= Math.PI*Math.pow(valor_raio,2);
		
		System.out.println("AREA = " + String.format("%.3f", area)); 
		
		sc.close();
	}
}
