
import java.util.Scanner;
import java.util.Stack;

public class ObjPunto1 {
    private int[][] matriz;
    private int dimension;

    public ObjPunto1() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la dimension de la matriz: ");
        this.dimension = sc.nextInt();
        this.matriz = new int[this.dimension][this.dimension];
        System.out.println("Ingrese los elementos de la matriz: ");
        for (int i = 0; i < this.dimension; i++) {
            for (int j = 0; j < this.dimension; j++) {
                this.matriz[i][j] = sc.nextInt();
            }
        }
    }

    public void SumarFilasPila() {
        Stack<Integer> pila = new Stack<Integer>();
        System.out.println("Suma de filas: ");

        int suma = 0;
        for (int i = 0; i < this.dimension; i++) {
            for (int j = 0; j < this.dimension; j++) {
                suma += this.matriz[i][j];
            }
            pila.push(suma);
        }

        while (!pila.isEmpty()) {
            System.out.println("Fila: " + pila.pop());
        }
    }

    public void SumarColumnasPila() {
        int[] cola = new int[this.dimension];
        int frente = 0, fin = 0, suma = 0;

        for (int i = 0; i < this.dimension; i++) {
            for (int j = 0; j < this.dimension; j++) {
                suma += this.matriz[i][j];
            }
            cola[fin++] = suma;
        }

        while (frente < fin) {
            System.out.println("Columna: " + cola[frente++]);
        }
    }

    public int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public void OrdenarCola() {
        int totalElementos = this.dimension * this.dimension;
        int[] cola = new int[totalElementos];
        int fin = 0;

        for (int i = 0; i < this.dimension; i++) {
            for (int j = 0; j < this.dimension; j++) {
                cola[fin++] = this.matriz[i][j];
            }
        }

        for (int i = 0; i < totalElementos - 1; i++) {
            for (int j = i + 1; j < totalElementos; j++) {
                if (cola[i] > cola[j]) {
                    int aux = cola[i];
                    cola[i] = cola[j];
                    cola[j] = aux;
                }
            }
        }

        System.out.println("Números ordenados de mayor a menor en la cola: ");

        for (int i = 0; i < totalElementos; i++) {
            System.out.println(cola[i]);
        }
    }
}
