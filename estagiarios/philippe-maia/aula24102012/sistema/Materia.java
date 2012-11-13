package sistema;

//Exercicio resolvido por Philippe, Paulo e Douglas

public class Materia {

	private int codigo;
	private String nome;
	private String serie;
	private Professor professor;
	
	public Materia() {
		
	}

	public Materia(int codigo, String nome, String serie, Professor professor) {
		this.codigo = codigo;
		this.nome = nome;
		this.serie = serie;
		this.professor = professor;
	}

	@Override
	public String toString() {
		return "Materia [codigo=" + codigo + ", nome=" + nome + ", professor="
				+ professor + ", serie=" + serie + "]";
	}
	
	
	
}
/*
Aluno codigo,nome,matricula,cpf,telefone,serie,sala
Materia codigo,nome,serie,professor
Professor codigo,nome,matricula,cpf,telefone

*/
