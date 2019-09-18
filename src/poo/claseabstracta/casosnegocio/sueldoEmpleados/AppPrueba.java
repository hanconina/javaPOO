package poo.claseabstracta.casosnegocio.sueldoEmpleados;


public class AppPrueba {
    public static void main(String[] args) {
        GestionarEmpleado gestor = new GestionarEmpleado();
        gestor.IngresarEmpleado();
        gestor.IngresarEmpleado();
        System.out.println("Sueldo Maximo: "+gestor.getSueldoMax().toString());
        System.out.println("Sueldo minimo: "+gestor.getSueldoMin().toString());
        gestor.mostrarElectronicoAntiguo();
    }
    
}
