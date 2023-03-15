package input_exercises;

import java.util.Scanner;

public class AverageGrades {

	public static void main(String[] args) {
		
		float primeiraNota, segundaNota, terceiraNota, quartaNota, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		primeiraNota = leia.nextFloat();
		
		System.out.println("\nDigite a segunda nota: ");
		segundaNota = leia.nextFloat();
		
		System.out.println("\nDigite a terceira nota: ");
		terceiraNota = leia.nextFloat();
		
		System.out.println("\nDigite a quarta nota: ");
		quartaNota = leia.nextFloat();
		
		media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;
		
		System.out.printf("\nA media final do estudante será %.1f", media);
	}

}
