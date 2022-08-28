package co.edu.cue.practica2.services.impl;

import co.edu.cue.practica2.model.*;
import co.edu.cue.practica2.services.Sell;

import javax.swing.*;
import java.util.Objects;

public class SellServiceImpl implements Sell {
    public Venta[] ventas = new Venta[10];
    public Detalle[] detalle = new Detalle[4];

    int contadorVenta = 0;

    public SellServiceImpl(Detalle[] detalle, int contadorVenta) {
        this.detalle = detalle;
        this.contadorVenta = contadorVenta;
    }

    public SellServiceImpl() {

    }

    public Venta comprar( Empleado[] empleados, Cliente[] clientes, Juguete[] juguetes, String nombreJuguete, String nombreCliente, String nombreVendedor,
                         int diasSolicitado, int unidadesPrestadas) {
        Venta venta= null;
        for (Empleado empleado : empleados) {
            if(String.valueOf(empleado)!=null){
            if (nombreVendedor.equals(empleado.getNombre())) {
                for (Cliente cliente : clientes) {
                    if(String.valueOf(cliente)!=null){
                    if (nombreCliente.equals(cliente.getNombre())) {
                        for (Juguete juguete : juguetes) {
                            /*if(String.valueOf(juguete)!=null){*/
                            if (String.valueOf(juguete)!= "null"&& nombreJuguete != "null" && juguete.getNombre().equals(nombreJuguete)) {
                                Detalle detalle1 = new Detalle(unidadesPrestadas, juguete, juguete.getPrecio(), diasSolicitado);
                                venta = new Venta(detalle1, cliente, empleado);
                                /*detalle[contadorVenta] = detalle1;
                                ventas[contadorVenta] = venta;*/
                                /*service.modificarExistencia(-cantidad,toy.getNombre());*/
                                System.out.println();
                                imprimir(venta);
                                break;
                            }
                            }
                        }
                    }
                }
         break;   }}
        }

        return null;
    }

        public Venta imprimir(Venta venta){
            if(String.valueOf(venta.getDetalle())!="null"){
               double precio =0;
               int subTotal = (int) (((Math.random()*((50 - 1)+1))+1));
               double valorTotal= 0;
               precio+= venta.getDetalle().getSubtotal();
               valorTotal+=precio-subTotal;
                JOptionPane.showMessageDialog(null,"El nombre del cliente es: "+
                        venta.getCliente().getNombre()+"\n El nombre del empleado es: "+
                        venta.getEmpleado().getNombre()+"\n El juguete que se compró es: "+
                        venta.getDetalle().getJuguete().getNombre() +"\n Cantidad del juguete: "+
                        venta.getDetalle().getCantidad()+"\n El valor de la compra es: "+
                        precio+"\n Tienes un descuento de $"+subTotal+" en tu compra "+
                        "\n El valor total a pagar es: "+valorTotal);
                    if("Plastico".equals(venta.getDetalle().getJuguete().getMaterial())){
                        JOptionPane.showMessageDialog(null, "Los juguetes de plastico no requieren cuidados especiales");
                    }
                    if ("Tela".equals(venta.getDetalle().getJuguete().getMaterial())) {
                        JOptionPane.showMessageDialog(null, "Los juguetes de tela no deben ser mojados");
                    }
                    if ("Electronico".equals(ventas[contadorVenta].getDetalle().getJuguete().getMaterial())) {
                        JOptionPane.showMessageDialog(null, "Los juguetes electronicos no deben ser mojados y requieren baterias");
                    }
                }

            return null;
        }

}