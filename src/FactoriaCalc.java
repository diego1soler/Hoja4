

public class FactoriaCalc {

public static <E> AbstractStack getTipo(int eleccion1,int eleccion2){
	
	//Aqui ocurre la magia
	switch(eleccion1){
	
	case 1:
	return new StackVector<E>();
	
	
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
