/*Problema "aumento" (adaptado de URI 1048)
Uma empresa vai conceder um aumento percentual de
salário aos seus funcionários dependendo de quanto
cada pessoa ganha, conforme tabela ao lado. Fazer um
programa para ler o salário de uma pessoa, daí mostrar
qual o novo salário desta pessoa depois do aumento,
quanto foi o aumento e qual foi a porcentagem de
aumento. 
Salário atual Aumento
Até R$ 1000.00 20%
Acima de R$ 1000.00
até R$ 3000.00
15%
Acima de R$ 3000.00
até R$ 8000.00
10%
Acima de R$ 8000.00 5% 
*/

import java.util.Scanner;
import java.util.Locale;

public class aumento
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int perc_aum=0;
		double sal_atual, novo=0, aumen=0; 
		
		System.out.print("Digite o salario da pessoa: ");
		sal_atual=sc.nextDouble();
		
	    if(sal_atual>0 && sal_atual<=1000){
	        novo=sal_atual*1.20;
	        aumen=novo-sal_atual;
	        perc_aum=20;
	    }else if(sal_atual>1000 && sal_atual <= 3000){
	        novo=sal_atual*1.15;
	        aumen=novo-sal_atual;
	        perc_aum=15;
	    }else if(sal_atual>3000 && sal_atual <= 8000){
	        novo=sal_atual*1.10;
	        aumen=novo-sal_atual;
	        perc_aum=10;
	    }else if(sal_atual > 8000){
	        novo=sal_atual*1.05;
	        aumen=novo-sal_atual;
	        perc_aum=5;
	    }
	    
	    System.out.println("Novo salario = R$ " + String.format("%.2f", novo));
	    System.out.println("Aumento = R$ " + String.format("%.2f", aumen));
	    System.out.println("Porcentagem = " + perc_aum + " %");
	}
}
