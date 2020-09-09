package application;

import java.util.Locale;
import java.util.Scanner;

public class Program_exercicio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o n�mero de linhas:(N) ");

		int linha = sc.nextInt();
		System.out.println("Insira o n�mero de colunas:(M) ");

		int coluna = sc.nextInt();

		int[][] matriz = new int[linha][coluna];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {

				matriz[i][j] = sc.nextInt();

			}

		}

		System.out.println("Digite um numero que perten�a � Matriz: ");
		int x = sc.nextInt();

		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {

				if (matriz[i][j] == x) {

					System.out.println("Posi��o :" + i + ", " + j + " ");
					if (j > 0) {
						System.out.println("N�mero Esquerda: " + matriz[i][j - 1] + " ");
					}
					if (j < matriz.length - 1) {
						System.out.println("N�mero Direita: " + matriz[i][j + 1] + " ");
					}
					if (i > 0) {
						System.out.println("N�mero Acima: " + matriz[i - 1][j] + " ");
					}
					if (i < matriz.length - 1) {
						System.out.println("N�mero Abaixo: " + matriz[i + 1][j] + " ");
					}

					// esse if evita error com valor 0 ou negativo

				}

			}
		}

		sc.close();
	}

}
