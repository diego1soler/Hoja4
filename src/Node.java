public class Node<E> {
    
   
    
    protected E data;
    protected Node<E> nextElement;
    
    public Node(E v, Node<E> next){
        data = v;
        nextElement = next;
    }
    
    public Node(E v){
    	this(v,null);
    }
    
    public E getValue(){
    	return data;
    }
    
    
    public void setValue(E value){
        data = value;
    }
    
    
    
    public void setNext(Node<E> next){
       nextElement = next;
    }
    
    public Node<E> next(){
        return nextElement;
    }
    
    public E value(){
    	return data;
    }

	public Node<E> getNext() {
		
		return nextElement;
	}
}

