import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);

		System.out.println("Calculadora");
		System.out.println("1-Soma");
		System.out.println("2-Subtração");
		System.out.println("3-Multiplicação");
		System.out.println("4-Divisão");
		System.out.print("Escolha uma operação");

		int opcao = scanner.nextInt();

		System.out.print("Digite o primero numero: ");
		double num1 = scanner.nextDouble();

		System.out.print("Digite o segundo numero: ");
		double num2 = scanner.nextDouble();

		Double resultado;

		switch (opcao) {
			case 1:
				resultado = num1 + num2;
				System.out.println("Resultado: " + resultado);
				break;
			case 2:
				resultado = num1 - num2;
				System.out.println("Resulatdo: " + resultado);
				break;
			case 3:
				resultado = num1 * num2;
				System.out.println("Resultado: " + resultado);
				break;
			case 4:
				if (num2 != 0) {
					resultado = num1 / num2;
					System.out.println("Resultado: " + resultado);
					break;
				} else {
					System.out.println("Erro! operação invalida.");
				}
				break;

			default:
				System.out.println("Operação invalida!");
		}	
		
		scanner.close();
	}
}
