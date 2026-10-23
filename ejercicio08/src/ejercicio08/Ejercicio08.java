/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;

/**
 *
 * @author Usuario
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int a = 80;
        int b = 40;
        int c = 5;
        int d = 2;
        int e = 45;
        int f = 100;
        int g = 25;
        int h = 3;
        int i = 30;
        int j = 6;

        boolean parte1 = ((((a + b) / j) + Math.pow(c, d)) >= e);
        boolean parte2 = ((f - g * h) < i);
        boolean resultado = (parte1 && parte2);

        System.out.println(resultado);

    }

}
