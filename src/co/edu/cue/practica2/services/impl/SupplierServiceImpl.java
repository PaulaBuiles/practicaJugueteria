package co.edu.cue.practica2.services.impl;

import co.edu.cue.practica2.model.CompraProveedor;
import co.edu.cue.practica2.model.Juguete;
import co.edu.cue.practica2.model.Proveedor;
import co.edu.cue.practica2.services.Supplier;

import javax.swing.*;
import java.util.Objects;

public class SupplierServiceImpl implements Supplier {
    private Proveedor[] proveedor= new Proveedor[5];
    int contadorProveedor=0;
    private CompraProveedor[] compra= new CompraProveedor[5];
    int contadorCompras=0;

    @Override
    public Proveedor crearProveedor(String nombre, String codigo, String fechaIngreso, String qos, String material, double precio,String jugueteNuevo) {
        proveedor[contadorProveedor]= new Proveedor(nombre, codigo, fechaIngreso, qos, material, precio, jugueteNuevo);
        contadorProveedor++;
        return null;
    }

    @Override
    public Proveedor comprarAlProveedor(String nombreProveedor, String nombreJuguete, int cantidad, double precio, Juguete[] juguetes){
        for(int i = 0; i<proveedor.length; i++){
            if(proveedor[i]!=null){
                for(int j = 0; j<juguetes.length; j++){
                    if(juguetes[j]== null){
                        juguetes[j] = new Juguete(nombreJuguete,precio,cantidad,proveedor[i].getMaterial());
                     /*   break;*/
                    }else{
                        if(juguetes[i] !=null){
                            if(Objects.equals(juguetes[i].getNombre(), nombreJuguete)){
                                juguetes[i].setCantidad((juguetes[i].getCantidad())+cantidad);
                                juguetes[i].setPrecio(((juguetes[i].getPrecio())+precio)/2);
                                imprimirTotal(nombreProveedor,nombreJuguete,cantidad);
                                break;
                            }
                        }
                    }

                }
            }
        }

        return null;
    }
    @Override
    public Proveedor imprimirTotal(String nombreProveedor, String nombreJuguete, int cantidad) {
        for(int i=0;i<proveedor.length;i++){
            if(proveedor[i]!=null){
                JOptionPane.showMessageDialog(null,"Su compra se ha realizado con exito: \n"+
                        "Nombre del proveedor:"+proveedor[i].getNombre()+"\n " +
                        "Codigo del proveedor: "+proveedor[i].getCodigo()+"\n " +
                        "Tiempo de espera: "+proveedor[i].getQos()+"\n" +
                        "Material de los juguetes: "+proveedor[i].getMaterial()+"\n " +
                        "Precio de los juguetes "+proveedor[i].getPrecio()+"\n " +
                        "Cantidad de los juguetes: "+cantidad+"\n" +
                        "El total a pagar es: "+cantidad*proveedor[i].getPrecio());
            }
        }
        return null;
    }
}
