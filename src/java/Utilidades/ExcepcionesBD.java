/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

/**
 *
 * @author martaperal
 */
public class ExcepcionesBD extends RuntimeException {

    public ExcepcionesBD() {
        super();
    }

    public ExcepcionesBD(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }

    public ExcepcionesBD(String mensaje) {
        super(mensaje);
    }

    public ExcepcionesBD(Throwable mensaje) {
        super(mensaje);
    }

}
