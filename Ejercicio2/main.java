import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        int opcion = 0;
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Registrar Prenda");
            System.out.println("2. Consultar Prenda");
            System.out.println("3. Modificar Prenda");
            System.out.println("4. Vender Prenda");
            System.out.println("5. Consultar Stock");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                   
                case 2:
                   
                    break;

                case 3:
                   
                    break;

                case 4:
         
                    break;

                case 5:
                  
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
 