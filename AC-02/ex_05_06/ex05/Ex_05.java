package ex05;

import ex05.NodeStack;
import ex05.EmptyStackException;

public class Ex_05 {
	public static void main(String args[]) {
		testaPilha();
	}
	
	public static void testaPilha() throws EmptyStackException {
		// Cria lista vazia S
		final NodeStack<Integer> S = new NodeStack<Integer>();
	
		// Cria 3 casos de erro 
		for (int i = 1; i <= 3; i++) {
			S.push(i);
			S.pop();
			S.top();
		} 

		// 25 operações push
		for (int i = 1; i <= 22; i++) {
			S.push(i);
		}
		// Mosta Pilha aṕos 25 push
		System.out.println("Pilha aṕos 25 operações de push");
		System.out.println(S.toString());
		System.out.println();

		// 12 operações top
		for (int i = 0; i < 9; i++) {
			S.top();
		}

		// 10 operações pop
		for (int i = 0; i < 7; i++) {
			S.pop();
		}
		// Mosta Pilha aṕos 10 pop
		System.out.println("Pilha aṕos 10 operações de pop");
		System.out.println(S.toString());
		System.out.println();

		// Exibe tamanho da Pilha
		int tamanho = S.size();
		System.out.println("O tamanho da lista é: " + tamanho);
		System.out.println();

		// Exibe o valor corrente de top
		int top = S.top();
		System.out.print("O valor de corrente de top é: " + top);
	}
}