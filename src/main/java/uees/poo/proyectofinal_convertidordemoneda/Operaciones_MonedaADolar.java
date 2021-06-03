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
public class Operaciones_MonedaADolar implements Moneda_Dolar {
   
    @Override
    public  double yuan_dolar (double cant) {
        cant = cant *0.16;
        return cant;
    }

    @Override
    public double libra_dolar (double cant){
        cant = cant * 1.41;
        return cant;
    }

    @Override
    public double peso_dolar (double cant) {
        cant= cant * 0.05; 
        return cant;
    }

    @Override
    public double euro_dolar (double cant) {
        cant = cant * 1.21;
        return cant;
}
}
