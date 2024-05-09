package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.MisArrays;

class Tests {

	@Test
	public void testMediaNotas() {
		float[] arrayNotas = {7,8,9,6,8};
		assertEquals(7.6f, MisArrays.mediaNotas(arrayNotas), 0.01f);
	}
	
	@Test
	public void testMediaNotas2() {
		try {
			float[] arrayErrorMedia = {};
			MisArrays.mediaNotas(arrayErrorMedia);
		} catch (IllegalArgumentException e) {
			assertEquals ("El array está vacio", e.getMessage());
		}
	}
	
	@Test
	public void testMedianaNotas() {
		float [] arrayMedianaNotas = {9};
		assertEquals(9.0f, MisArrays.medianaNotas(arrayMedianaNotas), 0.01f);
	}
	
	@Test
	public void testMedianaNotas2() {
		try {
			float[]arrayErrorMediana = {};
			MisArrays.medianaNotas(arrayErrorMediana);
		} catch (IllegalArgumentException e) {
			assertEquals ("El array está vacio", e.getMessage());
		}
	}
	
	@Test
	public void testMaximaNota() {
		float[] arrayPrueba = {3,7,9,10,5};
		assertEquals(10, MisArrays.maximaNota(arrayPrueba));
	}
	
	@Test
	public void testMaximaNota2() {
		try {
			float[] arrayError = {};
			MisArrays.minimaNota(arrayError);
		} catch (IllegalArgumentException e) {
			assertEquals("El array está vacio", e.getMessage());
		}
	}
	
	@Test
	public void testMinimaNota() {
		float [] arrayPrueba = {7, 8, 3, 5, 10};
		assertEquals(3, MisArrays.minimaNota(arrayPrueba));
	}
	
	@Test
	public void testMinimaNota2() {
		try {
		float[] arrayError = {};
		MisArrays.minimaNota(arrayError);
		} catch (IllegalArgumentException e) {
			assertEquals("El array está vacio", e.getMessage());
		}
	}
}
