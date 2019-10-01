package evaluaciones.practicacalificada1.sem20192;

import java.util.LinkedList;

public class AppTest {

    public static void main(String[] args) {
        // Ingresar Empleados
        LinkedList<Empleado> lista = new LinkedList<Empleado>();
        Empleado emp1 = new Secretaria();
        emp1.leer();
        lista.add(emp1);
        Empleado emp2 = new Vendedor();
        emp2.leer();
        lista.add(emp2);
        Empleado emp3 = new JefeZona();
        emp3.leer();
        lista.add(emp3);

        for (int i = 0; i < lista.size(); i++) {
            Empleado emp = lista.get(i);
            emp.incrementarSalario();
            emp.imprimir();
        }
    }
}
