package Arrays;

import java.util.Scanner;

public class Exercicio3_matriz {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numeros [] [] = new int[3][3];
		int somaDiagonal1=0, somaDiagonal2=0;
		String valoresDiagonal1="", valoresDiagonal2="";
		
		for (int linha=0; linha<3; linha++) {
			for (int coluna=0; coluna<3; coluna++) {
				System.out.printf("\nDigite um número na posição [%d][%d]: ",linha,coluna);
				numeros[linha][coluna] = leia.nextInt();
				
				if (linha == coluna) {
					somaDiagonal1 += numeros[linha][coluna];
					valoresDiagonal1 += numeros[linha][coluna]+" ";
				}
				
				if (linha+coluna == 2) {
					somaDiagonal2 += numeros[linha][coluna];
					valoresDiagonal2 += numeros [linha][coluna]+" ";
				}
			}
		}
		
		System.out.println("\n\nEllementos da diagonal principal: "+valoresDiagonal1);
		System.out.println("\nEllementos da diagonal secundária: "+valoresDiagonal2);
		System.out.println("\nEllementos da diagonal principal: "+somaDiagonal1);
		System.out.println("\nEllementos da diagonal secundária: "+somaDiagonal2);
		
		/* fim do programa*/

	}

}
