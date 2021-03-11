package testesex4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import arranjo.ArrayIndexList;
import metodo_ex4b.B04;

class Ex_04_b {
	Object o;
	ArrayIndexList<Integer> arranjo = new ArrayIndexList<Integer>();

	@Test
	void invertearranjoPilhaLSE() {
		for (int i = 0; i < 4; i++) {
			arranjo.add(i, i + 1);
		}
		assertEquals("(4, 3, 2, 1)", B04.invertearranjo(arranjo).toString());
	}

}
