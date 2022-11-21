package defecto;

public class Ejecutable {
	public static void main(String args[]) {
		//Creamos un arreglo de largo 10
		int numeros[] = new int[10];
		//Inicializamos los elementos del arreglo
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i;
		}
		NumerosEnteros ne = new NumerosEnteros(numeros);
		//Imprimimos el arreglo
		ne.print();
		//Reemplazamos la primera aparicion de -1 por 1
		ne.reemplazarPrimera(-1, 1);
		//Establecemos un 5 en la posicion 0
		ne.establecerPos(0, 5);
		//Reemplazamos el elemento 3 por un 5
		ne.reemplazar(3, 5);
	}
}
