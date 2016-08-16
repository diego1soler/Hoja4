import java.util.Iterator;


/**
 * @author Diego Soler, Fredy Espana
 * Clase CircularLinkedList
 * @version 15/08/2016
 */

public class CircularLinkedList<E> extends AbstractStack<E> {

	private Node<E> tail;
	private int count;
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addFirst(E value) {
		Node<E> temp = new Node<E>(value);
		if (tail == null){
			tail = temp;
			tail.setNext(tail);
		}
			else{
				temp.setNext(tail.next());
				tail.setNext(temp);
			}
		
	}

	@Override
	public void addLast(E value) {
		addFirst(value);
		tail = tail.next();
		
	}

	@Override
	public E getFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E getLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E removeFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E removeLast() {
		Node<E> finger = tail;
		while(finger.next() != tail){
			finger = finger.next();
		}
		
		Node<E> temp = tail;
		if (finger == tail)
		{
			tail = null;
		} else {
			finger.setNext(tail.next());
			tail = finger;
		}
		count --;
		return temp.data;
	}

	@Override
	public Object remove(Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contains(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int indexOf(Object value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public E get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object set(int i, Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int i, Object o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E remove(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

    
}
