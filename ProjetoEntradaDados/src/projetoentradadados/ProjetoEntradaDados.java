/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoentradadados;

import java.util.Scanner;

/**
 *
 * @author dsm-2
 */
public class ProjetoEntradaDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2, soma, subtracao, divisao, multiplicacao;
        
        //para poder dar entrada de dados
        Scanner entrada = new Scanner(System.in);
        //comando de escrever
        System.out.print("Digite o primeiro número: ");
        //comando de guardar o valor escrito
        /*o comando leia inteiro - entrada.nextInt();
                           reais - entrada.nextDouble();
                                   entrada.nextFloat();
                        caracter - entrada.next();
        */
        n1 = entrada.nextInt();
        //comando de escrever
        System.out.print("Digite o segundo número: ");
        //comando de guardar o valor escrito
        n2 = entrada.nextInt();
        //comando de realizar soma das duas variáveis mencionadas como inteiro
        soma = n1+n2;
        /*comando para escrever na tela o valor que foi armazenado dentro
        da variável soma após as duas variáves 'n1 e n2' passarem pelo
        processo de soma*/
        System.out.println("O valor da soma é: " + soma);
        //comando para subtração
        subtracao = n1-n2;
        System.out.println("O valor da subtracao é: " + subtracao);
        //comando para divisão
        divisao = n1/n2;
        System.out.println("O valor da divisão é: " + divisao);
        //comando para multiplicação
        multiplicacao = n1*n2;
        System.out.println("O valor da multiplicação é: " + multiplicacao);
    }
    
}
