package Arrays;

import java.util.Random;

/*Faça um programa que leia 20 numeros inteiros aleatórios (entre 0 e 100)
 * armazene-os em um vetor. Ao final mostre os números e seus sucessores.
  */

public class Ex3_NumerosAleatorios {

    public static void main(String[] args) {
        Random random = new Random();
        //random gera numeros aleatórios
        int [] numerosAleatorios = new int [20];

        for(int i = 0; i < numerosAleatorios.length; i++ ){

            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        
}

        
        System.out.print("\nNumeros Aleatórios: ");
        for (int numero : numerosAleatorios) {
            //dividir o foreac em dois o primeiro os elementos(int numero) o segundo a array(numerosAleaorios)
            System.out.print(numero + " ");

        }
            System.out.print("\nAntecessores dos Numeros Aleatórios: ");
            for (int numero : numerosAleatorios) {
            //dividir o foreac em dois o primeiro os elementos(int numero) o segundo a array(numerosAleaorios)
            System.out.print(numero -1 + " ");

        }
        System.out.print("\nSucessores dos Numeros Aleatórios: ");
        for (int numero : numerosAleatorios) {
            //dividir o foreac em dois o primeiro os elementos(int numero) o segundo a array(numerosAleaorios)
            System.out.print(numero +1 + " ");
    }
        
}
}