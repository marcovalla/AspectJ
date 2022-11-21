package defecto;

public class NumerosEnteros {
    public int [] s;
    //constructor
    public NumerosEnteros(int[] numeros) {
        s=new int[numeros.length];
        for (int i=0; i<numeros.length; i++) {
            s[i]=numeros[i];
        }
    }
    //comandos
    public void intercambiar(int p1, int p2) {
        int aux=s[p1];
        s[p1]=s[p2];
        s[p2]=aux;
    }
    public void reemplazar(int v1, int v2) {
        for (int i=0; i<s.length;i++) {
            if (s[i]==v1) {
                s[i]=v2;
            }
        }
    }
    public void reemplazarPrimera(int v1, int v2) {
        boolean encontro=false;
        int i=0;
        while (i<s.length && !encontro) {
            if (s[i]==v1) {
                s[i]=v2;
                encontro=true;
            }
            i++;
        }
    }
    public void reemplazarUltima(int v1, int v2) {
        int posicion=-1;;
        int i=0;
        while (i<s.length) {
            if (s[i]==v1) {
                posicion=i;
            }
            i++;
        }
        if (posicion!=-1) {
            s[posicion]=v2;
        }
        else {System.out.println("No encontrado");}
    }

    public void establecerPos(int p,int n) {
        s[p]=n;
    }

    public int enteroPos(int p) {
        return s[p];
    }

    public int longitud() {
        return s.length;
    }

    public int[] obtenerArreglo() {
        return s;
    }
    
    public boolean existe(int num) {
    	boolean existe = false;
    	for (int i = 0; i < s.length && !existe; i++) {
    		if (s[i] == num) {
    			existe = true;
    		}
    	}
    	return existe;
    }
    
    public void print() {
    	System.out.print("Arreglo: ");
    	for (int i = 0; i < s.length; i++) {
    		System.out.print(s[i]+" ");
    	}
    	System.out.println();
    }
}
