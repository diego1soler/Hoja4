import java.util.Vector;

/**
 * @author Diego Soler, Fredy Espa�a
 * Clase Pila
 * Clase que maneja la pila
 * @version 24/07/2016
 * @param <E>
 */


public class StackVector<E> extends AbstractVector implements I_Pila<E> {
	
	//Atributos
	private Vector<E> miPila;

	//Constructor
	public StackVector(){
		miPila = new Vector<E>();
	}
	
	/**
	*Agrega un elemento al stack
	*@param E: element
	*/
	@Override
	public void Push(E element) {
		miPila.addElement(element);
	}

	/**
	*Remueve el ultimo elemento del stack
	*@return E 
	*/
	@Override
	public E Pop() {
		E x=(E) miPila.lastElement();
		miPila.remove(miPila.lastElement());
		return x;
	}

	/**
	*Verifica que la lista este vacia
	*@return boolean
	*/
	@Override
	public boolean IsEmpty() {
		if (miPila.size()==0)
		return true;
		else
			return false;
	}

	/**
	*Retorna el tamano de la pila
	*@return int
	*/
	@Override
	public int Size() {
		return miPila.size();
	}

	/**
	*Obtiene un elemento del stack
	*@return E
	*/
	@Override
	public E Get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void empty() {
		// TODO Auto-generated method stub
		
	}
}
	