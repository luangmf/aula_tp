/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioproduto;

import java.util.Scanner;

/**
 *
 * @author dsm-2
 */
public class ExercicioProduto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int qtdComprada;
        double precoUni,totalPag;
        String nome;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Nome do produto: ");
        nome = entrada.next();
        
        System.out.print("Quantidade de unidades: ");
        qtdComprada = entrada.nextInt();
        
        System.out.print("Digite o valor unitário do produto: ");
        precoUni = entrada.nextDouble();
        
        totalPag = qtdComprada*precoUni;
        
        System.out.print("O valor total da sua compra ficou em: " + totalPag);
        
        
    }
    
}
