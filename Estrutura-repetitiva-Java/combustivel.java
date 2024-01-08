/*Problema "combustivel" (adaptado de URI 1134)
Um posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes.
Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma:
1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a
4) deve ser solicitado um novo código (até que seja válido). O programa será encerrado quando o
código informado for o número 4, devendo então mostrar a mensagem "MUITO OBRIGADO", bem
como as quantidades de cada combustível.*/

import  java.util.Scanner;
import  java.util.Locale;

public class combustivel
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int opcao, alcool=0, gasolina=0, diesel=0;
		
		System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
		opcao=sc.nextInt();
		while(opcao != 4){
		    while(opcao < 1 || opcao > 4){
		        System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
		        opcao=sc.nextInt();
		    }
		    if(opcao == 1){
		        alcool++;
		    }else if(opcao == 2){
		        gasolina++;
		    }else{
		        diesel++;
		    }
		    System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
		    opcao=sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO\nAlcool: "+ alcool +"\nGasolina: "+ gasolina + "\nDiesel: "+ diesel);
	}
}
