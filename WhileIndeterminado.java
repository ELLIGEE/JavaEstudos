package contorle;

import java.util.Scanner;

public class WhileIndeterminado {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.print("Voce diz: ");
			valor = entrada.nextLine();
			
		}
		
			
		entrada.close();
	}
}
