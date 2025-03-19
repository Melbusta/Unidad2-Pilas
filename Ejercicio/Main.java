package Ejercicio;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        int opcion = 0;
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Ingresar Repuesto");
            System.out.println("2. Buscar Repuesto");
            System.out.println("3. Modificar Repuesto");
            System.out.println("4. Eliminar Repuesto");
            System.out.println("5. Vender Repuesto");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la marca: ");
                    String marca = sc.nextLine();
                    System.out.print("Ingrese la referencia: ");
                    String referencia = sc.nextLine();
                    System.out.print("Ingrese la cantidad: ");
                    int cantidad = sc.nextInt();
                    System.out.print("Ingrese el precio: ");
                    double precio = sc.nextDouble();
                    sc.nextLine();

                    m.ingresarRepuesto(marca, referencia, cantidad, precio);
                    break;

                case 2:
                    System.out.print("Ingrese la referencia del repuesto: ");
                    referencia = sc.nextLine();
                    m.buscarRepuesto(referencia);
                    break;

                case 3:
                    System.out.print("Ingrese la referencia del repuesto a modificar: ");
                    referencia = sc.nextLine();
                    System.out.print("Ingrese la nueva cantidad: ");
                    cantidad = sc.nextInt();
                    System.out.print("Ingrese el nuevo precio: ");
                    precio = sc.nextDouble();
                    sc.nextLine();

                    m.modificarRepuesto(referencia, cantidad, precio);
                    break;

                case 4:
                String refEliminar = sc.next();
                System.out.print("Ingrese la referencia del repuesto a eliminar: ");
                    m.eliminarRepuesto(refEliminar);
                    break;

                case 5:
                    System.out.print("Ingrese la referencia del repuesto a vender: ");
                    referencia = sc.nextLine();
                    m.venderRepuesto(referencia);
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}