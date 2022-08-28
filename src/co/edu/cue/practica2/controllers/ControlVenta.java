package co.edu.cue.practica2.controllers;

import co.edu.cue.practica2.services.impl.ToyServiceImpl;
import co.edu.cue.practica2.services.impl.SellServiceImpl;
import co.edu.cue.practica2.services.impl.UsuarioServiceImpl;

import javax.swing.*;

public class ControlVenta {
    SellServiceImpl sellServiceImpl = new SellServiceImpl();
    public SellServiceImpl getSellServiceImpl(){return sellServiceImpl;}

    public void realizarCompra(UsuarioServiceImpl controlUserService, UsuarioServiceImpl usuarioService, ToyServiceImpl service) {
        String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
        String nombreVendedor = JOptionPane.showInputDialog("Ingrese el nombre del empleado");
        int canti = Integer.parseInt(JOptionPane.showInputDialog("Cuantos juguetes va a comprar"));
        int diasSolicitado = Integer.parseInt(JOptionPane.showInputDialog("ingrese el dia de compra"));
        int unidadesPrestadas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas unidades de este juguete desea comprar"));
        String nombreJuguete = JOptionPane.showInputDialog("Ingrese el juguete para verificar existencia");
        sellServiceImpl.comprar(controlUserService.getEmpleados(), usuarioService.getCliente(), service.getToys(), nombreJuguete, nombreCliente, nombreVendedor, diasSolicitado, unidadesPrestadas);

        /*service.modificarExistencia(-unidadesPrestadas, nombreJuguete);*/
    }
}
