package ExercicioPropostoListas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Fazer um programa para ler um n�mero inteiro N e depois os dados (id, nome e salario) de
N funcion�rios. N�o deve haver repeti��o de id.
Em seguida, efetuar o aumento de X por cento no sal�rio de um determinado funcion�rio.
Para isso, o programa deve ler um id e o valor X. Se o id informado n�o existir, mostrar uma
mensagem e abortar a opera��o. Ao final, mostrar a listagem atualizada dos funcion�rios,
conforme exemplos.
Lembre-se de aplicar a t�cnica de encapsulamento para n�o permitir que o sal�rio possa
ser mudado livremente. Um sal�rio s� pode ser aumentado com base em uma opera��o de
aumento por porcentagem dada
 */
public class Main 
{

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		String funcionario;
		int id, GuarID;
		double salario;
	
		List<Funcionarios> list = new ArrayList<>();
		
		System.out.println("Quantos funcionarios voc� deseja adicionar:");
		int num = ler.nextInt();
		
		
			for (int i = 0; i < num; i++) 
			{
				System.out.println("ID do funcionario " + i+1);
				id = ler.nextInt();
				
				System.out.println("Nome do Funcionario " + i+1);
				ler.nextLine();
				funcionario = ler.nextLine();
				
				System.out.println("Valor do Salario " + i+1);
				salario = ler.nextDouble();
				
				Funcionarios fun = new Funcionarios(id, funcionario, salario);
				
				list.add(fun);	
			
		 }
			
			System.out.println(list);
	} 
}
