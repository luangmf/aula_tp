/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciomedidas;

import java.util.Scanner;

/**
 *
 * @author dsm-2
 */
public class ExercicioMedidas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double area,perimetro,a,b;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe o valor de A: ");
        a = entrada.nextDouble();
        
        System.out.print("Informe o valor de B: ");
        b = entrada.nextDouble();
        
        area = a*b;
        
        perimetro = 2*a+2*b;
        
        System.out.print("O valor da area é: " + area + ", o valor do perimetro é: " + perimetro);
        
        
    }
    
}
