package Questão02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Double Aumento;
		
		Funcionario c1 = new Funcionario();
		
		System.out.println("Digite seu nome:");
		c1.nome = sc.next();
		
		System.out.println("Digite o seu salario:");
		c1.Salario = sc.nextDouble();
		
		System.out.println("Digite o valor do imposto:");
		c1.imposto = sc.nextDouble();
		
		
		c1.MostrarSalario();
		
		
		System.out.println("Digite a porcentagem do aumento no salario:");
		Aumento = sc.nextDouble();
		
		
		c1.AumentoSalario(Aumento);

	}

}
