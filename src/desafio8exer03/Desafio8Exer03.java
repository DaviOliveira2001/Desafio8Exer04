/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio8exer03;

import java.util.Scanner;

/**
 *
 * @author odavi
 */
public class Desafio8Exer03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner teclado = new Scanner (System.in);
      int numeros, cont1020, contFora;
      cont1020 = 0; contFora = 0;
        System.out.println("Digite um número positovo para continuar ou um negativo para sair.");
        numeros = teclado.nextInt();
        
        while(numeros >= 0){
            if(numeros >= 10 && numeros <= 20){
                cont1020++;
            }else{
                contFora++;
            }
             System.out.println("Digite um número de sua escolha:");
             numeros = teclado.nextInt();
        }
        System.out.println("Números digitados dentro do intervalo: "+cont1020);
        System.out.println("Números digitados fora do intervalo: "+contFora);
    }
    
}
