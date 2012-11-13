package sistema;

//Exercicio resolvido por Philippe, Paulo e Douglas

public class Professor extends Pessoa{

	
	private Materia materia;
	
	public Professor() {
		// TODO Auto-generated constructor stub
	}

	public Professor(int codigo, String nome, int matricula, String cpf,
			String telefone, Materia materia) {
		super(codigo, nome, matricula, cpf, telefone);
		this.materia = materia;
	}

	@Override
	public String toString() {
		return "Professor [materia=" + materia + "]" + super.toString();
	}

	
	
	
	
}
/*
Aluno codigo,nome,matricula,cpf,telefone,serie,sala
Materia codigo,nome,serie,professor
Professor codigo,nome,matricula,cpf,telefone

*/
