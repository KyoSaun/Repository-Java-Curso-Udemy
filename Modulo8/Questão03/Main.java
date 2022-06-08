package Questão03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		float nota1, nota2, nota3;
		
		Scanner sc = new Scanner(System.in);
		
		Aluno c1 = new Aluno();
		
		System.out.println("Digite o nome do aluno:");
		c1.Nome = sc.next();
		
		System.out.println("Digite a N1, N2 e N3:");
		nota1 = sc.nextFloat();
		nota2 = sc.nextFloat();
		nota3 = sc.nextFloat();

		
		c1.CalculoMedia(nota1, nota2, nota3);
	}

}
