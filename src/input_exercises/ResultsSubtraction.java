package input_exercises;

import java.util.Scanner;

public class ResultsSubtraction {

	public static void main(String[] args) {
		
		float primeiroNumero, segundoNumero, terceiroNumero, quartoNumero, diferenca;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		primeiroNumero = leia.nextFloat();
		
		System.out.println("\nDigite o segundo número: ");
		segundoNumero = leia.nextFloat();

		System.out.println("\nDigite o terceiro número: ");
		terceiroNumero = leia.nextFloat();

		System.out.println("\nDigite o quarto número: ");
		quartoNumero = leia.nextFloat();
		
		diferenca = (primeiroNumero * segundoNumero) - (terceiroNumero * quartoNumero);
		
		System.out.println("\nO resultado da diferença entre os produtos é " + diferenca);


	}

}
