/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uees.poo.proyectofinal_convertidordemoneda;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Convertidor_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double cant;
        int i;
        double d;
        int k;
        
        
        
           Scanner teclado = new Scanner (System.in);
         System.out.println("Ingrese el numero corepondiente a la moneda que tiene (1)-Yuan (2)- Libra (3)- Pesos Mexicanos (4)- Euros (5)-Dolar:");
         i = teclado.nextInt();
         System.out.println("Ingrese la cantidad de su moneda :");
            cant = teclado.nextDouble();
         System.out.println("Ingrese el numero corepondiente a la moneda que desa cambiar (1)-Yuan (2)- Libra (3)- Pesos Mexicanos (4)- Euros (5)-Dolar:");
         k = teclado.nextInt();   
         
         Operaciones_MonedaADolar prueba = new Operaciones_MonedaADolar ();
         Operacioens_DolarAMoneda testinter = new Operacioens_DolarAMoneda();
         switch(i){
            case 1:
            double nueva_cant=  prueba.yuan_dolar(cant);
            
        switch(k){
            case 1: 
               nueva_cant= (testinter.dolar_yuan(nueva_cant))- 0.25;
              System.out.println("La cantidad en Yuanes es de : "+ nueva_cant);
              break;
            case 2:
               nueva_cant =(testinter.dolar_libra(nueva_cant))- 0.05;
              System.out.println("La cantidad en Libras es de : " + nueva_cant);
               break;
            case 3:
                nueva_cant= (testinter.dolar_peso(nueva_cant))-2.17;
              System.out.println("La cantidad en Pesos Mexicanos es de : "+ nueva_cant );
              break;
            case 4:
                nueva_cant= (testinter.dolar_euro(nueva_cant))-0.04;
              System.out.println("La cantidad en Euros es de :" + nueva_cant);
              break;
            case 5:
            System.out.println("La cantidad en Dolares es de :" + prueba.yuan_dolar(cant) );    
              break;  
        }     
         break;   
            
          
            case 2:
            nueva_cant=  prueba.libra_dolar(cant);
 switch(k){
            case 1: 
                nueva_cant = (testinter.dolar_yuan(nueva_cant))+0.06;
              System.out.println("La cantidad en Yuanes es de : "+nueva_cant);
              break;
            case 2:
                nueva_cant= (testinter.dolar_libra(nueva_cant))-0.02;
              System.out.println("La cantidad en Libras es de : " + nueva_cant );
              break;
               
            case 3:
                nueva_cant= (testinter.dolar_peso(nueva_cant))+ 1.71;
              System.out.println("La cantidad en Pesos Mexicanos es de : "+ nueva_cant);
              break;
              
            case 4:
                nueva_cant= (testinter.dolar_euro(nueva_cant))+ 0.13;
              System.out.println("La cantidad en Euros es de :" + nueva_cant);
              break;
            case 5:
            System.out.println("La cantidad en Dolares es de :" + prueba.libra_dolar(cant) );    
              break;  
        }    
break; 
            case 3:
            nueva_cant=  prueba.peso_dolar(cant);
            
              
 switch(k){
            case 1: 
                nueva_cant = (testinter.dolar_yuan(nueva_cant))- 0.04;
              System.out.println("La cantidad en Yuanes es de : "+ nueva_cant);
              break;
            case 2:
                nueva_cant= (testinter.dolar_libra(nueva_cant))- 0.01;
              System.out.println("La cantidad en Libras es de : " + nueva_cant);
              break;
               
            case 3:
                nueva_cant= (testinter.dolar_peso(nueva_cant))- 0.06;
              System.out.println("La cantidad en Pesos Mexicanos es de : "+ nueva_cant);
              break;
              
            case 4:
              System.out.println("La cantidad en Euros es de :" + testinter.dolar_euro(nueva_cant));
              break;
            case 5:
            System.out.println("La cantidad en Dolares es de :" + prueba.peso_dolar(cant) );    
              break;  
        }   
 break;
            case 4:
            nueva_cant= prueba.euro_dolar(cant);
                
switch(k){
            case 1: 
                nueva_cant= (testinter.dolar_yuan(nueva_cant)) +0.42;
              System.out.println("La cantidad en Yuanes es de : "+nueva_cant);
              break;
            case 2:
               nueva_cant= (testinter.dolar_libra(nueva_cant))+ 0.02;
              System.out.println("La cantidad en Libras es de : " + nueva_cant );
              break;
               
            case 3:
                nueva_cant= ( testinter.dolar_peso(nueva_cant))+ 3.17;
              System.out.println("La cantidad en Pesos Mexicanos es de : "+nueva_cant);
              break;
              
            case 4:
                nueva_cant= (testinter.dolar_euro(nueva_cant))+ 0.16;
              System.out.println("La cantidad en Euros es de :" + nueva_cant );
              break;
            case 5:
            System.out.println("La cantidad en Dolares es de :" + prueba.euro_dolar(cant) );    
              break;  
        }     
break;
             case 5:
               
                 
            switch(k){
            case 1: 
                
              System.out.println("La cantidad en Yuanes es de : "+prueba.yuan_dolar(cant));
              break;
            case 2:
             
              System.out.println("La cantidad en Libras es de : " + prueba.libra_dolar(cant)  );
              break;
               
            case 3:
               
              System.out.println("La cantidad en Pesos Mexicanos es de : "+ prueba.peso_dolar(cant));
              break;
              
            case 4:
           
              System.out.println("La cantidad en Euros es de :" + prueba.euro_dolar(cant) );
              break;
            case 5:
            System.out.println("La cantidad en Dolares es de :" + cant );    
              break;  
         }
         
       
         
                 
         }
    }
}
    

