package Loops;

import java.util.Scanner;

/*Faça um programa que leia 5 números e informe o maior numero
 * e a média desses números
 */

public class Ex3MaiorEMedia {
  
 public static void main(String[] args) {
    
    try (Scanner scan = new Scanner (System.in)){

    int numero;
    int maior= 0;
    int soma=0;
    int count = 0;

    do {
        System.out.println("numero: ");
        numero = scan.nextInt();
        count = count+1;
        
        soma = soma + numero;

        if (numero > maior) maior = numero;

    } while (count <5);

    System.out.println( "maior: " + maior);
    System.out.println( "media: " + soma/5);
    
    }
 }   
    
}
