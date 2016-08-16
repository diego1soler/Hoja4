/**
 * @author Diego Soler, Fredy Espana
 * Clase I_Pila
 * @version 15/08/2016
 */


public interface I_Pila <E> {

	//Metodos de la interfaz
	public void Push (E element);
	public E Pop();
	public boolean IsEmpty();
	public int Size();
	public E Get();
	public void empty();

	
	
}
