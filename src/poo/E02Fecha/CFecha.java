/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.E02Fecha;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class CFecha {

    /**
     * ************** Atributos ****************
     */
    private int dia;
    private int mes;
    private int año;

    /**
     * ************** Métodos ****************
     */
    /*================ Constructores =============*/
 /*
    * Constructor por defecto o predeterminado
     */
    public CFecha() {
        // Cuando no conocemos el día, mes y año
        // Iniciaremos la fecha en el primer día para las computadores
        dia = 1;
        mes = 1;
        año = 1900;
    }

    /*
    * Constructor para crear un objeto fecha conocimiento un día,
    * mes y año específico
     */
    public CFecha(int pDia, int pMes, int pAnio) {
        dia = pDia;
        mes = pMes;
        año = pAnio;
    }

    /*================ Accesadores y modificadores =============*/
 /*Permiten cambiar o recuperar los valores de los atributos*/
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if ((dia>=1)&&(dia<=nroDiasMes(this.mes, this.año)))
            this.dia = dia;
        else
            System.out.println("Error. El día no es válido ...");
    }
    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if ((mes >=1) && (mes <=12) && (this.dia<=nroDiasMes(mes, this.año)))
            this.mes = mes;
        else
            System.out.println("Error. El Mes no es válido...");
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        if (esFechaValida(this.dia,this.mes,año))
            this.año = año;
        else
            System.out.println("Error. El Año no es válido...");
    }

    public void leer() {
        Scanner entrada = new Scanner(System.in);
        // Leer datos desde el teclado
        boolean flag;
        do {
            System.out.println("Ingrese el día: ");
            dia = entrada.nextInt();
            System.out.println("Ingrese el Mes: ");
            mes = entrada.nextInt();
            System.out.println("Ingrese el Año: ");
            año = entrada.nextInt();
            flag = this.esFechaValida(dia, mes, año);
            if (!flag)
                System.out.println("Error. volver a ingresar la fecha");
        } while (!flag);
    }

    public void escribir() {
        System.out.println(dia + "/" + mes + "/" + año);
    }

    private int nroDiasMes(int pMes, int pAño) {
        if (pMes == 2) {
            if (pAño % 4 == 0) {
                return 29;
            } else {
                return 28;
            }
        } else // Mes es (4,6,9,11)
        if ((pMes == 4) || (pMes == 6) || (pMes == 9) || (pMes == 11)) {
            return 30;
        } else // Mes es (1,3,5,7,8,10,12)
        {
            return 31;
        }
    }

    private boolean esFechaValida(int pDia, int pMes, int pAño) {
        if (pAño > 0) {
            if ((1 <= pMes) && (pMes <= 12)) {
                if ((pDia >= 1) && (pDia <= nroDiasMes(pMes, pAño))) {
                    return true;
                } else {
                    System.out.println("Error. El día no es válido ...");
                    return false;
                }
            } else {
                System.out.println("Error. El Mes no es válido ...");
                return false;
            }
        } else {
            System.out.println("Error. El año no es válido ...");
            return false;
        }
    }
}
