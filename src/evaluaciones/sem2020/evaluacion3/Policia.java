package evaluaciones.sem2020.evaluacion3;

public class Policia {
    private String nombres;
    private int edad;
    private int tiempoServicio;

    public Policia(String nombres, int edad, int tiempoServicio) {
        this.nombres = nombres;
        this.edad = edad;
        this.tiempoServicio = tiempoServicio;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTiempoServicio() {
        return tiempoServicio;
    }

    public void setTiempoServicio(int tiempoServicio) {
        this.tiempoServicio = tiempoServicio;
    }
    public String mostrar(){
        return "Nombres: "+nombres+"\n"+
                "Edad: "+edad+"\n"+
                "Tiempo Servicio: "+tiempoServicio;        
    }
    
}
