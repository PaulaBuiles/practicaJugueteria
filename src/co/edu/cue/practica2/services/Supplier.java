package co.edu.cue.practica2.services;

import co.edu.cue.practica2.model.Juguete;
import co.edu.cue.practica2.model.Proveedor;

public interface Supplier {
    /*public abstract Proveedor realizarCompra(Juguete[] juguetes);
    public abstract Proveedor GuardarRegistro(String codigo, String fechaINgreso,String qos, String material);
    public abstract Proveedor agregarNuevo(Juguete[] juguetes,String nombreJuguete,int j);*/

   public abstract Proveedor crearProveedor(String nombre, String codigo, String fechaIngreso, String qos, String material, double precio, String jugueteNuevo);

    /*public abstract Proveedor imprimirProveedor(String nombreProveedor, String nombreJuguete);*/

    public abstract Proveedor comprarAlProveedor(String nombreProveedor, String nombreJuguete, int cantidad, double precio, Juguete[] juguetes);

    public abstract Proveedor imprimirTotal(String nombreProveedor, String nombreJuguete, int cantidad);
}
