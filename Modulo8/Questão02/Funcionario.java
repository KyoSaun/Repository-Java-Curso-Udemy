package Questão02;

public class Funcionario {

	String nome;
	double Salario;
	double imposto;
	double SalarioL, SalarioA, aux;
	
	public void MostrarSalario() 
	{
		SalarioL = Salario - imposto;
		
		System.out.println("Nome:" + nome);
		
		System.out.println("Salario Liquido:" + SalarioL);
		
	}

	public void AumentoSalario (Double Porcentagem)
	{
		
		
		aux = (Salario * Porcentagem) / 100 ;
		
		SalarioA = SalarioL + aux;
		
		System.out.println("ATUALIZADO....");
		
		System.out.println("Nome:" + nome);
		
		System.out.println("Salario Liquido:" + SalarioA);
	}

}
