package Arrays;

import java.util.Scanner;

public class ExercicioMatriz {

	public static void main(String[] args) {
		
		int [][] matrizInteiros = new int [3][3];
		int linha, coluna;
		
		Scanner leia = new Scanner (System.in);
		
		for (linha = 0; linha < 3; linha++) {
            for (coluna = 0; coluna < 3; coluna++) {
                System.out.println(
                    "Digite um valor para a posição [" + linha + "][" + coluna + "]: ");
                matrizInteiros[linha][coluna] = leia.nextInt();
            }
        }

        for (int linha1 = 0; linha1 < 3; linha1++) {
            for (int coluna1 = 0; coluna1 < 3; coluna1++) {
                System.out.println(
                    "O valor armazenado na posição [" + linha1 + "][" + coluna1 + "] é: "
                        + matrizInteiros[linha1][coluna1]);
            }
            
            /* fim do programa */
        }
    }
}