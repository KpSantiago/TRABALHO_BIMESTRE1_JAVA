package com.trabalhoBimestral;

import java.util.Scanner;

public class Exer2ItemC {
   public static void main(String[] args){
     /*
     Fazer um programa que leia très valores com
     ponto flutuante de dupla precisão: A, B e C.
      mostre 
      d) Área do trapézio A e B por bases e C por
      altura
     */
     
     Scanner input = new Scanner(System.in);
     
     System.out.println("Calculo da área de um trapézio");
     
     
     System.out.println("Base maior: ");
     double A = input.nextDouble();//base maior
     
     System.out.println("Base menor: ");
     double B = input.nextDouble();//base menor
      
     System.out.println("Altura: ");
     double C = input.nextDouble();//ALTURA
     input.close();
     
     double area = ((A + B)*C)/2;
     
     System.out.println("Área do trapézio: "+String.format("%.2f", area));
     
   }

}
