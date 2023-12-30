/*Problema "lanchonete" (adaptado de URI 1038)
Uma lanchonete possui vários produtos. Cada produto possui um código
e um preço. Você deve fazer um programa para ler o código e a
quantidade comprada de um produto (suponha um código válido), e daí
informar qual o valor a ser pago, com duas casas decimais, conforme
tabela de produtos ao lado. 
Código do
produto
Preço do
produto
1 R$ 5.00
2 R$ 3.50
3 R$ 4.80
4 R$ 8.90
5 R$ 7.32*/

import java.util.Scanner;
import java.util.Locale;

public class lanchonete
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int cod_prod, qtd_prod;
		double val_final;
		
		System.out.print("Codigo do produto comprado: ");
		cod_prod=sc.nextInt();
		System.out.print("Quantidade comprada: ");
		qtd_prod=sc.nextInt();
		if(cod_prod == 1){
		    val_final=5.00*(double)qtd_prod;
		}else if(cod_prod == 2){
		    val_final=3.50*(double)qtd_prod;
		}else if(cod_prod == 3){
		    val_final=4.80*(double)qtd_prod;
		}else if(cod_prod == 4){
		    val_final=8.90*(double)qtd_prod;
		}else{
		    val_final=7.32*(double)qtd_prod;
		}
		
		System.out.println("Valor a pagar: R$ "+ String.format("%.2f",val_final));
	}
}
