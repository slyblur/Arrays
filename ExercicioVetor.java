package Arrays;

import java.util.Scanner;

public class ExercicioVetor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);		
		
		int vetor[]= {5,17,69,115,76,2,7,10,3,66};
		int i=0, linha; 
		
		System.out.println("\n5 - 17 - 69 - 115 - 76 - 2 - 7 - 10 - 36 ");
		
		System.out.println("\nDigite o número que você deseja localizar o índice: ");
		linha = leia.nextInt();	
		
		for (i=0; i<10; i++); {
					
				if (linha==5) {
				
					System.out.println("\nPosição: "+0); 
				}
				if (linha==17) {
				
					System.out.println("\nPosição: "+1); 
				}		
				if (linha==69) {
				
					System.out.println("\nPosição: "+2); 
				}		
				if (linha==115) {
				
					System.out.println("\nPosição: "+3); 
				}		
				if (linha==76) {
				
					System.out.println("\nPosição: "+4); 
				}		
				if (linha==2) {
					
					System.out.println("\nPosição: "+5); 
				}		
				if (linha==7) {
				
					System.out.println("\nPosição: "+6); 
				}		
				if (linha==10) {
				
					System.out.println("\nPosição: "+7); 
					}
						
				if (linha==3) {
				
					System.out.println("\nPosição: "+8); 
					}
					
				if (linha==66) {
				
					System.out.println("\nPosição: "+9); 
					}
												
						else {
							System.out.println("\nErro");
				}
				} 					

		}
			/* fim do programa */
	}
		
		
	
