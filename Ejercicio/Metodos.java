package Ejercicio;

import java.util.Stack;

public class Metodos {
    private Stack<Repuesto> pila = new Stack<>();

    public void ingresarRepuesto(String marca, String referencia, int cantidad, double precio) {
        pila.push(new Repuesto(marca, referencia, cantidad, precio));
        System.out.println("Repuesto ingresado correctamente.");
    }

    public void buscarRepuesto(String referencia) {
        for (Repuesto r : pila) {
            if (r.getReferencia().equals(referencia)) {
                System.out.println("Repuesto encontrado: " + r);
                return;
            }
        }
        System.out.println("Repuesto no encontrado.");
    }

    public void modificarRepuesto(String referencia, int nuevaCantidad, double nuevoPrecio) {
        Stack<Repuesto> temp = new Stack<>();
        boolean encontrado = false;

        while (!pila.isEmpty()) {
            Repuesto r = pila.pop();
            if (r.getReferencia().equals(referencia)) {
                r.setCantidad(nuevaCantidad);
                r.setPrecio(nuevoPrecio);
                encontrado = true;
            }
            temp.push(r);
        }

        while (!temp.isEmpty()) {
            pila.push(temp.pop());
        }

        if (encontrado) {
            System.out.println("Repuesto modificado correctamente.");
        } else {
            System.out.println("Repuesto no encontrado.");
        }
    }

    public void eliminarRepuesto(String referencia) {
        Stack<Repuesto> temp = new Stack<>();
        boolean eliminado = false;
    
        while (!pila.isEmpty()) {
            Repuesto r = pila.pop();
            if (r.getReferencia().equals(referencia)) {
                System.out.println("Repuesto eliminado: " + r);
                eliminado = true;
                break; 
            }
            temp.push(r);
        }
        while (!temp.isEmpty()) {
            pila.push(temp.pop());
        }
    
        if (!eliminado) {
            System.out.println("Repuesto no encontrado.");
        }
    }

    public void venderRepuesto(String referencia) {
        Stack<Repuesto> aux = new Stack<>();
        boolean vendido = false;

        while (!pila.isEmpty()) {
            Repuesto r = pila.pop();
            if (r.getReferencia().equals(referencia)) {
                if (r.getCantidad() > 0) {
                    r.setCantidad(r.getCantidad() - 1);
                    vendido = true;
                } else {
                    System.out.println("No hay stock disponible.");
                }
            }
            aux.push(r);
        }

        while (!aux.isEmpty()) {
            pila.push(aux.pop());
        }

        if (vendido) {
            System.out.println("Repuesto vendido correctamente.");
        } else {
            System.out.println("Repuesto no encontrado.");
        }
    }
}
