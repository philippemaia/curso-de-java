//lista de exercicios collections exercicio3 Finalizado

package colections;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UniaoIntersecao {

	public static void main(String[] args) {

		Set grupo1 = new TreeSet();
		Set grupo2 = new TreeSet();
		
		System.out.println("Digite qualquer numero e pressione 0 para sair");
		
		int numero1 = 0;
		while (numero1 >= 0) {
			System.out.println("Informe o 1º grupo numero: ");
			Scanner sc1 = new Scanner(System.in);
			numero1 = sc1.nextInt();
			if (numero1 >= 0) {				
				grupo1.add(numero1);
			
			}					
		}
		
		System.out.println("Informe o operador + para uniao e * para intersecao: ");
		Scanner scop = new Scanner(System.in);
		String operador = scop.next();
		
		int numero2 = 0;
		while (numero2 >= 0) {
			System.out.println("Informe o 2º grupo numero: ");
			Scanner sc2 = new Scanner(System.in);
			numero2 = sc2.nextInt();
			if (numero2 >= 0) {				
				grupo2.add(numero2);
			}
								
		}
		
		if(operador.equals("+")){
			grupo1.addAll(new TreeSet(grupo2));
			System.out.print("União de 2 conjuntos: ");
			System.out.println(grupo1);
		}
		
		if(operador.equals("*")){
			grupo1.retainAll(new TreeSet(grupo2));
			System.out.print("Interseção de 2 conjuntos: ");
			System.out.println(grupo1);
		}
		
	}
}
