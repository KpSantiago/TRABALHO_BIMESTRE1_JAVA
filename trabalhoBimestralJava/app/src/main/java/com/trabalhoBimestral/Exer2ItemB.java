package com.trabalhoBimestral;

import java.util.Scanner;

 public class Exer2ItemB {
   
   public static void main(String[] args){
     /*
     Fazer um programa que leia três valores com
     ponto flutuante de dupla precisão: A, B e C.
     Em seguida, calcule e mostre. 
      b) Área do círculo de raio C. 
        pi = 3,14159
     */
     
     Scanner input = new Scanner(System.in);
     
     System.out.println("Área do círculo através do raio");
     
     double A = 3.14159;//PI

     System.out.println("Digite o raio: ");
     double C = input.nextDouble();//Raio
     input.close();
      
     double B; //ÁREA
     
     B = A * Math.pow(C, 2.0);
     
     System.out.println("Área do círculo: " + String.format("%.2f", B));  
   }
    
}
