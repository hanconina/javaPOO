package evaluaciones.sem2020.evaluacion3;

public class Omisiones extends Multa {

    private String codRegla;
    private String hora;

    public Omisiones(String codRegla, String hora, String placa, int codBarra, String distrito, double pesoVehiculo, Policia policia) {
        super(placa, codBarra, distrito, pesoVehiculo, policia);
        this.codRegla = codRegla;
        this.hora = hora;
    }

    public String getCodRegla() {
        return codRegla;
    }

    public void setCodRegla(String codRegla) {
        this.codRegla = codRegla;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public long generarTicket() {
        return (long) (9000 + Math.random() * (11000 - 9000));
    }

    @Override
    public String mostrar() {
        return super.mostrar() + "\n"
                + "Cod. Regla: " + codRegla + "\n"
                + "Hora omision: " + hora;

    }

}
