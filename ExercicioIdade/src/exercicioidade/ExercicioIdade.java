/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioidade;

import java.util.Scanner;



/**
 *
 * @author dsm-2
 */
public class ExercicioIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int idade, dias, multiplicacao;
        
        Scanner entrada = new Scanner(System.in);
    
        System.out.print("Digite a sua idade: ");
        idade = entrada.nextInt();
        
        dias = 365;
        
        multiplicacao = idade*dias;
        
        System.out.print("Você tem " + multiplicacao + " dias de idade");
    
    }
    
}
