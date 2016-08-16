import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Olivet
 */
public class Main {
	public static  <E> void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int opcion = 0;
		int opcion2 = 0;
		//Mensaje de bienvenida y se muestra el resultado de la operacion
		System.out.println("Bienvenido invocador a la calculadora POST-FIX.\nUsted habrá llenado el respectivo archivo con las operaciones.");
		Calculadora Calculadora = new Calculadora();
		String cadena = Calculadora.LeerArchivo("datos.txt");
		System.out.println("Por favor selecciona el stack que desea: \n1.Vector\n2.ArrayList\n3.Listas\nIngrese opción: ");
		opcion = teclado.nextInt();
		
		if(opcion==1){
			StackVector V = FactoriaCalc.getVector();
			System.out.println("El resultado de tu operación es: "+Calculadora.CalcularVector(cadena,V));
	
		}
		
		if(opcion==3){
			System.out.println("Por favor selecciona el tipo de lista que desea: \n1.SinglyLinkedList\n2.DoubleLinkedList\n3.CircularLinkedList\nIngrese opción: ");	
			opcion2=teclado.nextInt();
		}
		
		AbstractStack L = FactoriaCalc.getLista(opcion, opcion2);
		                      
		
		
	}
}
