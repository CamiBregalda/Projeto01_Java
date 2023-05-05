package Atividades_Simples;

import java.util.Scanner;

public class Atv12 {
    
/*Faça um programa que receba o número de horas trabalhadas e o valor do salário mínimo, calcule e mostre o salário a receber seguindo estas regras: 
  a) a hora trabalhada vale um décimo do salário mínimo; 
  b) o salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da hora trabalhada; 
  c) o imposto equivale a 3% do salário bruto; 
  d) o salário a receber equivale ao salário bruto menos o imposto.*/
    
    public void mostraAtv12(){
        
        Scanner leia = new Scanner(System.in);
        
        double horas, sal, valorHora, salBruto, imposto, salReceber;
        
	System.out.println ("\nPrograma que recebe o número de horas trabalhadas de um funcionário e mostra o salário a receber.\n");
        
        System.out.println ("Digite o número de horas trabalhadas:");
        horas = leia.nextDouble();

	System.out.println ("Digite o valor do salário mínimo:");
        sal = leia.nextDouble();

        valorHora = sal * 0.1;
        salBruto = horas * valorHora;
        imposto = salBruto * 0.03;
     	salReceber  = salBruto - imposto;
        
	System.out.println (imposto);
	System.out.printf ("O valor do salário a receber é de R$%.2f.", salReceber);

    }
}
