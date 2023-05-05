package Atividades_Simples;

import java.util.Scanner;

public class Atv15 {
    
    /*Faça um programa que receba uma temperatura em Celsius, calcule e mostre essa temperatura em Fahrenheit.*/
    
    public void mostraAtv15(){
        
        Scanner leia = new Scanner(System.in);
        
        double celsius, fahrenheit;
        
	System.out.println ("\nPrograma que converte a temperatura de Celsius para Fahrenheit.\n");
        
        System.out.println ("Digite a temperatura em celsius:");
        celsius = leia.nextDouble();

     	fahrenheit = ((9 * celsius) / 5) + 32;

	System.out.printf ("A temperatura é de %.2fº fahrenheit.\n", fahrenheit);
    }
}
