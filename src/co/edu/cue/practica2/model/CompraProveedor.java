package co.edu.cue.practica2.model;

public class CompraProveedor {
    String nombre;
    String nombreJuguete;
    int cantidad;
    double precio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreJuguete() {
        return nombreJuguete;
    }

    public void setNombreJuguete(String nombreJuguete) {
        this.nombreJuguete = nombreJuguete;
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

    public CompraProveedor(String nombre, String nombreJuguete, int cantidad, double precio) {
        this.nombre = nombre;
        this.nombreJuguete = nombreJuguete;
        this.cantidad = cantidad;
        this.precio = precio;
    }
}
