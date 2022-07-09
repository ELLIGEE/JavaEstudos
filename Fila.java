package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
	
		Queue<String> fila = new LinkedList<>();
		
		//Offer e Add -> adicionam elementos na fila
		//Diferen�a � o comportamento ocorre
		//quando a fila est� cheia!
		fila.add("Ana");
		fila.add("Bia");
		fila.add("Carlos");
		fila.add("Daniel");
		fila.add("Rafaela");
		fila.add("Gui");
		
		//Peek e Element -> obter elementos na fila
		// Diferen�a � o comportamento ocorre
		// quando a fila est� vazia!
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); // Lan�a uma exce��o
		System.out.println(fila.element());
		
		// Poll e Remove -> obter o pr�ximo elemento
		//da fila e remove!
		
		//Diferen�a � o comportamento ocorre
		//quando a fila est� vazia!
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.remove()); // Lan�a uma exce��o
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		//fila.contains(fila)
	}

}
