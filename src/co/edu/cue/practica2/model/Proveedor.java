package co.edu.cue.practica2.model;

public class Proveedor {

    String nombre;
    String codigo;
    String fechaIngreso;
    String qos;
    String jugueteNuevo;
    double precio;
    String material;

    public String getJugueteNuevo() {
        return jugueteNuevo;
    }

    public void setJugueteNuevo(String jugueteNuevo) {
        this.jugueteNuevo = jugueteNuevo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Proveedor(String nombre, String codigo, String fechaIngreso, String qos, String material, double precio,String jugueteNuevo) {
        this.nombre=nombre;
        this.codigo = codigo;
        this.fechaIngreso = fechaIngreso;
        this.qos = qos;
        this.precio = precio;
        this.material = material;
        this.jugueteNuevo= jugueteNuevo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getQos() {
        return qos;
    }

    public void setQos(String qos) {
        this.qos = qos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
