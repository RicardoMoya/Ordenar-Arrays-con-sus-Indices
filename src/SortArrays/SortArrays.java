package SortArrays;

import java.util.Arrays;

public class SortArrays {

	/**
	 * Array with the index
	 */
	private int[] indexArray;
	
	/**
	 * Array of integers
	 */
	private int[] intArray;
	
	/**
	 * Array of floats
	 */
	private float[] floatArray;
	
	/**
	 * Array of doubles
	 */
	private double[] doubleArray;
	
	/**
	 * Array of Strings
	 */
	private String[] stringArray;
	
	/**
	 * Return the index of sorting array
	 * @return index of sorting array 
	 */
	public int[] getIndexArray() {
		return indexArray;
	}

	/**
	 * Set the index of sorting array
	 * @param indexArray
	 */
	public void setIndexArray(int[] indexArray) {
		this.indexArray = indexArray;
	}

	/**
	 * Return the array of integers
	 * @return array of integers
	 */
	public int[] getIntArray() {
		return intArray;
	}

	/**
	 * Set the array of integers
	 * @param intArray
	 */
	public void setIntArray(int[] intArray) {
		this.intArray = intArray;
	}

	/**
	 * Return the array of floats
	 * @return array of floats
	 */
	public float[] getFloatArray() {
		return floatArray;
	}

	/**
	 * Set the array of floats
	 * @param floatArray
	 */
	public void setFloatArray(float[] floatArray) {
		this.floatArray = floatArray;
	}

	/**
	 * Return the array of Doubles
	 * @return array of doubles
	 */
	public double[] getDoubleArray() {
		return doubleArray;
	}

	/**
	 * Set the array of doubles
	 * @param doubleArray
	 */
	public void setDoubleArray(double[] doubleArray) {
		this.doubleArray = doubleArray;
	}

	/**
	 * Return the array of Strings
	 * @return array of Strings
	 */
	public String[] getStringArray() {
		return stringArray;
	}

	/**
	 * Set the array of Strings
	 * @param stringArray
	 */
	public void setStringArray(String[] stringArray) {
		this.stringArray = stringArray;
	}

	/**
	 * Constructor
	 */
	public SortArrays() {
	}

	/**
	 * Constructor, passing an array of integers
	 * @param intArray - Disordered array of integers
	 */
	public SortArrays(int[] intArray) {
		this.intArray = intArray;
		this.indexArray = new int[intArray.length];
	}

	/**
	 * Constructor, passing an array of floats
	 * @param floatArray - Disordered array of floats
	 */
	public SortArrays(float[] floatArray) {
		this.floatArray = floatArray;
		this.indexArray = new int [floatArray.length];
	}

	/**
	 * Constructor, passing an array of doubles
	 * @param doubleArray - Disordered array of doubles
	 */
	public SortArrays(double[] doubleArray) {
		this.doubleArray = doubleArray;
		this.indexArray = new int [doubleArray.length];
	}

	/**
	 * Constructor, passing an array of Strings
	 * @param stringArray - Disordered array of Strings
	 */
	public SortArrays(String[] stringArray) {
		this.stringArray = stringArray;
		this.indexArray = new int [stringArray.length];
	}

	/**
	 * Method that return the object that contains the sorted (increasing) array of integers and its sorted index
	 * @return object of sorted arrays and index
	 */
	public SortArrays increasingOrderInt() {
		return increasingOrderInt(getIntArray());
	}

	/**
	 * Method that return the object that contains the sorted (increasing) array of integers and its sorted index
	 * @param intArray - Disordered array of integers
	 * @return object of sorted arrays and index
	 */
	public SortArrays increasingOrderInt(int[] intArray) {
		if (intArray == null) {
			System.out.println("Error... The Array is Empty");
			return null;
		} else {
			int[] index = new int[intArray.length];
			SortArrays sa = new SortArrays(intArray);

			
			
			// Create de copy of Array
			int[] intArrayOld = new int[intArray.length];
			for (int i = 0; i < intArray.length; i++) {
				intArrayOld[i] = intArray[i];
			}

			// Order the Array in increasing order
			Arrays.sort(intArray);
			index = orderIntIndex(intArrayOld, intArray);

			// Put the arrays in the object
			sa.setIntArray(intArray);
			sa.setIndexArray(index);

			return sa;
		}
	}
	
