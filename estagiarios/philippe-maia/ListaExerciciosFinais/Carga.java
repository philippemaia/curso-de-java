//Exercicio1 da lista dos Exercicios Finais
//Finalizado substitui o anterior
public class Carga {
	
	private double peso;
	
	public Carga(double peso) {
		setPeso(peso);
	}

	public void setPeso(double peso) {
		if(peso<0){		
		    throw new IllegalArgumentException("Não é possivel uma pessoa ter o peso negativo!");
		}
		this.peso = peso;
	}
	
	public double getPeso(){
		return peso;
	}
	
	
	public static void main(String[] args) {
		
		try {
			Carga c = new Carga(-40.);
			System.out.println(c.getPeso());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

}
