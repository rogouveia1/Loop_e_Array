package Loops;

import java.util.Scanner;

/**Faça um programa que peça N números inteiros;
 * Calcule e mostre a quantidade de números parres e a quantidade
 * de números pares e a quantidade de números impares
 */

public class ParEImparEx4{

    public static void main(String[] args) {

       try (Scanner scan = new Scanner(System.in)){

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;


        System.out.println("Quantidade de numeros ");
        quantNumeros = scan.nextInt();

        int count = 0;

        do {
            System.out.println("numero ");
            numero = scan.nextInt();

            if (numero % 2 == 0)  quantPares++; //pode ser quantPares +1
            else quantImpares++;
            
            
            count++;

        } while (count < quantNumeros);

        System.out.println("Quantidade de pares " + quantPares);
        System.out.println("Quantidade de impares " + quantImpares);
    }
    }
    
}