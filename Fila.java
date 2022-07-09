package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
	
		Queue<String> fila = new LinkedList<>();
		
		//Offer e Add -> adicionam elementos na fila
		//Diferença é o comportamento ocorre
		//quando a fila está cheia!
		fila.add("Ana");
		fila.add("Bia");
		fila.add("Carlos");
		fila.add("Daniel");
		fila.add("Rafaela");
		fila.add("Gui");
		
		//Peek e Element -> obter elementos na fila
		// Diferença é o comportamento ocorre
		// quando a fila está vazia!
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); // Lança uma exceção
		System.out.println(fila.element());
		
		// Poll e Remove -> obter o próximo elemento
		//da fila e remove!
		
		//Diferença é o comportamento ocorre
		//quando a fila está vazia!
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.remove()); // Lança uma exceção
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		//fila.contains(fila)
	}

}
