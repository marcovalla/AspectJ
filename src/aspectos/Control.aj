package aspectos;
import defecto.NumerosEnteros;

public aspect Control {
		
	//Reemplazando un numero por el mismo
	before(int num1, int num2):
		call (void NumerosEnteros.reemplazarPrimera(int, int)) && args(num1, num2) {
			assert (num1 != num2) : "Aspecto: Los numeros a reemplazar son iguales";
	}
	
	//Insertar un elemento en una posicion
	void around(NumerosEnteros ne, int num, int pos):
		call (void NumerosEnteros.establecerPos(int, int)) && args(num, pos) && target(ne) {
			if (pos < ne.longitud()) {
				proceed(ne, num, pos);
				System.out.println("Aspecto: La posicion es valida");
			}
			else {
				System.out.println("Aspecto: La posicion no es valida");
			}
	}
	
	//Reemplazar un elemento por otro
	before(NumerosEnteros ne, int num1, int num2):
		call (void NumerosEnteros.reemplazar(int, int)) && args(num1, num2) && target(ne) {
			assert (ne.existe(num1)) : "Aspecto: El elemento a reemplazar no existe";
	}
	
	//Se imprime el arreglo por consola
	after(): 
		call(* *.print()) {
			System.out.println("Aspecto: El arreglo fue impreso por consola");
	}
}
