package co.edu.cue.practica2.services.impl;

import co.edu.cue.practica2.model.Empleado;
import co.edu.cue.practica2.model.Cliente;
import co.edu.cue.practica2.model.Venta;
import co.edu.cue.practica2.services.Usuario;

import javax.swing.*;

public class UsuarioServiceImpl implements Usuario {
    private Empleado[] empleados = new Empleado[5];
    int contadorEmpleado = 0;
    private Cliente[] cliente = new Cliente[2];
    int contadorCliente = 0;

    //Aqui

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public Cliente[] getCliente() {
        return cliente;
    }

    public void setCliente(Cliente[] cliente) {
        this.cliente = cliente;
    }

    public UsuarioServiceImpl(Empleado[] empleados, int contadorEmpleado, Cliente[] cliente, int contadorCliente) {
        this.empleados = empleados;
        this.contadorEmpleado = contadorEmpleado;
        this.cliente = cliente;
        this.contadorCliente = contadorCliente;
    }

    public UsuarioServiceImpl() {

    }

    public void prueba1(){
        Empleado empleado= new Empleado("laura","334","3444","dddd","2","23333");
        empleados[0] =empleado;
        Cliente cliente1 = new Cliente("laura","34673","33","hdjd","3","djje");
        cliente[0]=cliente1;
    }

    @Override
    public  Cliente crearCliente(String nombre, String cedula, String telefono, String direccion, String cumpleaños, String email){
         cliente[contadorCliente]=new Cliente(nombre,cedula,telefono,direccion,cumpleaños,email);
         contadorCliente++;
         return null;

    }
    @Override
    public Empleado crearEmpleado(String nombre, String cedula, String telefono, String direccion, String experiencia, String salario){
       empleados[contadorEmpleado]=new Empleado(nombre, cedula, telefono, direccion, experiencia, salario);
       contadorEmpleado++;
       return null;
    }
    public void clienteConMasCompras(Venta[] ventas) {
        int contador = 0;
        int contCliente=0;
        String usuario = "";
        for (Cliente client : cliente) {
            for (Venta venta : ventas) {
                //System.out.println(venta.getCliente());
                if(String.valueOf(client) != "null"){
                    if(String.valueOf(venta) !="null"){
                        if (venta.getCliente().getNombre()==client.getNombre()) {
                            if (client.getNombre() == venta.getCliente().getNombre()) {
                                contador++;
                            }
                        }
                    }
                }
                if (contCliente < contadorEmpleado) {
                    contCliente = contadorEmpleado;
                    usuario=client.getNombre();
                }
                contCliente=0;
            }
        }
        JOptionPane.showMessageDialog(null, "El cliente con mas compras es: " + usuario);
    }
    public void mejorVendedor(Venta[] ventas) {
        int contadorEmpleado = 0;
        int contadorMejorEmpleado =0;
        String employer = "";
        for (Empleado empleado : empleados) {
            for (Venta venta : ventas) {
                if (String.valueOf(employer) != "null") {
                    if (String.valueOf(venta) != "null") {
                        if (empleado.getNombre() == venta.getEmpleado().getNombre()) {
                            contadorEmpleado++;

                        }
                    }

                }
            }
            if (contadorMejorEmpleado < contadorEmpleado) {
                contadorMejorEmpleado = contadorEmpleado;
                employer=empleado.getNombre();
            }
            contadorEmpleado=0;
        }
        JOptionPane.showMessageDialog(null, "El mejor empleado  es: " + employer);
    }


}
