package Atividades_Simples;

import java.util.Scanner;

public class Atv4 {
    
    /*Faça um programa que receba o preço de um produto, calcule e mostre o novo preço, sabendo-se que este sofreu um desconto de 10%. 
    Por exemplo, se o produto custa R$ 100,00, o novo preço será 100 menos 10% de cem, que é 100 x 10 / 100. Essa conta é igual a 10, ficando o novo preço R$ 90,00.*/
    
    public void mostraAtv4(){
        Scanner leia = new Scanner(System.in);

        double preco, novo, desconto;

        System.out.println("\nPrograma que lê o preço de um produto e calcula seu novo preço após um desconto de 10%.\n");
        
	System.out.println ("Digite o preço do produto:");
        preco = leia.nextDouble();

        desconto = preco * 0.10;
        novo = preco - desconto;

	System.out.printf ("O novo preço do produto é R$%.2f.\n", novo);
      
    }
}

