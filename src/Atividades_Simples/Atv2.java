package Atividades_Simples;

import java.util.Scanner;

public class Atv2 {
    
    /*Faça um programa que receba dois números, calcule e mostre a divisão do primeiro pelo segundo. 
    Sabe-se que o segundo número não pode ser zero, portanto, não é necessário se preocupar com isso neste exercício.*/
    
    public void mostraAtv2(){
        Scanner leia = new Scanner(System.in);

        double N1, N2, RES;      

        System.out.println("\nPrograma que lê dois valores e calcula sua divisão.\n");
        
        System.out.println ("Digite o primeiro número:");
        N1 = leia.nextDouble();
            //N1 = Double.parseDouble(System.console().readLine());

        System.out.println ("Digite o segundo número:");
        N2 = leia.nextDouble();
            //N2 = Double.parseDouble(System.console().readLine());

        RES = N1 / N2;

        System.out.printf ("O resultado da divisão de %.2f por %.2f é igual a %.2f.\n", N1, N2, RES);
    }
}
