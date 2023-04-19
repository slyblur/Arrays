package Arrays;

import java.util.Scanner;

public class Exercicio2_vetor {

	public static void main(String[] args) {
		
		int [] vetorInt = new int [10];
		int i, contimpar = 0, contpar = 0, soma=0;
		float media=0;
		
		Scanner leia= new Scanner (System.in);
				
		for (i=0; i<10; i++) {
			System.out.println("Digite o "+(i+1)+"º número: ");
			vetorInt[i] = leia.nextInt();
			
		}
		
		for (i=0; i<10; i++) {
			soma = soma + i;
			media = (soma)/10;
		}
		
		if (i %2==0) {
			contpar+=i; 
			System.out.println("\n\nElementos nos índices pares: "+contpar);
		}
		if (i %2==1) {
			contimpar+=i;
			System.out.println("Elementos nos índices ímpares: "+contimpar);
		}
		
		System.out.println("A soma dos elementos é: "+soma);
		System.out.println("A média dos elementos é: "+media);
		
		
		/* fim do programa*/
}}
