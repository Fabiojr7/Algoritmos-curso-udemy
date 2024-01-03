/*Problema "tempo_de_jogo" (adaptado de URI 1046)
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo
pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24
horas.*/

import java.util.Scanner;
import java.util.Locale;

public class tempo_de_jogo
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int h_inicial, h_final, duracao;
		
		System.out.print("Hora inicial: ");
		h_inicial=sc.nextInt();
		System.out.print("Hora final: ");
		h_final=sc.nextInt();
		
		if(h_final == h_inicial){
		    duracao=24;
		    System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		}else if(h_inicial > h_final){
		    duracao= (24-h_inicial)+h_final;
		    System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		}else{
		    duracao= h_final-h_inicial;
		    System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		}
	}
}
