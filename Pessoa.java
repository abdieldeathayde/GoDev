package turmaJava;

import java.util.Scanner;

public class Pessoa implements Visualizacao {
	
	Scanner sc = new Scanner(System.in);
	
	String nome, sobrenome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	


	@Override
	public void SalasT() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cadastroSalaCafe() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Pessoa2() {
		// TODO Auto-generated method stub

		Pessoa pessoa = new Pessoa();
		
		System.out.println("Digite seu nome: \n");
		pessoa.nome = sc.nextLine();
		System.out.println("Digite seu sobrenome: \n");
		pessoa.sobrenome = sc.nextLine();
		
		System.out.println(pessoa.nome + " " + pessoa.sobrenome);
	}
	
	

}
