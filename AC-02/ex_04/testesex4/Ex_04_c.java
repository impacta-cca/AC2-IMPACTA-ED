package testesex4;

import static org.junit.jupiter.api.Assertions.*;
import metodo_ex4b.B04c;

import org.junit.jupiter.api.Test;

class Ex_04_c {
	
	B04c metodo = new B04c();

	@Test
	void test() {
		assertEquals(true,metodo.verificaABerto("()(( )){([( )])}"));
		assertEquals(true,metodo.verificaABerto("((( )(( )){([( )])}))"));
		assertEquals(false,metodo.verificaABerto(")(( )){([( )])}"));
		assertEquals(false,metodo.verificaABerto("({[])}"));
		assertEquals(false,metodo.verificaABerto("("));
		
		assertEquals(false,metodo.verificaABerto(""));
		assertEquals(false,metodo.verificaABerto("((((({{{{"));
		assertEquals(false,metodo.verificaABerto("}}}]]"));
		
		assertEquals(false,metodo.verificaABerto("}}}]][[{{{"));
	
	}

}
