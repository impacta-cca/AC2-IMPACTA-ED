package queue;



public class NodeQueue<E> {
	protected int E[];
	protected int size;
	protected Node<E> f;
	protected Node<E> r;
		
	
	
	public int size() {
		return this.size;
		
		
	}

	/* Retorna se a fila está vazia.

	* @return true se a fila estiver vazia, false em caso contrário. */

	public boolean isEmpty() {
		if(size==0) {
			return true;
		}
		else {
			return false;
			
		}
		
	}

	/* Inspeciona o elemento à frente da fila.

	* @return o elemento à frente da fila.

	* @exception EmptyQueueException se a fila estiver vazia. */

	/*public E front() throws EmptyQueueException{
	
	}*/

	/* Insere elemento no final da fila.

	* @param element, o novo elemento a ser inserido. */

	public void enqueue(E elem) {
		
		Node<E> node = new Node<E>();

		node.setElement(elem);

		node.setNext(null); // nodo será o novo nodo do final

		if (size == 0)

		f = node; // caso especial de uma lista previamente vazia

		else

		r.setNext(node); // adiciona nodo no final da lista

		r = node; // atualiza referência ao nodo do final

		size++;
		
	}

	/* Remove o elemento à frente da fila.

	* @return elemento removido.

	* @exception EmptyQueueException se a fila estiver vazia. */

	public E dequeue() throws EmptyQueueException{
		if (size == 0)

			throw new EmptyQueueException("Queue is empty.");

			E tmp = f.getElement();

			f = f.getNext();

			size--;

			if (size == 0)

			r = null;// a fila está vazia agora

			return tmp;
		
		
	}
	
	
	
	
	public String toString() {
		String s;

		Node<E> p = f;

		s = "[";

		while (p != null) {

			s += p.getElement();
	
			s += ", ";
	
			p = p.getNext();

		}

		if (s.length() > 1)

		s = s.substring(0, s.length() -
		2);

		return s + "]";
		
	}

}
