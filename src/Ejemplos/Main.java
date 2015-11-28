package Ejemplos;

import java.util.Arrays;
import SortArrays.*;

public class Main {

	// Array a ordenar:
	public static int[] intArray = { 3, 2, 8, 5, 7, 9 };
	public static float[] floatArray = { 3.3f, 2.2f, 8.8f, 5.5f, 7.7f, 9.9f };
	public static double[] doubleArray = { 3.33333, 2.22222, 8.88888, 5.55555,
			7.77777, 9.99999 };
	public static String[] stringArray = { "España", "Francia", "Italia",
			"Alemania", "Holanda" };

	public static void main(String args[]) {

		// hacemos una copia de todos los arrays para ordenarlos de forma
		// ascendente y descendente
		int[] intArray2 = Arrays.copyOf(intArray, intArray.length);
		int[] intArray3 = Arrays.copyOf(intArray, intArray.length);
		float[] floatArray2 = Arrays.copyOf(floatArray, floatArray.length);
		double[] doubleArray2 = Arrays.copyOf(doubleArray, doubleArray.length);
		String[] stringArray2 = Arrays.copyOf(stringArray, stringArray.length);

		// Metodo de ordenación de arrays utilizando los métodos de java
		System.out.println("...Array desordenado...");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		// Método "sort" para ordenar el array
		Arrays.sort(intArray);
		System.out
				.println("\n...Array Ordenado de menos a más Aplicando el método \"Sort\" de java...");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();

		/***********************************************************************************/
		/** ORDENACION DE NUMEROS ENTEROS **/
		/***********************************************************************************/

		// Ordenamos el array de menor a mayor y mostramos los indices del array
		// original
		System.out.println("\n...Array desordenado de enteros ...");
		System.out.print("Indices: ");
		for (int i = 0; i < intArray2.length; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\nArray:   ");
		for (int i = 0; i < intArray2.length; i++) {
			System.out.print(intArray2[i] + " ");
		}
		// Nos creamos el objeto y ordenamos el array
		SortArrays sortArrays = new SortArrays(intArray2);
		sortArrays = sortArrays.increasingOrderInt();
		System.out
				.println("\n...Array Ordenado crecientemente con sus indices utilizando el API ...");
		System.out.print("Indices: ");
		for (int i = 0; i < sortArrays.getIndexArray().length; i++) {
			System.out.print(sortArrays.getIndexArray()[i] + " ");
		}
		System.out.print("\nArray:   ");
		for (int i = 0; i < sortArrays.getIntArray().length; i++) {
			System.out.print(sortArrays.getIntArray()[i] + " ");
		}
		System.out.println();

		// Ordenamos el array de mayor a menor y mostramos los indices del array
		// original
		System.out.println("\n...Array desordenado de enteros ...");
		System.out.print("Indices: ");
		for (int i = 0; i < intArray3.length; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\nArray:   ");
		for (int i = 0; i < intArray3.length; i++) {
			System.out.print(intArray3[i] + " ");
		}
		// Nos creamos el objeto y ordenamos el array
		sortArrays = new SortArrays(intArray3);
		sortArrays = sortArrays.decreasingOrderInt();
		System.out
				.println("\n...Array Ordenado decrecientemente con sus indices utilizando el API ...");
		System.out.print("Indices: ");
		for (int i = 0; i < sortArrays.getIndexArray().length; i++) {
			System.out.print(sortArrays.getIndexArray()[i] + " ");
		}
		System.out.print("\nArray:   ");
		for (int i = 0; i < sortArrays.getIntArray().length; i++) {
			System.out.print(sortArrays.getIntArray()[i] + " ");
		}
		System.out.println();

		/**************************************************************************/
		/** ORDENACION DE FLOATS **/
		/**************************************************************************/

		// Ordenamos el array de menor a mayor y mostramos los indices del array
		// original
		System.out.println("\n...Array desordenado de floats ...");
		System.out.print("Indices: ");
		for (int i = 0; i < floatArray.length; i++) {
			System.out.print(" " + i + "    ");
		}
		System.out.print("\nArray:   ");
		for (int i = 0; i < floatArray.length; i++) {
			System.out.print(floatArray[i] + "   ");
		}
		// Nos creamos el objeto y ordenamos el array
		sortArrays = new SortArrays(floatArray);
		sortArrays = sortArrays.increasingOrderFloat();
		System.out
				.println("\n...Array Ordenado crecientemente con sus indices utilizando el API ...");
		System.out.print("Indices: ");
		for (int i = 0; i < sortArrays.getIndexArray().length; i++) {
			System.out.print(" " + sortArrays.getIndexArray()[i] + "    ");
		}
		System.out.print("\nArray:   ");
		for (int i = 0; i < sortArrays.getFloatArray().length; i++) {
			System.out.print(sortArrays.getFloatArray()[i] + "   ");
		}
		System.out.println();

		// Ordenamos el array de mayor a menor y mostramos los indices del array
		// original
		System.out.println("\n...Array desordenado de floats ...");
		System.out.print("Indices: ");
		for (int i = 0; i < floatArray2.length; i++) {
			System.out.print(" " + i + "    ");
		}
		System.out.print("\nArray:   ");
		for (int i = 0; i < floatArray2.length; i++) {
			System.out.print(floatArray2[i] + "   ");
		}
		// Nos creamos el objeto y ordenamos el array
		sortArrays = new SortArrays(floatArray2);
		sortArrays = sortArrays.decreasingOrderFloat();
		System.out
				.println("\n...Array Ordenado decrecientemente con sus indices utilizando el API ...");
		System.out.print("Indices: ");
		for (int i = 0; i < sortArrays.getIndexArray().length; i++) {
			System.out.print(" " + sortArrays.getIndexArray()[i] + "    ");
		}
		System.out.print("\nArray:   ");
		for (int i = 0; i < sortArrays.getFloatArray().length; i++) {
			System.out.print(sortArrays.getFloatArray()[i] + "   ");
		}
		System.out.println();

		/***************************************************************************/
		/** ORDENACION DE DOUBLES **/
		/***************************************************************************/

		// Ordenamos el array de menor a mayor y mostramos los indices del array
		// original
		System.out.println("\n...Array desordenado de doubles ...");
		System.out.print("Indices: ");
		for (int i = 0; i < doubleArray.length; i++) {
			System.out.print("   " + i + "      ");
		}
		System.out.print("\nArray:   ");
		for (int i = 0; i < doubleArray.length; i++) {
			System.out.print(doubleArray[i] + "   ");
		}
		// Nos creamos el objeto y ordenamos el array
		sortArrays = new SortArrays(doubleArray);
		sortArrays = sortArrays.increasingOrderDouble();
		System.out
				.println("\n...Array Ordenado crecientemente con sus indices utilizando el API ...");
		System.out.print("Indices: ");
		for (int i = 0; i < sortArrays.getIndexArray().length; i++) {
			System.out.print("   " + sortArrays.getIndexArray()[i] + "      ");
		}
		System.out.print("\nArray:   ");
		for (int i = 0; i < sortArrays.getDoubleArray().length; i++) {
			System.out.print(sortArrays.getDoubleArray()[i] + "   ");
		}
		System.out.println();

		// Ordenamos el array de mayor a menor y mostramos los indices del array
		// original
		System.out.println("\n...Array desordenado de doubles ...");
		System.out.print("Indices: ");
		for (int i = 0; i < doubleArray2.length; i++) {
			System.out.print("   " + i + "      ");
		}
		System.out.print("\nArray:   ");
		for (int i = 0; i < doubleArray2.length; i++) {
			System.out.print(doubleArray2[i] + "   ");
		}
		// Nos creamos el objeto y ordenamos el array
		sortArrays = new SortArrays(doubleArray2);
		sortArrays = sortArrays.decreasingOrderDouble();
		System.out
				.println("\n...Array Ordenado decrecientemente con sus indices utilizando el API ...");
		System.out.print("Indices: ");
		for (int i = 0; i < sortArrays.getIndexArray().length; i++) {
			System.out.print("   " + sortArrays.getIndexArray()[i] + "      ");
		}
		System.out.print("\nArray:   ");
		for (int i = 0; i < sortArrays.getDoubleArray().length; i++) {
			System.out.print(sortArrays.getDoubleArray()[i] + "   ");
		}
		System.out.println();

		/***************************************************************************/
		/** ORDENACION DE STRINGS **/
		/***************************************************************************/

		// Ordenamos el array de menor a mayor y mostramos los indices del array
		// original
		System.out.println("\n...Array desordenado de Strings ...");
		System.out.print("Indices: ");
		for (int i = 0; i < stringArray.length; i++) {
			System.out.print("   " + i + "      ");
		}
		System.out.print("\nArray:   ");
		for (int i = 0; i < stringArray.length; i++) {
			System.out.print(stringArray[i] + "   ");
		}
		// Nos creamos el objeto y ordenamos el array
		sortArrays = new SortArrays(stringArray);
		sortArrays = sortArrays.increasingOrderString();
		System.out
				.println("\n...Array Ordenado crecientemente con sus indices utilizando el API ...");
		System.out.print("Indices: ");
		for (int i = 0; i < sortArrays.getIndexArray().length; i++) {
			System.out.print("   " + sortArrays.getIndexArray()[i] + "      ");
		}
		System.out.print("\nArray:   ");
		for (int i = 0; i < sortArrays.getStringArray().length; i++) {
			System.out.print(sortArrays.getStringArray()[i] + "   ");
		}
		System.out.println();

		// Ordenamos el array de mayor a menor y mostramos los indices del array
		// original
		System.out.println("\n...Array desordenado de Strings ...");
		System.out.print("Indices: ");
		for (int i = 0; i < stringArray2.length; i++) {
			System.out.print("   " + i + "      ");
		}
		System.out.print("\nArray:   ");
		for (int i = 0; i < stringArray2.length; i++) {
			System.out.print(stringArray2[i] + "   ");
		}
		// Nos creamos el objeto y ordenamos el array
		sortArrays = new SortArrays(stringArray2);
		sortArrays = sortArrays.decreasingOrderString();
		System.out
				.println("\n...Array Ordenado decrecientemente con sus indices utilizando el API ...");
		System.out.print("Indices: ");
		for (int i = 0; i < sortArrays.getIndexArray().length; i++) {
			System.out.print("   " + sortArrays.getIndexArray()[i] + "      ");
		}
		System.out.print("\nArray:   ");
		for (int i = 0; i < sortArrays.getStringArray().length; i++) {
			System.out.print(sortArrays.getStringArray()[i] + "   ");
		}
		System.out.println();

	}

}
