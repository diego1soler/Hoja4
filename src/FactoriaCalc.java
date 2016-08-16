/**
 * @author Diego Soler, Fredy Espana
 * Clase Factory
 * @version 15/08/2016
 */

public class FactoriaCalc {

	
public static <E>StackVector<E> getVector(){
	return new StackVector<E>();
}
	

public static <E> AbstractStack<E> getLista(int eleccion1,int eleccion2){
	
	//Aqui ocurre la magia
	switch(eleccion1){
	
	
	case 2:
	return new StackArrayList<E>();
	
	
	case 3:
	
		if (eleccion2 ==1){
			return new SinglyLinkedList<E>();
		}
		if (eleccion2 ==2){
			return new DoubleLinkedList<E>();
		}
		
		else{
			return new CircularLinkedList<E>();
		}
		
		
		
	}
	return null;
	
	
	
}

	
}
