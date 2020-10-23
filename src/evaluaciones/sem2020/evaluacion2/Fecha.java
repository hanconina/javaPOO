package evaluaciones.sem2020.evaluacion2;


import java.util.Calendar;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    public int calcularEdad(){
        Calendar cal = Calendar.getInstance();
        int añoActual = cal.get(Calendar.YEAR);
        return añoActual - año;
    }
    public String mostrar(){
        return dia+"/"+mes+"/"+año;
    }
    
}