	/**
	 * Method that return the object that contains the sorted (decreasing) array of integers and its sorted index
	 * @return object of sorted arrays and index
	 */
	public SortArrays decreasingOrderInt() {
		return decreasingOrderInt(getIntArray());
	}
	
	/**
	 * Method that return the object that contains the sorted (decreasing) array of integers and its sorted index
	 * @param intArray - Disordered array of integers
	 * @return object of sorted arrays and index
	 */
	public SortArrays decreasingOrderInt(int[] intArray) {
		if (intArray == null) {
			System.out.println("Error... The Array is Empty");
			return null;
		} else {
			int[] index = new int[intArray.length];
			SortArrays sa = new SortArrays(intArray);

			// Create de copy of Array
			int[] intArrayOld = new int[intArray.length];
			for (int i = 0; i < intArray.length; i++) {
				intArrayOld[i] = intArray[i];
			}

			// Order the Array in decreasing order
			Arrays.sort(intArray);
			intArray = invertIntArray(intArray);
			index = orderIntIndex(intArrayOld, intArray);

			// Put the arrays in the object
			sa.setIntArray(intArray);
			sa.setIndexArray(index);

			return sa;
		}
	}

	private int[] orderIntIndex(int[] disorderArray, int[] orderArray) {
		int lon = disorderArray.length;

		int[] index = new int[lon];
		Arrays.fill(index, 0);

		boolean[] esta = new boolean[lon];
		Arrays.fill(esta, false);

		for (int i = 0; i < orderArray.length; i++) {
			int in = 0;
			boolean stay = false;
			while (in < orderArray.length & !stay) {
				if ((disorderArray[in] == orderArray[i]) & !esta[in]) {
					esta[in] = true;
					index[i] = in;
					stay = true;
				} else {
					in++;
				}
			}
		}

		return index;
	}

	private int[] invertIntArray(int[] array) {
		int i = 0;
		int j = array.length - 1;
		int tmp;
		while (j > i) {
			tmp = array[j];
			array[j] = array[i];
			array[i] = tmp;
			j--;
			i++;
		}

		return array;
	}
	
	/**
	 * Method that return the object that contains the sorted (increasing) array of floats and its sorted index
	 * @return object of sorted arrays and index
	 */
	public SortArrays increasingOrderFloat() {
		return increasingOrderFloat(getFloatArray());
	}

	/**
	 * Method that return the object that contains the sorted (increasing) array of floats and its sorted index
	 * @param floatArray - Disordered array of floats
	 * @return object of sorted arrays and index
	 */
	public SortArrays increasingOrderFloat(float[] floatArray) {
		if (floatArray == null) {
			System.out.println("Error... The Array is Empty");
			return null;
		} else {
			int[] index = new int[floatArray.length];
			SortArrays sa = new SortArrays(floatArray);

			// Create de copy of Array
			float[] floatArrayOld = new float[floatArray.length];
			for (int i = 0; i < floatArray.length; i++) {
				floatArrayOld[i] = floatArray[i];
			}

			// Order the Array in increasing order
			Arrays.sort(floatArray);
			index = orderFloatIndex(floatArrayOld, floatArray);

			// Put the arrays in the object
			sa.setFloatArray(floatArray);
			sa.setIndexArray(index);

			return sa;
		}
	}
	
	/**
	 * Method that return the object that contains the sorted (decreasing) array of floats and its sorted index
	 * @return object of sorted arrays and index
	 */
	public SortArrays decreasingOrderFloat() {
		return decreasingOrderFloat(getFloatArray());
	}
	
