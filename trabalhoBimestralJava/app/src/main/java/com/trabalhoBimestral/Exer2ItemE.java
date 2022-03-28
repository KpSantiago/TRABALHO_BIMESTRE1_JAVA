package com.trabalhoBimestral;

import java.util.Scanner;

public class Exer2ItemE {

   
   public static void main(String[] args){
   /*
     Fazer um programa que leia três valores com
     ponto flutuante de dupla precisão: A, B e C.
     mostre 
      e) Área do retângulo quem tem lados A e B.
   */
     
     Scanner input = new Scanner(System.in);
     System.out.println("Calculo da área de uma retângulo");
     
     System.out.println("Base: ");
     double A = input.nextDouble();//base
     
     System.out.println("Altura: ");
     double B = input.nextDouble();//altura
     input.close();
     
     double C = A * B;
     
     System.out.println("Área do retângulo: " + String.format("%.2f", C));
     
     
   }

}
