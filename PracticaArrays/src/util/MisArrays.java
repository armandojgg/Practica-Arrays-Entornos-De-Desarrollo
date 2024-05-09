package util;

import java.lang.reflect.Array;
import java.util.Arrays;

public abstract class MisArrays {
	
	/**
	 * 
	 * @param arrays
	 * Recibe un array de números enteros entre 0 y 10 y 
	 * devuelve en un float la media con decimales de dicho array.
	 * @return
	 */
	
	public static float mediaNotas(float[] arrays) {
		if (arrays == null || arrays.length == 0) {
			throw new IllegalArgumentException("El array está vacio");
		} 
		int suma = 0;
		for (float nota : arrays) {
			if (nota < 0 || nota > 10) {
				throw new IllegalArgumentException("La nota" + nota + " no está entre 0 y 10");
			}
			suma += nota;
		}
		return (float) suma / arrays.length;
	}
	
	/**
	 * Recibe un array de números enteros entre 0 y 10 y devuelve 
	 * en un float la mediana con decimales de dicho array.
	 * @param arrays
	 * @return
	 */
	public static float medianaNotas (float[] arrays) {
		if (arrays == null || arrays.length == 0) {
			throw new IllegalArgumentException ("El array está vacio");
		}
			Arrays.sort(arrays);
		float a = arrays.length;
		if (a % 2 != 0) {
			return arrays [(int) (a/2)];
		} else {
			float valormedioimpar = arrays [(int) ((a - 1) / 2)];
			float valormediopar = arrays [(int) (a / 2)];
			return (float) (valormedioimpar + valormediopar / 2);
		}
		
	}
	
	/**
	 * Recibe un array de números enteros entre 0 y 10 y devuelve en un entero el valor máximo de dicho array.
	 * @param arrays
	 * @return
	 */
	public static float maximaNota (float [] arrays) {
		if (arrays == null || arrays.length == 0) {
			throw new IllegalArgumentException ("El array está vacio");
		} 
		float maximo = arrays[0];
		for (float num : arrays) {
			if (num < 0 || num > 10) {
				throw new IllegalArgumentException ("El número " + num + "no está entre 0 y 10");
			}
			 if (num > maximo) {
				 maximo = num;
			 }
		}
		return maximo;
	}
	/**
	 * Recibe un array de números enteros entre 0 y 10 y devuelve en un entero el valor mínimo de dicho array.
	 * @param arrayError
	 * @return
	 */
	public static float minimaNota (float[] arrayError) {
		if (arrayError == null || arrayError.length == 0) {
			throw new IllegalArgumentException ("El array está vacio");
		}
		float minimo = arrayError[0];
		for (float num: arrayError) {
			if (num < 0 || num > 10) {
				throw new IllegalArgumentException ("El número " + num + " no está entre 0 y 10");
			}
			if (num < minimo) {
				minimo = num;
			}
		}
		return minimo;
		
	}
}
