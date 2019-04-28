package flujos;

public class E03ConversionTipos01 {
    public static void main(String args[]) {
        // Conversión implicita o automática
        short corto = 34;
        int largo = corto;
        // Conversión explicita o casting
        long largaso = 2345L;
        int cortito = (int) largaso;
        // Promoción en expreciones
        short a=45,b=98;
        // Error de compilación cuando c = a+b; por posible perdida de datos
        short c = (short) (a+b); 
    }
}
