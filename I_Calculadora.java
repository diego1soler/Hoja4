
/**
 * @author Diego Soler, Fredy Espana
 * Clase I_Calculadora
 * @version 15/08/2016
 */

public interface I_Calculadora {

	//Metodos de la interfaz
	public String toString();
	public String LeerArchivo (String direccion);
	public int CalcularVector(String cadena,StackVector<Integer> vector);
	public int CalcularLista(String direccion, AbstractStack<Integer> list);
	
}
 