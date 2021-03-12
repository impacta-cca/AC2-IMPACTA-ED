package ex05;

import source.NodeStack;

public class Ex_05 {
	public static void main(String args[]) {
		// Cria lista vazia S
		final NodeStack<Integer> S = new NodeStack<Integer>();

		// 25 operações push
		for (int i = 1; i <= 25; i++) {
			S.push(i);
		}
		// Mosta Pilha aṕos 25 push
		System.out.println("Pilha aṕos 25 oprações de push");
		System.out.println(S.toString());
		System.out.println();

		
		// 12 operações top
		for (int i = 0; i < 12; i++) {
			S.top();
		}
		

		// 10 operações pop 
		for (int i = 0; i < 10; i++) {
			S.pop();
		}		
		// Mosta Pilha aṕos 10 pop
		System.out.println("Pilha aṕos 25 oprações de pop");
		System.out.println(S.toString());
		System.out.println();
		
		
		// Exibe tamanho da Pilha
		int tamanho = S.size();
		System.out.println("O tamanho da lista é: "+tamanho);
		System.out.println();
		
		// Exibe o valor corrente de top
		int top = S.top();
		System.out.print("O valor de corrente de top é: "+top);
		
	}
}
