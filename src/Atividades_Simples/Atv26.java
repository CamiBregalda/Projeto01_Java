package Atividades_Simples;

import java.util.Scanner;

public class Atv26 {
    
    /*Escreva um programa que leia um número inteiro e indique se ele representa um ano bissexto. Um ano bissexto é um inteiro maior do que 1584 
      que seja divisível por 400, ou seja, divisível por 4 e não por 100.*/
    
    public void mostraAtv26(){
        Scanner leia = new Scanner(System.in);
        
        int ano;
        
        System.out.println("\nPrograma que lê o valor de um ano e verifica se ele é bissexto.\n");
        
        System.out.println("Digite o ano desejado:");
        ano = leia.nextInt();
        
        if(ano > 1584 && (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)))
            System.out.println("Ano bissexto!");
	else
            System.out.println("O ano nao eh bissexto.");
    }
}
