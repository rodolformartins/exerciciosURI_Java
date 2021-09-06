import java.util.Scanner;

public class Exercicio6 {
	public static void main(String args[]) {
		//Exercicio URI 1066
		
		/* Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram pares
		 * quantos valores digitados foram ímpares, quantos valores digitados foram positivos
		 *  e quantos valores digitados foram negativos. */
		
		Scanner scan = new Scanner(System.in);
		
		//Lendo 5 valores inteiros
		int pares, impares, positivos, negativos;
		int numero;
		
		pares = 0;
		impares = 0;
		positivos = 0;
		negativos = 0;
		
		for(int contador = 1; contador <= 5; contador++) {
			numero = scan.nextInt();
			
			if (numero % 2 == 0) {
				pares++;
			}
			else {
				impares++;
			}
			
			
			
			if(numero > 0) {
				positivos++;
			}else if(numero < 0){
				negativos++;
			}
			
			
		}
	

		System.out.println(pares + " valor(es) par(es)");
		System.out.println(impares + " valor(es) impar(es)");
		System.out.println(positivos + " valor(es) positivo(s)");
		System.out.println(negativos + " valor(es) negativo(s)");
		
		//encerramento
		scan.close();
		
	}
}
