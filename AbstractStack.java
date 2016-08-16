/**
 * @author Diego Soler, Fredy Espana
 * Clase AbstractStack
 * @version 15/08/2016
 */

public abstract class AbstractStack<E>  implements I_Lista<E> {
    protected int count;
    
    public int size(){
        return count;
    }
    
    public boolean isEmpty(){
        return count == 0; //Aqui se retorna true si esta vacia y false si no
    }
}