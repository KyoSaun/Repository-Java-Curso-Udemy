package Questão03;

public class Aluno {

	float media1, media2, media3, Total, NotaF;
	String Nome;
	
	public void CalculoMedia(float nota1, float nota2, float nota3) 
	{
			
		Total = (nota1 + nota2 + nota3);
		
		NotaF = 100 - Total;
		
		
		if (Total > 60) 
		{
			System.out.println("Nome do Aluno:" + Nome);
			System.out.println("O aluno foi Aprovado.");
			System.out.println("Media:" + Total);
		}
		
		else 
		{
			System.out.println("Nome do Aluno:" + Nome);
			System.out.println("O aluno foi Reprovado.");
			System.out.println("Media:" + Total);
			System.out.println("Ficou Faltando:" + NotaF);
		}
		
	}
	
}
