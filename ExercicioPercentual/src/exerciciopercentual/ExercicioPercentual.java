/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciopercentual;

import java.util.Scanner;

/**
 *
 * @author dsm-2
 */
public class ExercicioPercentual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double salario,percentual,novoSalario;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o seu salário mensal: ");
        salario = entrada.nextDouble();
        
        System.out.print("Digite o percentual de reajuste: ");
        percentual = entrada.nextDouble();
        
        novoSalario = salario+salario*percentual/100;
        
        System.out.print("O seu salario com reajuste é: " + novoSalario);
        
    }
    
}
