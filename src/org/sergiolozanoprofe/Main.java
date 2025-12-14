package org.sergiolozanoprofe;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce filas:");
		int filas = sc.nextInt();
		System.out.println("Introduce columnas:");
		int columnas = sc.nextInt();

		int[][] matriz = new int[filas][columnas];

		// Rellenar la matriz con números consecutivos
		int contador = 1;
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				matriz[i][j] = contador++;
			}
		}

		// Mostrar la matriz creada
		mostrarMatriz(matriz);

		// Invertir cada fila
		invertirFilas(matriz);

		// Mostrar la matriz invertida
		mostrarMatriz(matriz);
	}

	private static void invertirFilas(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			int left = 0;
			int right = matriz[i].length-1;

			while (left < right) {
				int temp = matriz[i][left];
				matriz[i][left] = matriz[i][right];
				matriz[i][right] = temp;

				left++;
				right--;
			}
		}
	}

	private static void mostrarMatriz(int[][] matriz) {
		System.out.println("Matriz creada:");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}

}

