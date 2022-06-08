package Quest�o01M9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String Nome, NovoNome;
		int numeroConta, op��o, op1;
		Double valorDeposito, op2, op3;
		
		
		System.out.println("Digite o numero da conta:");
		numeroConta = ler.nextInt();
		
		System.out.println("Digite o nome do titular da conta:");
		Nome = ler.next();
		
		Conta c1 = new Conta(numeroConta, Nome);
		
		System.out.println("Deseja fazer um deposito inicial ?");
		System.out.println("1 - Sim");
		System.out.println("2 - N�o");
		System.out.println("Digite um numero:");
		
		op��o = ler.nextInt();
		
		
		if (op��o == 1) 
		{
		 System.out.println("Digite o valor do deposito inicial:");
		 valorDeposito = ler.nextDouble();	 
		 c1.setDepInicial(valorDeposito);
		 System.out.println("Cadastro Realizado com sucesso.");
		 c1.CadastroRealizado();
		 }
			
		 else if (op��o == 2) 
		 {
		  System.out.println("Cadastro Realizado com sucesso.");
		  c1.CadastroRealizado();
		 }
		
		System.out.println("Voc� deseja mudar o nome ?");
		System.out.println("1 - Sim");
		System.out.println("2 - N�o");
		System.out.println("Digite um numero:");
	    op1 = ler.nextInt();
		
	    if (op1 == 1) 
	    {
	    	System.out.println("Digite o novo nome:");
	    	NovoNome = ler.next();
	    	c1.MudarNome(NovoNome);
	    	c1.CadastroRealizado();
	    }
	    
	    if (op1 == 2) 
	    {
	    	System.out.println("O usu�rio optou por n�o mudar o nome.");
	        c1.CadastroRealizado();
	    }
		
	    System.out.println("Insira o valor a depositar:");
	    op2 = ler.nextDouble();
	    
	    c1.Deposito(op2);
	    System.out.println("Atualizado !!!");
	    c1.CadastroRealizado();
	    
	    
	    System.out.println("Insira o valor a Sacar:");
	    op3 = ler.nextDouble();
	    
	    c1.Saque(op3);
	    System.out.println("Atualizado !!!");
	    c1.CadastroRealizado();
	    
	    
 }
}