import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
/**
 * @author Diego Soler, Fredy Espana
 * Clase Calculadora
 * Clase que maneja la calculadora
 * @version 15/08/2016
 */


public class Calculadora implements I_Calculadora {
	
	//Atributos
	StackVector<Integer> miPila;
	
	
	//Constructor
	public Calculadora(){
		miPila= new StackVector<Integer>();
	}
	
	
	    @Override
		public int CalcularLista(String direccion, AbstractStack<Integer> list) {
			int resultado = 0;
					
					String [] cadena = direccion.split(" "); //Se convierte la operacion en un array de caracteres, exceptuando el espacio entre operadores
					for (int x = 0; x<cadena.length; x++){
						
						try{
							list.addFirst(Integer.parseInt(cadena[x])); //Se va agregando al stack si el caracter es un numero
						}
						
						catch(Exception e){ 
							
							switch(cadena[x]) {
							
							//Si no es un numero, es un operador, y se realiza la operacion correspondiente
						
							case "+":
								resultado = (int)list.getFirst() + (int)list.getFirst();
								list.addFirst(resultado); //Se almacena el resultado en la pila
								break;
								
							case "*":
								resultado = (int)list.getFirst() * (int)list.getFirst();
								list.addFirst(resultado);
								break;
								
							case "/":
								resultado = (int)list.getFirst() / (int)list.getFirst();
								list.addFirst(resultado);
								break;
							   }
				             }	
					      }
					
						return resultado; //Retorna el resultado de la operacion del archivo de texto
				       }
	
	
	/**
	*Calcula la operacion POST FIX
	*@param String: vector
	*/
	@Override
	public int CalcularVector(String direccion,StackVector<Integer> vector) {
		
		int resultado = 0;
		
		String [] cadena = direccion.split(" "); //Se convierte la operacion en un array de caracteres, exceptuando el espacio entre operadores
		for (int x = 0; x<cadena.length; x++){
			
			try{
				vector.Push(Integer.parseInt(cadena[x])); //Se va agregando al stack si el caracter es un numero
			}
			
			catch(Exception e){ 
				
				switch(cadena[x]) {
				
				//Si no es un numero, es un operador, y se realiza la operacion correspondiente
			
				case "+":
					resultado = (int)vector.Pop() + (int)vector.Pop();
					vector.Push(resultado); //Se almacena el resultado en la pila
					break;
					
				case "*":
					resultado = (int)vector.Pop() * (int)vector.Pop();
					vector.Push(resultado);
					break;
					
				case "/":
					resultado = (int)vector.Pop() / (int)vector.Pop();
					vector.Push(resultado);
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
		      System.err.println("El archivo est� vac�o. No hay ninguna instrucci�n"); //Error por si esta vacio el archivo
		     
		   }
		
		
		return linea;
	}

	
}