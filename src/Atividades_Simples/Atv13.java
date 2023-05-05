package Atividades_Simples;

import java.util.Scanner;

/*O custo ao consumidor de um carro novo é a soma do preço de fábrica com o percentual de lucro do distribuidor e dos impostos aplicados ao preço de fábrica. 
  Faça um programa que receba o preço de fábrica de um veículo, o percentual de lucro do distribuidor e o percentual de impostos, calcule e mostre: 
  a) o valor correspondente ao lucro do distribuidor; 
  b) o valor correspondente aos impostos; 
  c) o preço final do produto.*/

public class Atv13 {
    
    public void mostraAtv13(){
        Scanner leia = new Scanner(System.in);

        double precoFabrica, percLucroDistr, lucroDistr, percImpostos, impostos, precoFinal;

	System.out.println ("\nPrograma que calcula o valor final de um produto.\n");
        
        System.out.println ("Digite o preço de fábrica do produto:");
        precoFabrica = leia.nextDouble();

        System.out.println ("Digite o percentual de lucro do distribuidor:");
        percLucroDistr = leia.nextDouble();

        System.out.println ("Digite o valor percentual dos impostos sobre o produto:");
        percImpostos = leia.nextDouble();

        impostos = (precoFabrica * percImpostos) / 100;
        lucroDistr = (precoFabrica * percLucroDistr) / 100;
        precoFinal = precoFabrica + lucroDistr + impostos;

        System.out.printf ("O valor de lucro do distribuidor é de R$%.2f.\n", lucroDistr);
        System.out.printf ("O valor de dos impostos é de R$%.2f.\n", impostos);
        System.out.printf ("O custo final desse carro é de R$%.2f.\n", precoFinal);
    }
}
