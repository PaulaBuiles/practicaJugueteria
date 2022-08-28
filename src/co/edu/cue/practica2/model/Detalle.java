package co.edu.cue.practica2.model;

public class Detalle {
    private int cantidad;
     private Juguete juguete;
     private  double precio;
     private int diasSolicitados;
     private double subtotal =0;

     public double getPrecio() {
          return precio;
     }

     public void setPrecio(double precio) {
          this.precio = precio;
     }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public Detalle(int cantidad, Juguete juguete,double subtotal, int diasSolicitados) {
          this.cantidad = cantidad;
          this.juguete = juguete;
          this.subtotal = juguete.getPrecio()*(cantidad);
          this.diasSolicitados = diasSolicitados;
     }

     public Juguete getJuguete() {
          return juguete;
     }

     public void setJuguete(Juguete juguete) {
          this.juguete = juguete;
     }

     public int getCantidad() {
          return cantidad;
     }

     public void setCantidad(int cantidad) {
          this.cantidad = cantidad;
     }



     public int getDiasSolicitados() {
          return diasSolicitados;
     }

     public void setDiasSolicitados(int diasSolicitados) {
          this.diasSolicitados = diasSolicitados;
     }

}
