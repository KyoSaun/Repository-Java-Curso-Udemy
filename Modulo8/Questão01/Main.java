package Questão01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Retangulo c1 = new Retangulo();
		
		
		System.out.println("Digite o valor da altura:");
		c1.altura = sc.nextDouble();
		
		System.out.printf("Digite o valor da Largura:\n\n Valor\n");
		c1.largura = sc.nextDouble();
		
		
		c1.Area();
		c1.Perimetro();
		c1.Diagonal();
	}
}
