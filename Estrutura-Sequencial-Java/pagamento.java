/*Problema "pagamento"
Fazer um programa para ler o nome de um(a) funcionário(a), o valor que ele(a) recebe por hora, e a
quantidade de horas trabalhadas por ele(a). Ao final, mostrar o valor do pagamento do funcionário com
uma mensagem explicativa, conforme exemplo.*/

import java.util.Scanner;
import java.util.Locale;

public class pagamento
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    String nome;
	    double val_hora, pagamento;
	    int qtd_horas;
	    
	    System.out.print("Nome: ");
	    nome=sc.nextLine();
	    System.out.print("Valor por hora: ");
	    val_hora=sc.nextDouble();
	    System.out.print("Horas trabalhadas: ");
	    qtd_horas=sc.nextInt();
	    pagamento= val_hora*(double)qtd_horas;
	    System.out.println("O pagamento para "+ nome + " deve ser " + String.format("%.2f", pagamento));
	    sc.close();
	}
}
