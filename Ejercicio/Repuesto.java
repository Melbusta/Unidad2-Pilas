package Ejercicio;

public class Repuesto {
    private String marca;
    private String referencia;
    private int cantidad;
    private double precio;

    public Repuesto(String marca, String referencia, int cantidad, double precio) {
        this.marca = marca;
        this.referencia = referencia;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    @Override
public String toString() {
    return "Marca: " + marca + ", Referencia: " + referencia + ", Cantidad: " + cantidad + ", Precio: $" + precio;
}

}
