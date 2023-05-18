package com.mycompany.checknumber;

/**
 *
 * @author Yaiza
 */
public class CheckNumber {

    public static void main(String[] args) {
        
    }
    
    public static double retornar(double num) {
        
        if(num>0) {
            System.out.println("El número és positiu.");
            return 1;
        }
        if(num<0) {
            System.out.println("El número és negatiu.");
            return -1;
        }
        if(num==0) {
            System.out.println("El número és un zero");
        }
        return 0;
    }
}
