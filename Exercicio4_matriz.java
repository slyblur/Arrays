package Arrays;

import java.util.Iterator;
import java.util.Scanner;

public class Exercicio4_matriz {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		float [][]notas = new float [10][4];
		float [] medias = new float [10];  
		float soma =0;
		
		for (int linha=0; linha<10; linha++) {
			for (int coluna=0; coluna<4; coluna++) {
				System.out.println("Digite um valor para a posição [" +linha+ "][" + coluna + "]: ");
				notas[linha][coluna] = leia.nextFloat();
				soma += notas[linha][coluna]; 
			}
			
			medias[linha] = soma /4;
			soma = 0;
			
		}	
		
		for (int i=0; i<medias.length; i++) {
			System.out.printf("\n Média do aluno %d: %.1f", (i+1), medias);
		}
		
		} /* fim do programa*/
		

	}
