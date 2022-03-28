package com.trabalhoBimestral;

import java.util.Scanner;

public class Exer2ItemA {

   public static void main(String[] args){
     /*
     Fazer um programa que leia três valores com
     ponto flutuante de dupla precisão: A, B e C.
     Em seguida, calcule e mostre. 
      a) a área do triângulo retângulo que tem A
      por base e C por altura. 
     */
     Scanner input = new Scanner(System.in);
     
     
     System.out.println("Calculo da área de um triângulo retângulo");
     
     
     System.out.println("Base do triângulo:"); 
     double A = input.nextDouble();//Base
     
     System.out.println("Altura do triângulo:");
     double C = input.nextDouble();//Altura
     input.close();
     
     // B = Área
     double B; 
     B = (A * C)/2;
     
     System.out.print("Área = "+String.format("%.2f", B));
     

     
   }


}
