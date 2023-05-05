
package Atividades_Simples;

import java.util.Scanner;

public class Atv5 {
    
    /*Faça um programa que receba o salário base de um funcionário, calcule e mostre o salário a receber, sabendo-se que o funcionário tem gratificação de 5% sobre o salário base 
    (que será acrescentado ao salário) e paga imposto de 7% sobre este salário (o que será descontado do salário).*/
    
    public void mostraAtv5(){
        Scanner leia = new Scanner(System.in);

        double sal, gratificacao, imposto, novoSal;

        System.out.println("\nPrograma que lê o salário base de um funcionário, calcula os impostos sobre ele (7%) e adiciona sua gratificação (5%).\n");
        
	System.out.println ("Digite o salário do funcionário:");
        sal = leia.nextDouble();

        gratificacao = sal * 0.05;
        imposto = sal * 0.07;
        novoSal = sal + gratificacao - imposto;

	System.out.printf ("O funcionário irá receber R$%.2f de salário.\n", novoSal);
      
    }
    
}
