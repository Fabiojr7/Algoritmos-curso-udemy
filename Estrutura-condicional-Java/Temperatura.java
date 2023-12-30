/*Problema "temperatura"
Deseja-se converter uma medida de temperatura da escala Celsius para Fahrenheit ou vice-versa. Para
isso, você deve construir um programa que leia a letra "C" ou "F" indicando em qual escala vai ser
informada uma temperatura. Em seguida o programa deve mostrar a temperatura na outra escala com
duas casas decimais. A seguir é dada a fórmula para converter de Fahrenheit para Celsius (você deve
deduzir a fórmula de Celsius para Fahrenheit): ( 32)*/

import java.util.Scanner;
import java.util.Locale;

public class Temperatura
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		char tipo_temp;
		double temp, temp_conv;
		
		System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
		tipo_temp=sc.next().charAt(0);
		if(tipo_temp == 'F' || tipo_temp == 'f'){
		    System.out.print("Digite a temperatura em Fahrenheit: ");
		    temp=sc.nextDouble();
		    temp_conv=((temp-32)*5)/9;
		    System.out.println("Temperatura equivalente em Celsius: " + String.format("%.2f", temp_conv));
		}else if(tipo_temp == 'C' || tipo_temp == 'c'){
		    System.out.print("Digite a temperatura em Celsius: ");
		    temp=sc.nextDouble();
		    temp_conv=((temp*1.8)+32);
		    System.out.println("Temperatura equivalente em Fahrenheit: " + String.format("%.2f", temp_conv));
		}
	}
}
