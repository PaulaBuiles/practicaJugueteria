package co.edu.cue.practica2.services;

import co.edu.cue.practica2.model.*;

public interface Sell  {
public abstract Venta comprar(Empleado[] empleados, Cliente[] clientes, Juguete[] juguetes, String nombreJuguete, String nombreCliente, String nombreVendedor,
                              int diasSolicitado, int unidadesPrestadas);
public abstract Venta imprimir(Venta venta);
}
