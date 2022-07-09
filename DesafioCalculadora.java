package operadores;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Infomre o n�mero: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Infomre o n�mero: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Infomre o n�mero: ");
		double op = entrada.nextDouble();
		
		// L�gica
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : 0;
		resultado = "*".equals(op) ? num1 * num2 : 0;
		resultado = "/".equals(op) ? num1 / num2 : 0;
		resultado = "%".equals(op) ? num1 % num2 : 0;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);
		
		entrada.close();
		
		
	
	}
}
