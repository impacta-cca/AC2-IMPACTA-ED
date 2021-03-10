package testes2;

import org.junit.jupiter.api.Test;

import pilhaspackage.ArrayStack;

class testepilha {

	static final ArrayStack<Integer> a = new ArrayStack<Integer>();

	@Test
	void pilhaInteiros() {

	a.push(5);
	System.out.println(a.toString());
	a.push(3);
	System.out.println(a.toString());
	a.pop();
	System.out.println(a.toString());
	a.push(2);
	System.out.println(a.toString());
	a.push(8);
	System.out.println(a.toString());
	a.pop();
	System.out.println(a.toString());
	a.pop();
	System.out.println(a.toString());
	a.push(9);
	System.out.println(a.toString());
	a.push(1);
	System.out.println(a.toString());
	a.pop();
	a.push(7);
	System.out.println(a.toString());
	a.push(6);
	System.out.println(a.toString());
	a.pop();
	System.out.println(a.toString());
	a.pop();
	System.out.println(a.toString());
	a.push(4);
	
	a.pop();
	a.pop();
	
	
	
	
	}
}
