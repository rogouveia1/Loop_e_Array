package Loops;

import java.util.Scanner;

/**Desenvolva um gerador de tabuada
 * capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
 * O usuário deve informar de qual numero deseja ver a tabuada
 * A saída deverá ser conforme o exemplo abaixo
 * Tabuada de 5:
 * 5x1= 5
 * 5x2= 10
 * ...
 * 5x10= 50
 */

public class ex5Tabuada {
    public static void main(String[] args) {
    
        try (Scanner scan = new Scanner(System.in)){

    

        System.out.println("tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("tabuada de " + tabuada);

        for(int i = 1; i <= 10; i = i + 1){

            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));

        }

    }
    }
    
}
