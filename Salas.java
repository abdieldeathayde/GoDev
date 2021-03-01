package turmaJava;

import java.util.Scanner;

public class Salas implements Visualizacao {
	String nome[], sobrenome[], salanome;
	int lotacao;
	
	Scanner sc = new Scanner(System.in);
	
	
	@Override
	public void Pessoa2() {	
	}

	@Override
	public void SalasT() {
		
		Salas sala = new Salas();
		
		
		System.out.println("Digite 	sala1 ou sala2: \n");
		sala.salanome = sc.nextLine();
		System.out.println("Digite a lotacao maxima: \n");
		sala.lotacao = sc.nextInt();
		
		while(sala.lotacao > 0) {
			
			
		
			int sala1 = 0, sala2 = 0;
			
			
			
			if (sala.salanome.equals("sala1")) {
				sala1++;
				
			} else if (sala.salanome.equals("sala2")) {
				sala2++;
			} else {
				System.out.println("Essa sala não existe");
			}
			
			//System.out.println(sala.salanome + " " + sala.lotacao);
			System.out.println("quantidade de alunos nas salas 1 e 2 respectivamente: " + sala1 + " " + sala2);
			
			
			System.out.println("Digite 	sala1 ou sala2: ");
			sala.salanome = sc.nextLine();
			System.out.println(" " + sala.salanome);
			System.out.println("Digite a lotacao maxima: \n");
			sala.lotacao = sc.nextInt();
			
			sala.lotacao--;
		}
		
	}

	@Override
	public void cadastroSalaCafe() {
		EspacoCafe espacoCafe = new EspacoCafe();
		System.out.println("digite o nome do espaco do cafe: ");
		
		espacoCafe.nome = sc.nextLine();
		
		//System.out.println("Espaço do cafe: " + espacoCafe.nome);
		
	}
	
	

}
