package Atividades_Simples;

import java.util.Scanner;

public class Atv8 {
    
    /*Faça um programa que calcule e mostre a área de um triângulo. Sabe-se que: Área = (base x altura) / 2. A base e altura devem ser informadas pelo usuário.*/
    
    public void mostraAtv8(){
        Scanner leia = new Scanner(System.in);
        
        double base, altura, area;
        
	System.out.println ("\nPrograma que calcula a área de um triângulo.\n");
        
        System.out.println ("Digite o tamanho da base do triângulo:");
        base = leia.nextDouble();
        
        System.out.println ("Digite o tamanho da altura do triângulo:");
        altura = leia.nextDouble();
        
        area = (base * altura) / 2;

	System.out.printf ("A área desse triângulo é de %.2f.\n", area);

    }
    
}
