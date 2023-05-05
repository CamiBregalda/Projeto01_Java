package Atividades_Simples;

import java.util.Scanner;

public class Atv9 {
    
    /*Faça um programa que calcule e mostre a área de um quadrado. Sabe-se que 𝐴 = 𝑙𝑎𝑑𝑜²*/
    
    public void mostraAtv9(){
        Scanner leia = new Scanner(System.in);
        
        double lado, area;
        
	System.out.println ("\nPrograma que calcula a área de um quadrado.\n");
        
        System.out.println ("Digite o tamanho do lado do quadrado:");
        lado = leia.nextDouble();
        
        area = lado * lado;

	System.out.printf ("A área desse quadrado é de %.2f.\n", area);

    }
}
