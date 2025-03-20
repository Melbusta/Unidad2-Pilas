import java.util.Stack;

public class Metodos {
    private Stack<Prenda> pila = new Stack<>();

    public void registrarPrenda(String marca, String referencia, double precio, int cantidad) {
        
        Stack<Prenda> aux = new Stack<>();
        boolean existe = false;

        while (!pila.isEmpty()) {
            Prenda p = pila.pop();
            if (p.getReferencia().equalsIgnoreCase(referencia)) {
                p.setCantidad(p.getCantidad() + cantidad);
                existe = true;
            }
            aux.push(p);
        }

        if (!existe) {
            Prenda nueva = new Prenda(marca, referencia, cantidad, precio);
            aux.push(nueva);
        }

        while (!aux.isEmpty()) {
            pila.push(aux.pop());
        } 

        System.out.println("Registro completado.");
    }
}