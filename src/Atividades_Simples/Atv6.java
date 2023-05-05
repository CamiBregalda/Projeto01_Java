
package Atividades_Simples;

import java.util.Scanner;

public class Atv6 {
    
    /*Um funcionário recebe um salário fixo mais 4% de comissão sobre as vendas (4% do valor das vendas efetuadas pelo funcionário). 
    Faça um programa que receba o salário fixo do funcionário e o valor de suas vendas, calcule e mostre a comissão e seu salário final.*/
    
    public void mostraAtv6(){
        Scanner leia = new Scanner(System.in);

        double sal, comissao, vendas, novo;

	System.out.println ("\nPrograma que recebe o salário de um funciionário e adiciona o valor de comissão de suas vendas(4%).\n");
        
	System.out.println ("Digite o salário do funcionário:");
        sal = leia.nextDouble();
        
        System.out.println ("Digite o valor das vendas do funcionário:");
        vendas = leia.nextDouble();

        comissao = vendas * 0.04;
        novo = sal + comissao;

	System.out.printf ("O funcionário irá receber R$%.2f de salário, sendo que desses, R$%.2f provém de comissão.\n", novo, comissao);
    }
}
