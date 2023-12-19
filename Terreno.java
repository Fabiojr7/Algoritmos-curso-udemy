/*Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma
casa decimal, bem como o valor do metro quadrado do terreno com duas casas decimais. Em seguida,
o programa deve mostrar o valor da área do terreno, bem como o valor do preço do terreno, ambos com
duas casas decimais, conforme exemplo.*/

import java.util.Locale;    //Importando biblioteca para aplicar a formatação específica
import java.util.Scanner;   //Importando biblioteca para utilizar a função que recebe a entrad de teclado

public class Main{          //Programa utiliza apenas a classe principal
    
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); //Formatação pra printar "." ao invés de ","
		
		Scanner sc = new Scanner(System.in);
		
		double larg_ter;    //variável do tipo double para a largura do terreno
		double comp_ter;    //variável do tipo double para o comprimento do terreno
		double val_mqua;    //variável do tipo double para o valor do metro quadrado
		double area_ter;
		double preco_ter;
		
        System.out.print("Digite a largura do terreno: ");
        larg_ter=sc.nextDouble();
        System.out.print("Digite o comprimento do terreno: ");
        comp_ter=sc.nextDouble();
        System.out.print("Digite o valor do metro quadrado: ");
        val_mqua=sc.nextDouble();
        
        area_ter=larg_ter*comp_ter;
        preco_ter=area_ter*val_mqua;
        
        System.out.println("Area do terreno = " + String.format("%.2f", area_ter));
        System.out.println("preco do terreno = " + String.format("%.2f", preco_ter));
	}
}