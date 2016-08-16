import java.util.Iterator;



/**
 *
 * @author Olivet
 * @param <E>
 */
<<<<<<< HEAD
public class CircularLinkedList<E> extends AbstractList implements I_Lista {

	private Node<E> tail;
	private int count;
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addFirst(Object value) {
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
	public void addLast(Object value) {
		addFirst(value);
		tail = tail.next();
		
	}

	@Override
	public Object getFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object removeFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object removeLast() {
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
		return temp.value;
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
	public Object remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object get() {
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
	public Object get(int i) {
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
	public Object remove(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}
=======
public class CircularLinkedList<E> {
>>>>>>> origin/master
    
}
