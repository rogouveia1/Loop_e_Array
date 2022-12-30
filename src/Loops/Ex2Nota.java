package Loops;

import java.util.Scanner;

/**faça um programa que peça uma nota entre 0 e 10
 * Mostre uma mensagem caso o valor seja invalido e
 * continue pedindo até que o usuário informe um valor válido
 */
public class Ex2Nota {

    public static void main (String [] args) {

    
        
       try (Scanner scan = new Scanner (System.in)){

       

        int nota;

        System.out.println("A nota é  ");
        nota = scan.nextInt();

    while (nota <0 | nota >10) {
        System.out.println("Nota inválido, digite novamente");

        System.out.println("A nota é  ");
        nota = scan.nextInt();

    }
    }

}
    
}
