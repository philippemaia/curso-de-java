package colections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * Implemente um programa para medir o tempo de execução de algumas 
 * classes da API de collections (pelo menos 4 delas) no que diz respeito
 * a adicionar e percorrer elementos. Receba do usuário a quantidade de elementos
 * que serão inseridos. Dica: Use System.currentTimeMillis() para pegar o tempo 
 * atual em milissegundos.
 */

//Exercicio4 Finalizado -> substituindo o arquivo anterior
public class ExercicioTempoColections {

	public static void main(String[] args) {

		System.out.println("Informe a quantidade de elementos: ");
		Scanner sc = new Scanner(System.in);
		int quantidade = sc.nextInt();

		// ArrayList
		testaAdicionarNaColecao(new ArrayList(), quantidade); 
		// LinkedList
		testaAdicionarNaColecao(new LinkedList(), quantidade);
		// TreeSet
		testaAdicionarNaColecao(new TreeSet(), quantidade);
		// HashSet
		testaAdicionarNaColecao(new HashSet(), quantidade);
	}

	public static void testaAdicionarNaColecao(Collection colecao,
			int quantidade) {
		long inicio = System.currentTimeMillis();
		for (int i = 0; i < quantidade; i++) {
			colecao.add("Objeto " + i);
		}

		long termino = System.currentTimeMillis();

		System.out.println("Tempo para adicionar " + quantidade
				+ " objetos na " + colecao.getClass().getSimpleName() + " foram : "
				+ (termino - inicio) + " Milisegundos");
	}

}
