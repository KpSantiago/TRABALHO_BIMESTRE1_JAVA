package com.trabalhoBimestral;

import java.util.Scanner;

public class Exer2ItemD {
   
   public static void main(String[] args){
   /*
     Fazer um programa que leia très valores com
     ponto flutuante de dupla precisão: A, B e C.
     Em seguida, calcule e mostre 
      c) Área do quadrado que tem lado B
   */
     
     System.out.println("Calculo da área de um quadrado");
     
     Scanner input = new Scanner(System.in);
     
     System.out.println("Digite o valor do lado:");
     double B = input.nextDouble();//lado
     input.close();
     
     double C = Math.pow(B, 2.0);//área
     
     System.out.println("Área do quadrado:" + String.format("%.2f", C));
     
     
   }
}
