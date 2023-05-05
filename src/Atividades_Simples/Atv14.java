package Atividades_Simples;

import java.util.Scanner;

public class Atv14 {
    
    /*Sabe-se que o quilowatt de energia custa um quinto do salário mínimo. Faça um programa que receba o valor do salário mínimo e a quantidade de quilowatts consumida por uma 
      residência, calcule e mostre: 
      a) o valor de cada quilowatt; 
      b) o valor a ser pago por essa residência; 
      c) o valor a ser pago com desconto de 15%.*/
    
    public void mostraAtv14(){
        Scanner leia = new Scanner(System.in);
        
        double sal, quilowatts, valorQuilowatt, valor, valorDesc, desconto;
        
	System.out.println ("\nPrograma que calcula o valor do quilowatt e o valor a ser pago por uma residência.\n");
        
        System.out.println ("Digite o valor do salário mínimo:");
        sal = leia.nextDouble();    
        
        System.out.println ("Digite a quantidade de quilowatts consumidos pela residência:");
        quilowatts = leia.nextDouble();
        
        valorQuilowatt = sal * 0.2;
        valor = quilowatts * valorQuilowatt;
        desconto = valor * 0.15;
        valorDesc = valor - desconto;
        
        System.out.printf ("O valor de cada quillowatt é de R$%.2f.\n", valorQuilowatt);
	System.out.printf ("O valor a ser pago pela residência é de R$%.2f.\n", valor);
        System.out.printf ("O valor a ser pago pela residência com um descontro de 15%% é de R$%.2f.\n", valorDesc);

    }
}
