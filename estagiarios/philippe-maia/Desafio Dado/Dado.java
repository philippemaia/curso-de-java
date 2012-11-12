package desafios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Desafio do Dado

public class Dado {

	private final static Integer tamanho = 6;
	private Integer numeroLado;
	private Integer contAcertos = 0;

	public Dado(Integer numeroLado) {
		this.numeroLado = numeroLado;
	}

	public Integer getNumeroLado() {
		return numeroLado;
	}

	public void setNumeroLado(Integer numeroLado) {
		this.numeroLado = numeroLado;
	}

	public Integer getContAcertos() {
		return contAcertos;
	}

	public void setContAcertos(Integer contAcertos) {
		this.contAcertos = contAcertos;
	}

	public void somatorioAcertos() {
		this.contAcertos++;
	}

	public static void main(String[] args) {
		List<Dado> lados = new ArrayList(tamanho - 1);

		for (int i = 1; i <= tamanho; i++) {
			lados.add(new Dado(i));
		}

		System.out.println("Digite o numero de Jogadas: ");
		Scanner sc = new Scanner(System.in);
		Integer numeroJogadas = sc.nextInt();

		for (int i = 0; i < numeroJogadas; i++) {
			Integer numeroSorteado = (int) (Math.random() * tamanho + 1);
			for (Dado dados : lados) {
				if (dados.getNumeroLado() == numeroSorteado) {
					dados.somatorioAcertos();
				}
			}
		}

		for (Dado dados : lados) {
			System.out.println("O numero: " + dados.getNumeroLado()
					+ " foi sorteado " + dados.getContAcertos() + " vezes");
		}

	}

}