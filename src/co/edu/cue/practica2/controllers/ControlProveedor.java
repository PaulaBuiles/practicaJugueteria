package co.edu.cue.practica2.controllers;

import co.edu.cue.practica2.model.Juguete;
import co.edu.cue.practica2.model.Proveedor;
import co.edu.cue.practica2.services.impl.SupplierServiceImpl;
import co.edu.cue.practica2.services.impl.ToyServiceImpl;

import javax.swing.*;

public class ControlProveedor {
    SupplierServiceImpl service = new SupplierServiceImpl();
    public void crearProveedors(){
        String nombre= JOptionPane.showInputDialog("Ingrese el nombre del proveedor");
        String codigo=JOptionPane.showInputDialog("Ingrese el codigo del proveedor");
        String fechaIngreso=JOptionPane.showInputDialog("Fecha de ingreso");
        String qos= JOptionPane.showInputDialog("Ingrese la promesa de tiempo de entrega");
        String jugueteNuevo=JOptionPane.showInputDialog("Ingrese el juguete que va a proveer");
        String material= JOptionPane.showInputDialog("Ingrese el material de los jugetes");
        double precio= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del jugete"));
        service.crearProveedor(nombre,codigo,fechaIngreso,qos,material,precio, jugueteNuevo);
    }


    public void comprarAlProveedors(ToyServiceImpl toyService) {
        String nombreProveedor= JOptionPane.showInputDialog("Ingrese el nombre del proveedor");
        String nombreJuguete=JOptionPane.showInputDialog("Ingrese el nombre del juguete que va a comprar");
        /*service.imprimirProveedor(nombreProveedor, nombreJuguete);*/
        int cantidad= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a comprar"));
        double precio= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del jugete"));
        service.comprarAlProveedor(nombreProveedor,nombreJuguete,cantidad,precio,toyService.getToys());
        service.imprimirTotal(nombreProveedor,nombreJuguete,cantidad);
    }
}
