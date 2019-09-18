package poo.claseabstracta.casosnegocio.sueldoEmpleados;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class GestionarEmpleado {

    protected LinkedList<Empleado> lista;

    public GestionarEmpleado() {
        this.lista = new LinkedList<Empleado>();
    }

    public void IngresarEmpleado() {
        Empleado empleado = null;
        String tipo = JOptionPane.showInputDialog("Ingrese el Tipo: ");
        String nombre = JOptionPane.showInputDialog("Nombre: ");
        String direccion = JOptionPane.showInputDialog("Direccion: ");
        double sueldoBasico = Double.valueOf(JOptionPane.showInputDialog("Suedo Basico: "));
        if (tipo.equals("p")) {
            String especialidad = JOptionPane.showInputDialog("Especialidad: ");
            int profesion = Integer.valueOf(JOptionPane.showInputDialog("Profesión: "));
            empleado = new Programador(especialidad, profesion, tipo, nombre, direccion, sueldoBasico);
        }
        if (tipo.equals("e")) {
            int antiguedad = Integer.valueOf(JOptionPane.showInputDialog("Antiguedad: "));
            empleado = new Electronico(antiguedad, tipo, nombre, direccion, sueldoBasico);
        }
        if (tipo.equals("a")) {
            String cargo = JOptionPane.showInputDialog("Cargo: ");
            empleado = new Administrativo(cargo, tipo, nombre, direccion, sueldoBasico);
        }
        this.lista.add(empleado);

    }

    public Empleado getSueldoMax() {
        double sueldoMax = 0;
        int ubicacion = 0;
        for (int i = 0; i < lista.size(); i++) {
            Empleado aux = lista.get(i);
            double sueldoEmpleado = aux.calcularSueldo();
            if (sueldoMax < sueldoEmpleado) {
                sueldoMax = sueldoEmpleado;
                ubicacion = i;
            }
        }
        return lista.get(ubicacion);
    }

    public Empleado getSueldoMin() {
        double sueldoMin = 999999;
        int ubicacion = 0;
        for (int i = 0; i < lista.size(); i++) {
            Empleado aux = lista.get(i);
            double sueldoEmpleado = aux.calcularSueldo();
            if (sueldoMin < sueldoEmpleado) {
                sueldoMin = sueldoEmpleado;
                ubicacion = i;
            }
        }
        return lista.get(ubicacion);
    }
    
    public void mostrarElectronicoAntiguo(){
        int antiguedad = 0;
        int ubicacion = 0;
        for (int i = 0; i < lista.size(); i++) {
            Empleado aux = lista.get(i);
            if (aux.tipo.equals("e")) {
                Electronico auxE = (Electronico) aux;
                if (auxE.antiguedad > antiguedad){
                    antiguedad = auxE.antiguedad;
                    ubicacion = i;
                }
            }
        }
        System.out.println(lista.get(ubicacion).nombres);
    }
}
