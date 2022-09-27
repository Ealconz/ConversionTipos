/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversiontipos;

import java.util.Scanner;

/**
 *
 * @author elias
 */
public class ConversionTipos {

    /**
     * @param args the command line arguments
     */
    static Scanner ent = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduzca cualquier numero: ");
        String i = ent.nextLine();
        int c = Integer.valueOf(i);
        System.out.println("El numero introducido es: " + c);
        
    }
    
}
