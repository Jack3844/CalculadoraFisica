package calculadoraFisica;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	        System.out.println("Bem vindo a sua calculadora de fisica!!!");

	        System.out.println("1 - Força Centrípeta");
	        System.out.println("2 - Força Elástica");
	        System.out.println("3 - Força Peso");
	        System.out.println("4 – Impulso");
	        System.out.println("5 - Movimento Retilíneo Uniformemente (MRU)");
	        System.out.println("6 - Movimento Retilíneo Uniformemente Variado (MRUV)");
	        System.out.println("7 - Velocidade Média");
	        System.out.println("Escolha uma das opções acima:");

	        double op = teclado.nextInt();
	        double n1, n2, n3;
	         
	        if (op == 1) {
	            System.out.println("Digite o Primeiro Número:");
	            n1 = teclado.nextInt();

	            System.out.println("Digite o Segundo Número:");
	            n2 = teclado.nextInt();

	            System.out.println("Digite o terceiro número");
	            n3 = teclado.nextInt();
	            System.out.println("Resultado Força Centrípeta: " + n1 * ((float) Math.pow(n2, 2) / n3));
	        }

	        else if (op == 2) {

	            System.out.println("Digite o Primeiro Número:");
	            n1 = teclado.nextInt();

	            System.out.println("Digite o Segundo Número:");
	            n2 = teclado.nextInt();
	            System.out.println("Resultado Força Elástica: " + n1 * n2);
	        } else if (op == 3) {

	            System.out.println("Digite o Primeiro Número:");
	            n1 = teclado.nextInt();

	            System.out.println("Digite o Segundo Número:");
	            n2 = teclado.nextInt();
	            System.out.println("Resultado Força Peso: " + n1 * n2);
	        } else if (op == 4) {

	            System.out.println("Digite o Primeiro Número:");
	            n1 = teclado.nextInt();

	            System.out.println("Digite o Segundo Número:");
	            n2 = teclado.nextInt();
	            System.out.println("Resultado Impulso: " + n1 * n2);
	        } else if (op == 5) {

	            System.out.println("Digite o Primeiro Número:");
	            n1 = teclado.nextInt();

	            System.out.println("Digite o Segundo Número:");
	            n2 = teclado.nextInt();

	            System.out.println("Digite o terceiro número");
	            n3 = teclado.nextInt();
	            System.out.println("Resultado MRU: " + n1 + (n2 * n3));
	        } else if (op == 6) {

	            System.out.println("Digite o Primeiro Número:");
	            n1 = teclado.nextInt();

	            System.out.println("Digite o Segundo Número:");
	            n2 = teclado.nextInt();
	            System.out.println("Resultado MRUV: " + n1 / n2);
	        } else if (op == 7) {

	            System.out.println("Digite o Primeiro Número:");
	            n1 = teclado.nextInt();

	            System.out.println("Digite o Segundo Número:");
	            n2 = teclado.nextInt();
	            System.out.println("Resultado Velocidade Média: " + n1 / n2);
	        } 
	}
}