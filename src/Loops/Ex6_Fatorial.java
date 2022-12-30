package Loops;

import java.util.Scanner;

/* Faça um programa que calculeno fatorial de um número
 * inteirro fornecido pelo usuário.
 * Ex.: 5!= 120 (5x4x3x2x1)
 */


public class Ex6_Fatorial{

    public static void main(String[] args) {
        
        try (Scanner scan = new Scanner(System.in)){

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        System.out.println(fatorial + "! = ");

        for(int i = fatorial;  i >= 1; i = i - 1){

            multiplicacao = multiplicacao * i;

        }

        System.out.println(multiplicacao);
        
    }
    }
}