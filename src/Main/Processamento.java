/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Lucas
 */
public class Processamento {
    public double calcularTroco(double preco,double dinheiro){
        double troco;
        troco=dinheiro-preco;
        if(preco>dinheiro){
            System.out.println("Faltou dinheiro amigo");
        }
        return troco;
    
    }
    
}
