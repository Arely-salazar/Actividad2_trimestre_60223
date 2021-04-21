/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_2.pkg3_60223;

import java.util.Scanner;

/**
 *
 * @author Jairo
 */
public class Actividad_23_60223 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             Scanner miConsola = new Scanner(System.in);
           
        System.out.println( "Inserte un número del 1 al 12: ");
        int num = miConsola.nextInt();  
         
        if (num <=3){
        System.out.println( "Se encuentra en el primer trimestre del año");}
          if (num >= 4 && num <= 6){
        System.out.println( "Se encuentra en el segundo trimestre del año");}
           if (num >=7 && num <= 9){
          System.out.println("Se encuentra en el tercer trimestre del año");}
       
           else if  (num>=10 && num <= 12){
          System.out.println("Se encuentra en el cuarto trimestre del año"); } 
        }
    }
    
    
    

