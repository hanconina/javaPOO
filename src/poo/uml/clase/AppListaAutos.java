package poo.uml.clase;
import java.util.LinkedList;
public class AppListaAutos {
    public static void main(String[] args){
        // Crear una lista de objetos del tipo Auto
        LinkedList<Auto> listaAutos = new LinkedList<Auto>();
        // Crear Objetos Autos y almacenarlo en la lista
        Auto auto1 = new Auto("PE-001","Toyota",13567.00F);
        listaAutos.add(auto1);
        Auto auto2 = new Auto("PE-002","Nissan",34567.00F);
        listaAutos.add(auto2);
        Auto auto3 = new Auto("PE-003","For",44567.00F);
        listaAutos.add(auto3);
        Auto auto4 = new Auto("PE-004","Toyota",54563.00F);
        listaAutos.add(auto4);
        Auto auto5 = new Auto("PE-005","Kia",12000.00F);
        listaAutos.add(auto5);
        
        // Listar los objetos almacenados en la lista utilizndo for
        for (int i=0;i<listaAutos.size();i++){
            Auto auto = listaAutos.get(i);
            System.out.println("Auto: "+i+": "+auto.verDatos());
        }
    }
}
