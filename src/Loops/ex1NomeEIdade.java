package Loops;

import java.util.Scanner;

/*Faça um programa que leia o conjunto de dois valores,
 o primeiro representando o nome do aluno e o segundo sua idade
 Pare inserindo o valor 0 no campo nome. */

public class ex1NomeEIdade{

public static void Main(String [] args) {

 try (Scanner scan = new Scanner (System.in)) {
   String nome;
    int idade;
   
    while (true) {
       
   
       System.out.println("nome: ");
       nome = scan.next();
       if (nome.equals("0")) break;
   
       System.out.println("idade: ");
       idade = scan.nextInt();
       
      
    }
}

 System.out.println("continua aqui...");

}
}