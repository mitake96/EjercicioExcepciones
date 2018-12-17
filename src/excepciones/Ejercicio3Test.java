package excepciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static excepciones.Ejercicio3.*;

class Ejercicio3Test {

	@Test
	void test() {
		assertTrue(testjunit(7));
		assertTrue(testjunit(71));
		assertTrue(testjunit(97));
		assertTrue(testjunit(593));
		assertTrue(testjunit(359));
		assertFalse(testjunit(6));
		assertFalse(testjunit(4));
		assertFalse(testjunit(660));
		assertFalse(testjunit(852));
	}

}
