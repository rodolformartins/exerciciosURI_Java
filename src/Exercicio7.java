import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		//Exercicio1155
		/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano. 
		 * Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos uma de duas 
		 * coordenadas for NULA (nesta situação sem escrever mensagem alguma). */
		Scanner scan = new Scanner(System.in);
		
		int x, y;
		
		int primeiro, segundo, terceiro, quarto;
		
		primeiro = 0;
		segundo = 0;
		terceiro = 0;
		quarto = 0;
		
		x = 0;
		y = 0;
		
		
		
		
		do {
		x = scan.nextInt();
		y = scan.nextInt();
			
			
		if(x > 0 && y > 0) {
			System.out.println("primeiro");
		}
		else if(x < 0 && y > 0) {
			System.out.println("segundo");
		}
		else if(x < 0 && y < 0) {
			System.out.println("terceiro");
		}
		else if(x > 0 && y < 0) {
			System.out.println("quarto");
		}
		
		}while(x != 0 && y != 0);
			
			
		
		
		scan.close();
	}

}
