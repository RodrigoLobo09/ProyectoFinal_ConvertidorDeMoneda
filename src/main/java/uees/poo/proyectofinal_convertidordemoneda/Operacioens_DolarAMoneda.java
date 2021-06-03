/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uees.poo.proyectofinal_convertidordemoneda;

/**
 *
 * @author Lenovo
 */
public class Operacioens_DolarAMoneda implements Dolar_Moneda {
     @Override
    public double dolar_yuan (double nueva_cant) {
        nueva_cant = nueva_cant *6.40;
        return nueva_cant;
    }

    @Override
    public double dolar_libra (double nueva_cant) {
        nueva_cant = nueva_cant * 0.71;
        return nueva_cant;
    }

    @Override
    public double dolar_peso (double nueva_cant) {
        nueva_cant= nueva_cant * 20.06; 
        return nueva_cant;
    }

    @Override
    public double dolar_euro (double nueva_cant) {
        nueva_cant = nueva_cant * 0.82;
        return nueva_cant;
    }

}
