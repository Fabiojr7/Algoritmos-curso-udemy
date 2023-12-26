/*Problema "notas"
Fazer um programa para ler as duas notas que um aluno obteve no primeiro e segundo semestres de
uma disciplina anual. Em seguida, mostrar a nota final que o aluno obteve (com uma casa decimal) no
ano juntamente com um texto explicativo. Caso a nota final do aluno seja inferior a 60.00, mostrar a
mensagem "REPROVADO", conforme exemplos.  */

import java.util.Scanner;
import java.util.Locale;

public class notas
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    double nota1, nota2, nota_final;
	    
	    System.out.print("Digite a primeira nota: ");
	    nota1=sc.nextDouble();
	    System.out.print("Digite a segunda nota: ");
	    nota2=sc.nextDouble();
	    nota_final=nota1+nota2;
	    
	    System.out.print("NOTA FINAL = " + nota_final);
	    if(nota_final<60.00){
	        System.out.print("REPROVADO");
	    }
	    
	    sc.close();
	}
}
