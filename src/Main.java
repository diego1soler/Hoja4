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
		//Mensaje de bienvenida y se muestra el resultado de la operacion
		System.out.println("Bienvenido invocador a la calculadora POST-FIX.\nUsted habrá llenado el respectivo archivo con las operaciones.");
		Calculadora Calculadora = new Calculadora();
		String cadena = Calculadora.LeerArchivo("datos.txt");
		System.out.println("Por favor selecciona el stack que desea: \n1.Vector\n2.ArrayList.\n3.Listas.\nIngrese opción: ");
		opcion = teclado.nextInt();
		
		switch(opcion){
		
		case 1:
		I_Pila<E> P = FactoriaCalc.getPila();
		System.out.println("La calculadora ha hecho magia. El resultado es: "+ Calculadora.CalcularVector(cadena));
		break;
		
		case 2:
		I_Lista<E> L = FactoriaCalc.getList();
		break;
		case 3:
		}
		
		
		
	}
}
