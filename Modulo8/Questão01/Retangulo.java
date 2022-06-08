package Questão01;

public class Retangulo {

	public double largura;
	public double altura;
	public double TotalA, TotalP, TotalD;
	
	
	public void Area() 
	{
		TotalA = largura * altura;
		
		System.out.println("Valor da Area:" + TotalA);
	}
	
	public void Perimetro()
	{
		TotalP = 2 * (largura + altura);
		
		System.out.println("Valor do Perimetro:" + TotalP);
	}

	public void Diagonal() 
	{
		
		
		TotalD = Math.sqrt((altura * altura) + (largura * largura));
		
		System.out.println("Valor da Diagional:" + TotalD);
	}
}
