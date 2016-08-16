import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
/**
 * @author Diego Soler, Gladys de la Roca, Rene Olivet
 * Clase Calculadora
 * Clase que maneja la calculadora
 * @version 24/07/2016
 */


public class Calculadora implements I_Calculadora {
	
	//Atributos
	
	
	
	//Constructor
	public Calculadora(){
		miPila= new Pila<Integer>();
	}
	
	/**
	*Calcula la operacion POST FIX
	*@param String: vector
	*/
	@Override
	public int CalcularVector(String vector) {
		
		int resultado = 0;
		
		String [] cadena = vector.split(" "); //Se convierte la operacion en un array de caracteres, exceptuando el espacio entre operadores
		for (int x = 0; x<cadena.length; x++){
			
			try{
				miPila.Push(Integer.parseInt(cadena[x])); //Se va agregando al stack si el caracter es un numero
			}
			
			catch(Exception e){ 
				
				switch(cadena[x]) {
				
				//Si no es un numero, es un operador, y se realiza la operacion correspondiente
			
				case "+":
					resultado = (int)miPila.Pop() + (int)miPila.Pop();
					miPila.Push(resultado); //Se almacena el resultado en la pila
					break;
					
				case "*":
					resultado = (int)miPila.Pop() * (int)miPila.Pop();
					miPila.Push(resultado);
					break;
					
				case "/":
					resultado = (int)miPila.Pop() / (int)miPila.Pop();
					miPila.Push(resultado);
					break;
				   }
	             }	
		      }
		
			return resultado; //Retorna el resultado de la operacion del archivo de texto
	       }

	/**
	*Lee la operacion POST FIX desde un archivo de texto
	*@param String: direccion
	*/
	@Override
	public String LeerArchivo(String direccion){
		
		//Variables necesarias para leer el archivo, utilizando paquetes File,FileReader y BufferedReader
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		String linea = "";
		
		try {
		archivo = new File (direccion); //Se carga el archivo
		fr = new FileReader (archivo);
		br = new BufferedReader(fr);

		
		linea = br.readLine(); //Se guarda la linea con la operacion en una variable
			
		
			
		
				}//FIN DEL TRY
		
		   catch(Exception e){
		      System.err.println("El archivo está vacío. No hay ninguna instrucción"); //Error por si esta vacio el archivo
		     
		   }
		
		
		return linea;
	}

	@Override
	public int CalcularLista(String vector) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}