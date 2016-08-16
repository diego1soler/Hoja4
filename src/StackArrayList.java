import java.util.ArrayList;
import java.util.Iterator;

public class StackArrayList<E> extends AbstractStack implements I_Pila<E> {
	   
		private ArrayList<E> pila;
	    
	    public StackArrayList(){
	        pila = new ArrayList<>();
	        count = 0;
	    }
	    /**
	     *
	     * @param e elemento tipo E
	     */
	    @Override
	    public void Push(E e){
	        pila.add(e); //Agrega en ultima posicion e incrementa size en 1
	        count++;
	    }
	   
		@Override
		public E Pop() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public boolean IsEmpty() {
			
			return false;
		}
		@Override
		public int Size() {
			// TODO Auto-generated method stub
			return 0;
		}
		@Override
		public E Get() {
			
			return null;
		}
		@Override
		public void empty() {
			// TODO Auto-generated method stub
			
		}
	}


