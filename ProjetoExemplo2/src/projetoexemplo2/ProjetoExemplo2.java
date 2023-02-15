/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoexemplo2;

import java.util.Scanner;

/**
 *
 * @author dsm-2
 */
public class ProjetoExemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome;
        double salario, novoSalario;
        int qtdExtra;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        nome = entrada.next();
        System.out.print(nome + ", digite seu salário base: ");
        salario = entrada.nextDouble();
        System.out.print("Digite a quantidade de horas extras: ");
        qtdExtra = entrada.nextInt();
        //forma de somar as entradas pelo usuário e calcular com valor fixado no comando.
        novoSalario = salario+qtdExtra*30;
        
        System.out.print(nome + ", o seu salário com horas extra é: R$" + novoSalario);    
    
    }
    
}
