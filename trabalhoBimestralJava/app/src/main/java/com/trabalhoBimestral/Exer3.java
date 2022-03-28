package com.trabalhoBimestral;


public class Exer3 {
   
   public static void main(String[] args){
     /*
     Resolva a seguinte equação de Bháskara:
     A = 3; B = 15 e C = 12
     usando a classe MATH:
     */
     
     System.out.println("Cálculo da fórmula de Bhaskara");
     System.out.println("A = 3; B = 15; C = 12\n");
     
     double x1;
     double x2;
     
     double A = 3;
     double B = 15;
     double C = 12;
     
     double delta;
     
     delta = Math.pow(B, 2.0) - 4*A*C;
     
     x1 = (-B + Math.sqrt(delta))/(2*A);
     x2 = (-B - Math.sqrt(delta))/(2*A);
     
     System.out.println("x1 = "+x1);
     System.out.println("x2 = "+x2);

   }

}
