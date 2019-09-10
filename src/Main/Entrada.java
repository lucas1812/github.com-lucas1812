/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Entrada {
    Scanner teclado = new Scanner(System.in);
    public double lerNumeroDouble(String msg) {
        while (true) {
            try {
                System.out.print(msg + " =>");
                double x = teclado.nextDouble();
                return x;
            } catch (Exception e) {
                System.out.println("Erro,digite um double....");
                teclado = new Scanner(System.in);
            }
        }
    }

    
    public Integer lerNumeroInteiro(String msg) {
        while (true) {
            try {
                System.out.print(msg + " =>");
                Integer x = teclado.nextInt();
                return x;
            } catch (Exception e) {
                System.out.println("Erro,digite um inteiro...");
                teclado = new Scanner(System.in);
            
}
}
    }
}
         