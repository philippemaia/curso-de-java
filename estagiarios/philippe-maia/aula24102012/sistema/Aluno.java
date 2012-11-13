package sistema;

//Exercicio resolvido por Philippe, Paulo e Douglas

public class Aluno extends Pessoa{


	private String serie;
	private String sala;
	
	
	
	public Aluno(int codigo, String nome, int matricula, String cpf,
			String telefone, String serie, String sala) {
		super(codigo, nome, matricula, cpf, telefone);
		this.serie = serie;
		this.sala = sala;
	}
	public Aluno() {
	}
	@Override
	public String toString() {
		return super.toString() + "Aluno [sala=" + sala + ", serie=" + serie + "]" ;
	}
	
	
	
}
/*
Aluno codigo,nome,matricula,cpf,telefone,serie,sala
Materia codigo,nome,serie,professor
Professor codigo,nome,matricula,cpf,telefone

*/