	/**
	 * Method that return the object that contains the sorted (decreasing) array of floats and its sorted index
	 * @param floatArray - Disordered array of floats
	 * @return object of sorted arrays and index
	 */
	public SortArrays decreasingOrderFloat(float[] floatArray) {
		if (floatArray == null) {
			System.out.println("Error... The Array is Empty");
			return null;
		} else {
			int[] index = new int[floatArray.length];
			SortArrays sa = new SortArrays(floatArray);

			// Create de copy of Array
			float[] floatArrayOld = new float[floatArray.length];
			for (int i = 0; i < floatArray.length; i++) {
				floatArrayOld[i] = floatArray[i];
			}

			// Order the Array in decreasing order
			Arrays.sort(floatArray);
			floatArray = invertFloatArray(floatArray);
			index = orderFloatIndex(floatArrayOld, floatArray);

			// Put the arrays in the object
			sa.setFloatArray(floatArray);
			sa.setIndexArray(index);

			return sa;
		}
	}

	private int[] orderFloatIndex(float[] disorderArray, float[] orderArray) {
		int lon = disorderArray.length;

		int[] index = new int[lon];
		Arrays.fill(index, 0);

		boolean[] esta = new boolean[lon];
		Arrays.fill(esta, false);

		for (int i = 0; i < orderArray.length; i++) {
			int in = 0;
			boolean stay = false;
			while (in < orderArray.length & !stay) {
				if ((disorderArray[in] == orderArray[i]) & !esta[in]) {
					esta[in] = true;
					index[i] = in;
					stay = true;
				} else {
					in++;
				}
			}
		}

		return index;
	}

	private float[] invertFloatArray(float[] array) {
		int i = 0;
		int j = array.length - 1;
		float tmp;
		while (j > i) {
			tmp = array[j];
			array[j] = array[i];
			array[i] = tmp;
			j--;
			i++;
		}

		return array;
	}
	
	
	/**
	 * Method that return the object that contains the sorted (increasing) array of doubles and its sorted index
	 * @return object of sorted arrays and index
	 */
	public SortArrays increasingOrderDouble() {
		return increasingOrderDouble(getDoubleArray());
	}

	/**
	 * Method that return the object that contains the sorted (increasing) array of doubles and its sorted index
	 * @param doubleArray - Disordered array of doubles
	 * @return object of sorted arrays and index
	 */
	public SortArrays increasingOrderDouble(double[] doubleArray) {
		if (doubleArray == null) {
			System.out.println("Error... The Array is Empty");
			return null;
		} else {
			int[] index = new int[doubleArray.length];
			SortArrays sa = new SortArrays(doubleArray);

			// Create de copy of Array
			double[] doubleArrayOld = new double[doubleArray.length];
			for (int i = 0; i < doubleArray.length; i++) {
				doubleArrayOld[i] = doubleArray[i];
			}

			// Order the Array in increasing order
			Arrays.sort(doubleArray);
			index = orderDoubleIndex(doubleArrayOld, doubleArray);

			// Put the arrays in the object
			sa.setDoubleArray(doubleArray);
			sa.setIndexArray(index);

			return sa;
		}
	}
	
	/**
	 * Method that return the object that contains the sorted (decreasing) array of doubles and its sorted index
	 * @return object of sorted arrays and index
	 */
	public SortArrays decreasingOrderDouble() {
		return decreasingOrderDouble(getDoubleArray());
	}
	
	/**
	 * Method that return the object that contains the sorted (decreasing) array of doubles and its sorted index
	 * @param doubleArray - Disordered array of doubles
	 * @return object of sorted arrays and index
	 */
	public SortArrays decreasingOrderDouble(double[] doubleArray) {
		if (doubleArray == null) {
			System.out.println("Error... The Array is Empty");
			return null;
		} else {
			int[] index = new int[doubleArray.length];
			SortArrays sa = new SortArrays(doubleArray);

			// Create de copy of Array
			double[] doubleArrayOld = new double[doubleArray.length];
			for (int i = 0; i < doubleArray.length; i++) {
				doubleArrayOld[i] = doubleArray[i];
			}

			// Order the Array in decreasing order
			Arrays.sort(doubleArray);
			doubleArray = invertDoubleArray(doubleArray);
			index = orderDoubleIndex(doubleArrayOld, doubleArray);

			// Put the arrays in the object
			sa.setDoubleArray(doubleArray);
			sa.setIndexArray(index);

			return sa;
		}
	}

