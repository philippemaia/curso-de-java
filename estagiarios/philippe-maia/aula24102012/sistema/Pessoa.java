package sistema;

//Exercicio resolvido por Philippe, Paulo e Douglas

public class Pessoa {
	private int codigo;
	private String nome;
	private int matricula;
	private String cpf;
	private String telefone;
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
	
	public Pessoa(int codigo, String nome, int matricula, String cpf,
			String telefone) {
		this.codigo = codigo;
		this.nome = nome;
		this.matricula = matricula;
		this.cpf = cpf;
		this.telefone = telefone;
	}



	@Override
	public String toString() {
		return "Pessoa [codigo=" + codigo + ", cpf=" + cpf + ", matricula="
				+ matricula + ", nome=" + nome + ", telefone=" + telefone + "]";
	}
	
	

}

