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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Entrada entrada=new Entrada();
    double dinheiro=entrada.lerNumeroDouble("dinheiro:");
    double preco=entrada.lerNumeroDouble("Preço:");
    Processamento processamento=new Processamento();
    double voltar=processamento.calcularTroco(preco, dinheiro);
    System.out.println("Troco:"+voltar);
    
    
    
    
    
    
    
    
}
}
