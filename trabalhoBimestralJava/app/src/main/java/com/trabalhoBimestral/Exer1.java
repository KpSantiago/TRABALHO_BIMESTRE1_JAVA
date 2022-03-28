package com.trabalhoBimestral;

import java.util.Scanner;

public class Exer1 {

  public static void main(String[] args) {
    /*
     Faça um programa para ler o valor do raio de
     um circulo, e depois mostrar o valor da área
     deste circulo com quatro casas decimais
     conforme exemplos.
     Fómula da área:
     area = π . raio²
     Considere o valor de π = 3.14159
    */
    
    Scanner input = new Scanner(System.in);
    double pi = 3.141519;
    //ou Math.PI
    
    System.out.println("Digite o raio: ");
    double raio = input.nextDouble();
    input.close();
    
    double area;

    area = pi * Math.pow(raio, 2.0);
  
    
    
    System.out.print("Área do círculo: " + String.format("%.4f", area));
  }
}