	private int[] orderDoubleIndex(double[] disorderArray, double[] orderArray) {
		int lon = disorderArray.length;

		int[] index = new int[lon];
		Arrays.fill(index, 0);

		boolean[] esta = new boolean[lon];
		Arrays.fill(esta, false);

		for (int i = 0; i < orderArray.length; i++) {
			int in = 0;
			boolean stay = false;
			while (in < orderArray.length & !stay) {
				if ((disorderArray[in] == orderArray[i]) & !esta[in]) {
					esta[in] = true;
					index[i] = in;
					stay = true;
				} else {
					in++;
				}
			}
		}

		return index;
	}

	private double[] invertDoubleArray(double[] array) {
		int i = 0;
		int j = array.length - 1;
		double tmp;
		while (j > i) {
			tmp = array[j];
			array[j] = array[i];
			array[i] = tmp;
			j--;
			i++;
		}

		return array;
	}
	
	/**
	 * Method that return the object that contains the sorted (increasing) array of Strings and its sorted index
	 * @return object of sorted arrays and index
	 */
	public SortArrays increasingOrderString() {
		return increasingOrderString(getStringArray());
	}

	/**
	 * Method that return the object that contains the sorted (increasing) array of Strings and its sorted index
	 * @param stringArray - Disordered array of strings
	 * @return object of sorted arrays and index
	 */
	public SortArrays increasingOrderString(String[] stringArray) {
		if (stringArray == null) {
			System.out.println("Error... The Array is Empty");
			return null;
		} else {
			int[] index = new int[stringArray.length];
			SortArrays sa = new SortArrays(stringArray);

			// Create de copy of Array
			String[] stringArrayOld = new String[stringArray.length];
			for (int i = 0; i < stringArray.length; i++) {
				stringArrayOld[i] = stringArray[i];
			}

			// Order the Array in increasing order
			Arrays.sort(stringArray);
			index = orderStringIndex(stringArrayOld, stringArray);

			// Put the arrays in the object
			sa.setStringArray(stringArray);
			sa.setIndexArray(index);

			return sa;
		}
	}
	
	/**
	 * Method that return the object that contains the sorted (decreasing) array of Strings and its sorted index
	 * @return object of sorted arrays and index
	 */
	public SortArrays decreasingOrderString() {
		return decreasingOrderString(getStringArray());
	}
	
	/**
	 * Method that return the object that contains the sorted (decreasing) array of Strings and its sorted index
	 * @param stringArray - Disordered array of strings
	 * @return object of sorted arrays and index
	 */
	public SortArrays decreasingOrderString(String[] stringArray) {
		if (stringArray == null) {
			System.out.println("Error... The Array is Empty");
			return null;
		} else {
			int[] index = new int[stringArray.length];
			SortArrays sa = new SortArrays(stringArray);

			// Create de copy of Array
			String[] stringArrayOld = new String[stringArray.length];
			for (int i = 0; i < stringArray.length; i++) {
				stringArrayOld[i] = stringArray[i];
			}

			// Order the Array in decreasing order
			Arrays.sort(stringArray);
			stringArray = invertStringArray(stringArray);
			index = orderStringIndex(stringArrayOld, stringArray);

			// Put the arrays in the object
			sa.setStringArray(stringArray);
			sa.setIndexArray(index);

			return sa;
		}
	}

	private int[] orderStringIndex(String[] disorderArray, String[] orderArray) {
		int lon = disorderArray.length;

		int[] index = new int[lon];
		Arrays.fill(index, 0);

		boolean[] esta = new boolean[lon];
		Arrays.fill(esta, false);

		for (int i = 0; i < orderArray.length; i++) {
			int in = 0;
			boolean stay = false;
			while (in < orderArray.length & !stay) {
				if ((disorderArray[in] == orderArray[i]) & !esta[in]) {
					esta[in] = true;
					index[i] = in;
					stay = true;
				} else {
					in++;
				}
			}
		}

		return index;
	}

	private String[] invertStringArray(String[] array) {
		int i = 0;
		int j = array.length - 1;
		String tmp;
		while (j > i) {
			tmp = array[j];
			array[j] = array[i];
			array[i] = tmp;
			j--;
			i++;
		}

		return array;
	}


}
