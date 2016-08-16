
public class DoubleNode<E> {


public DoubleNode(E _value){
    next = null;
    prev = null;
    value = _value;
}

protected E value;
protected DoubleNode next;
protected DoubleNode prev;

public void setValue(E value){
    this.value = value;
}

public E getValue(){
    return value;
}

public void setNext(DoubleNode next){
    this.next = next;
}

public DoubleNode getNext(){
    return next;
}
}