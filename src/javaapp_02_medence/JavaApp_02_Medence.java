/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp_02_medence;

import java.util.Scanner;

/**
 *
 * @author grabe
 */
public class JavaApp_02_Medence {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem adja meg a medence átmérőkét(m):");
        double atmero =sc.nextDouble();
        System.out.println("Kérem adja meg a medence magasságát(m):");
        double magassag =sc.nextDouble();
        
        double medenceFelszin = atmero/2*atmero/2*3.14;
        double medenceFelszin1= Math.pow(atmero/2,2)*Math.PI;
        double terfogat= medenceFelszin1 * magassag;
        System.out.println("A medence térfogata:"+Math.round(terfogat*100)/100.0);
        
    }
    
}
