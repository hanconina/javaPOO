package iu.array.ordenar;


public class Persona {
    private int dni;
    private String nombres;
    private String ciudadNacimiento;
    private double sueldo;
    public Persona(int dni, String nombres, String ciudad, double sueldo) {
        this.dni = dni;
        this.nombres = nombres;
        this.ciudadNacimiento = ciudad;
        this.sueldo = sueldo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCiudadNacimiento() {
        return ciudadNacimiento;
    }

    public void setCiudadNacimiento(String ciudadNacimiento) {
        this.ciudadNacimiento = ciudadNacimiento;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
}
