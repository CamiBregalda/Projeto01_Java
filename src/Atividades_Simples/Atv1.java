package Atividades_Simples;

import java.util.Scanner;

public class Atv1 {
    
    /*Faça um programa que receba dois números, calcule e mostre a subtração do primeiro número pelo segundo.*/
    
    public void mostraAtv1(){
        Scanner leia = new Scanner(System.in);

        double N1, N2, RES;      
        
        System.out.println("\nPrograma que lê dois valores e calcula sua subtração.\n");
        
        System.out.println ("Digite o primeiro número:");
        N1 = leia.nextDouble();
            //N1 = Double.parseDouble(System.console().readLine());

        System.out.println ("Digite o segundo número:");
        N2 = leia.nextDouble();
            //N2 = Double.parseDouble(System.console().readLine());

        RES = N1 - N2;

        System.out.printf ("O resultado da subtração de %.2f menos %.2f é igual a %.2f.\n", N1, N2, RES);
    }
    
}
