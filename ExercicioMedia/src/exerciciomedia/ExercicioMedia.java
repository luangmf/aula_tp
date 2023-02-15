/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciomedia;

import java.util.Scanner;

/**
 *
 * @author dsm-2
 */
public class ExercicioMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1,n2,n3,n4,n5,n6;
        double soma, media1, media2;
                
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a sua n1: ");
        n1 = entrada.nextInt();
        
        System.out.print("Digite a sua n2: ");
        n2 = entrada.nextInt();
        
        System.out.print("Digite a sua n3: ");
        n3 = entrada.nextInt();
        
        media1 = n1+n2+n3/3;
        
        System.out.print("Sua primeira média é: " + media1);
    
        
        System.out.print("Digite a sua n4: ");
        n4 = entrada.nextInt();
        
        System.out.print("Digite a sua n5: ");
        n5 = entrada.nextInt();
        
        System.out.print("Digite a sua n6: ");
        n6 = entrada.nextInt();
        
        media2 = n4+n5+n6/3;
        
        System.out.print("Sua segunda média é: " + media2);
        
        soma = media1+media2;
        
        System.out.print("Sua media final é: " + soma);

    }
    
}
