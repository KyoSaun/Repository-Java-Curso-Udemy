package Questão01M9;

public class Conta {
 
	private int NConta;
	private String Nome;
	private double DepInicial;
	
	
	public Conta(double depInicial) {
		DepInicial = depInicial;
	}

	public Conta(int nConta, String nome) {
		NConta = nConta;
		Nome = nome;
		DepInicial = 0;
	}
	
	public int getNConta() {
		return NConta;
	}
	
	public void setNConta(int nConta) {
		NConta = nConta;
	}
	
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public double getDepInicial() {
		return DepInicial;
	}
	
	public void setDepInicial(double depInicial) {
		DepInicial = depInicial;
	}
	
	public void CadastroRealizado() 
	{
		System.out.println("Conta:" + NConta);
		System.out.println("Nome:" + Nome);
		System.out.println("Deposito:" + DepInicial);
	}
	
	public void Deposito(double deposito) 
	{
		DepInicial = DepInicial + deposito;
		System.out.println("Deposito Atualizado.");
		
	}
	
	public void Saque(double Saque) 
	{
		DepInicial = DepInicial - Saque - 5;
		System.out.println("Deposito Atualizado.");
		
	}
	
	public void MudarNome(String MudarNome) 
	{
		Nome = MudarNome;
		System.out.println("Nome Atualizado.");
	}
}
