package input_exercises;

import java.util.Scanner;

public class SalaryAllowance {

	public static void main(String[] args) {
		
		float salario, abono, novoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu salário: ");
		salario = leia.nextFloat();
		System.out.println("\nDigite a abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println("O novo salário será de R$" + novoSalario + " reais.");
		
		

	}

}
