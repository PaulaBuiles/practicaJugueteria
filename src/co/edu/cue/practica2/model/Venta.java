package co.edu.cue.practica2.model;

public class Venta {

   private Detalle detalle;
   private Cliente cliente;
   private Empleado empleado;


   public Detalle getDetalle() {
      return detalle;
   }

   public void setDetalle(Detalle detalle) {
      this.detalle = detalle;
   }

   public Cliente getCliente() {
      return cliente;
   }

   public void setCliente(Cliente cliente) {
      this.cliente = cliente;
   }

   public Empleado getEmpleado() {
      return empleado;
   }

   public void setEmpleado(Empleado empleado) {
      this.empleado = empleado;
   }


   public Venta(Detalle detalle, Cliente cliente, Empleado empleado) {
      this.detalle = detalle;
      this.cliente = cliente;
      this.empleado = empleado;
   }
}
