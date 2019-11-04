package evaluaciones.control220192;

public class Prueba {

    public static void main(String[] args) {
        Producto[] lista = new Producto[10];
        int n = 0; // Numero de productos
        Producto medicina1 = new Medicina(new Fecha(10, 10, 2019), "M01", "amoxi", 10, 15);
        n++;
        Producto medicina2 = new Medicina(new Fecha(10, 10, 2020), "M02", "panadol", 10, 5);
        n++;
        Producto perfume1 = new Perfume("PER01", "perfume 1", 10, 15);
        n++;
        Producto perfume2 = new Perfume("PER02", "perfume 2", 10, 5);
        n++;
        Producto instrumentoMedico1 = new InstrumentoMedico("metal", "IM01", "pinza", 10, 15);
        n++;
        Producto instrumentoMedico2 = new InstrumentoMedico("plastico", "IM02", "tijera", 10, 5);
        n++;
        lista[0] = medicina1;
        lista[1] = medicina2;
        lista[2] = perfume1;
        lista[3] = perfume2;
        lista[4] = instrumentoMedico1;
        lista[5] = instrumentoMedico2;

        // Reporte de costo total y stock
        resumenCostoStock(lista, n);
        // Listar medicinas vencidas
        listarMedicinasVencidas(lista, n);
        numMedicinas(lista, n);
        // Eliminar medicinas vencidas
        eliminarMedicinasVencidas(lista, n);
        // Listar medicinas vencidas
        numMedicinas(lista, n);

    }

    public static void resumenCostoStock(Producto[] lista, int n) {
        double costoTotalMedicina = 0;
        int stockTotalMedicina = 0;
        double costoTotalPerfume = 0;
        int stockTotalPerfume = 0;
        double costoTotalInstrumentoMedico = 0;
        int stockTotalInstrumentoMedico = 0;

        for (int i = 0; i < n; i++) {
            if (lista[i] instanceof Medicina) {
                costoTotalMedicina += (lista[i].getPrecioUnitario()) * (lista[i].getStock());
                stockTotalMedicina += lista[i].getStock();
            }
            if (lista[i] instanceof Perfume) {
                costoTotalPerfume += (lista[i].getPrecioUnitario()) * (lista[i].getStock());
                stockTotalPerfume += lista[i].getStock();
            }
            if (lista[i] instanceof InstrumentoMedico) {
                costoTotalInstrumentoMedico += (lista[i].getPrecioUnitario()) * (lista[i].getStock());
                stockTotalInstrumentoMedico += lista[i].getStock();
            }
        }
        System.out.println("Costo total mediciona: " + costoTotalMedicina);
        System.out.println("Stock total mediciona: " + stockTotalMedicina);
        System.out.println("Costo total Perfume: " + costoTotalPerfume);
        System.out.println("Stock total Perfume: " + stockTotalPerfume);
        System.out.println("Costo total Instrumento medico: " + costoTotalInstrumentoMedico);
        System.out.println("Stock total Instrumento medico: " + stockTotalInstrumentoMedico);
    }

    public static void numMedicinas(Producto[] lista, int n) {
        int numVencidas=0;
        for (int i = 0; i < n; i++) {
            if (lista[i] instanceof Medicina) {
                Medicina mTemp = (Medicina) lista[i];
                numVencidas++;
            }
        }
        System.out.println("Numero de medicinas: "+ numVencidas);
    }

    public static void listarMedicinasVencidas(Producto[] lista, int n) {
        for (int i = 0; i < n; i++) {
            if (lista[i] instanceof Medicina) {
                Medicina mTemp = (Medicina) lista[i];
                if (mTemp.estaVencido(2019)) {
                    mTemp.escribir();
                }
            }
        }
    }

    public static void eliminarMedicinasVencidas(Producto[] lista, int n) {
        int numElementos = n;
        int i = 0;
        while (i < numElementos) {
            if (lista[i] instanceof Medicina) {
                Medicina mTemp = (Medicina) lista[i];
                if (mTemp.estaVencido(2019)) {
                    eliminarItem(lista, numElementos, mTemp.getCodigo());
                    numElementos--;
                }
            }
            i++;
        }

    }

    public static int iesimo(Producto[] lista, int n, String codigo) {
        for (int i = 0; i < n; i++) {
            if (lista[i].getCodigo().equals(codigo)) {
                return i;
            }
        }
        return -1;
    }

    public static void eliminarItem(Producto[] lista, int n, String codigo) {
        int pos = iesimo(lista, n, codigo);
        if (pos >= 0) {
            // Desplazar los elementos para cubrir el espacio 
            // libre del elemento eliminado
            for (int i = pos; i < n - 1; i++) {
                lista[i] = lista[i + 1];
            }
            n--;
        }

    }
}
