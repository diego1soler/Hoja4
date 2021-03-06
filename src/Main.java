import java.util.Scanner;

/**
 * @author Diego Soler, Fredy Espana
 * Clase Main
 * @version 15/08/2016
 */

public class Main {
	public static  <E> void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int opcion = 0;
		int opcion2 = 0;
		//Mensaje de bienvenida y se muestra el resultado de la operacion
		System.out.println("Bienvenido invocador a la calculadora POST-FIX.\nUsted habr� llenado el respectivo archivo con las operaciones.");
		Calculadora Calculadora = new Calculadora();
		String cadena = Calculadora.LeerArchivo("datos.txt");
		System.out.println("Por favor selecciona el stack que desea: \n1.Vector\n2.ArrayList\n3.Listas\nIngrese opci�n: ");
		opcion = teclado.nextInt();
		
		if(opcion==1){
			StackVector V = FactoriaCalc.getVector();
			System.out.println("El resultado de tu operaci�n es: "+Calculadora.CalcularVector(cadena,V));
			System.exit(1);
	
		}
		
		if(opcion==3){
			System.out.println("Por favor selecciona el tipo de lista que desea: \n1.SinglyLinkedList\n2.DoubleLinkedList\n3.CircularLinkedList\nIngrese opci�n: ");	
			opcion2=teclado.nextInt();
		}
		
		AbstractStack L = FactoriaCalc.getLista(opcion, opcion2);
		System.out.println("El resultado de tu operaci�n es: "+Calculadora.CalcularLista(cadena, L));
		                      
		
		
	}
}
