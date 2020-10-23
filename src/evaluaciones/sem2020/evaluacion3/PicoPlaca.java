package evaluaciones.sem2020.evaluacion3;

public class PicoPlaca extends Multa implements NuevoCalculo {

    private String nombreDia;
    private String avenida;

    public PicoPlaca(String nombreDia, String avenida, String placa, int codBarra, String distrito, double pesoVehiculo, Policia policia) {
        super(placa, codBarra, distrito, pesoVehiculo, policia);
        this.nombreDia = nombreDia;
        this.avenida = avenida;
    }

    public String getNombreDia() {
        return nombreDia;
    }

    public void setNombreDia(String nombreDia) {
        this.nombreDia = nombreDia;
    }

    public String getAvenida() {
        return avenida;
    }

    public void setAvenida(String avenida) {
        this.avenida = avenida;
    }

    @Override
    public long generarTicket() {
        return (long) (12000 + Math.random() * (20000 - 12000));
    }

    @Override
    public double calcularMulta() {
        double excesoPeso = 0;
        if (pesoVehiculo > 3) {
            excesoPeso = pesoVehiculo - 3;
        }
        return MultaBase.base * (1 + excesoPeso * MultaBase.base * 2 / 100);
    }

    @Override
    public String mostrar() {
        return super.mostrar() + "\n"
                + "Día: " + nombreDia + "\n"
                + "Avenida: " + avenida;
    }

}
