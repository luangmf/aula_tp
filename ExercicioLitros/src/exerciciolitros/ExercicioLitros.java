/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciolitros;

import java.util.Scanner;

/**
 *
 * @author dsm-2
 */
public class ExercicioLitros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double litro, valorLitro, valorPagar;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o número de litros abastecido: ");
        litro = entrada.nextDouble();
        
        valorLitro = 4.39;
        
        valorPagar = litro*valorLitro;
        
        System.out.print("O valor total a ser pago é: " + valorPagar);
        
    }
    
}
