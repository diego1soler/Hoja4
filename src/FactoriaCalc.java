

public class FactoriaCalc {

public static <E> StackArrayList<E> getPila(){
	return new StackArrayList<E>();
	}

public static <E> StackVector<E>	getVector(){
	return new StackVector<E>();
}

public static <E> SinglyLinkedList<E>	getSinlgyLinkedList(){
	return new SinglyLinkedList<E>();
}

public static <E> DoubleLinkedList<E>	getDoubleLinkedList(){
	return new DoubleLinkedList<E>();
}

public static <E> CircularLinkedList<E>	getCircularLinkedList(){
	return new CircularLinkedList<E>();
}

	
}
