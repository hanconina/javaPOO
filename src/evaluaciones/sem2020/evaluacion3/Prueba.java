package evaluaciones.sem2020.evaluacion3;

public class Prueba {
    public static void main(String[] args) {
        Policia policia = new Policia("Juan",29,2);
        Multa multa = new PicoPlaca(
                "Lunes","Javier Prado","PE028",2234,"Miraflores",4,policia);
        System.out.println("Multa: "+ multa.mostrar());
    }
    
}
