package flujos;
public class E02IncDec {
    public static void main(String[] args) {
        int c = 15;
        int x, y, z, w;
        x = c++; // A x se asigna el valor de c y luego se incrementa c 
        y = c; // A y se asigna el nuevo valor de c ya incrementado
        z = ++c; // A z se asigna el nuevo valor de c ya incrementado
        w = c; // a w se asigna el mismo valor asignado a z
        System.out.println(x + ", " + y + ", " + z + ", " + w);
    }
}
