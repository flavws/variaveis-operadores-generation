package input_exercises;

import java.util.Scanner;

public class NetSalary {

	public static void main(String[] args) {
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o salário bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("\nDigite o adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("\nDigite as horas extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("\nDigite os descontos de um colaborador: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.println("O salário liquido do colaborador é de R$ " + salarioLiquido + " reais");
	}

}
