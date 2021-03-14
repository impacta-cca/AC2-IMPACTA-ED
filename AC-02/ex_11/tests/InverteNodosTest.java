package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import listaSimplesmenteEncadeada.EmptyListException;
import listaSimplesmenteEncadeada.SLinkedList;

class InverteNodosTest {
	
	SLinkedList lista = new SLinkedList();

	@Test
	void test() {
		
		assertThrows(EmptyListException.class, () -> {
			lista.inverter();
		});
		
		assertThrows(EmptyListException.class, () -> {
			lista.toString();
		});
		
		lista.addNodo("um");
		lista.addNodo("dois");
		lista.addNodo("três");
		lista.addNodo("quatro");

		assertEquals("[um, dois, três, quatro]", lista.toString(), "Deve resultar [um, dois, três, quatro]");
		
		lista.inverter();
		
		assertEquals("[quatro, três, dois, um]", lista.toString(), "Deve resultar [quatro, três, dois, um]");
		
	}

}
