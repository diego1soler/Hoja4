import java.util.Iterator;

public class SinglyLinkedList<E> extends AbstractStack<E> {
    
    private Node<E> head;
    private Node<E> temp;
    private E val;
    
    public SinglyLinkedList(){
        head = null;
        temp = null;
        val = null;
        count = 0;
    }

    /**
     *
     * @param e
     */
    @Override
    public void addFirst(E e) {
        temp = head;
        head = new Node(e);
        head.setNext(temp);
        count++;
    }
    @Override
    public E removeFirst() {
        val = head.getValue();
        head = head.getNext();
        count--;
        return val;
        
    }
    @Override
    public E getFirst() {
        val = head.getValue();
        return val;
    }

	@Override
	public void addLast(E value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E getLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E removeLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E remove(E value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(E value) {
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
	public boolean contains(E value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int indexOf(E value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(E value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public E get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E set(int i, E o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int i, E o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E remove(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}



    
}