/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasegenerica.ejemplo2;

public class Estadisticas <T extends Number>{
    private T[] numeros;
    public Estadisticas(T[] numeros){
        this.numeros = numeros;
    }
    
    public double promedio(){
        double suma = 0;
        for (int i=0;i<numeros.length;i++){
            suma += numeros[i].doubleValue();
        }
        return suma / numeros.length;
    }
    public boolean igualPromerio(Estadisticas<?> objeto){
        if (promedio()==objeto.promedio()){
            return true;
        }
        else
        {
            return false;
        }
    }    
}