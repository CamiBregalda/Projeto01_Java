package Atividades_Simples;

import java.util.Scanner;

public class Atv18 {

    /*Construa um programa que leia três valores numéricos (representados pelas variáveis A, B e C) e faça o cálculo do delta de uma equação de segundo grau, 
      segundo a fórmula de Báskara. O programa deve mostrar quantas raízes reais a equação possui (delta < 0 – mostrar uma mensagem dizendo que a equação não 
      possui raízes reais, delta > 0 – mostrar que possui duas raízes reais, delta = 0 – mostrar que possui uma única raiz real). */
    
    public void mostraAtv18(){
        
        Scanner leia = new Scanner(System.in);
        
        double A, B, C, delta;
        
	System.out.println ("\nPrograma que lê três valores e calcula o delta de uma equação de segundo grau buscando encontrar quantas raízes reais a equação tem.\n");
        
        System.out.println("Digite o primeiro valor:");
        A = leia.nextDouble();
        
        System.out.println("Digite o segundo valor:");
        B = leia.nextDouble();
        
        System.out.println("Digite o terceiro valor:");
        C = leia.nextDouble();
        
        delta = (B * B) - (4 * A * C);
        
        if (delta < 0){
            System.out.println("A equação não possui raízes de valores reais.");
        } else if (delta == 0){
            System.out.println("A equação possui uma única raíz de valor real.");
        } else {
            System.out.println("A equação possui duas raízes de valores reais.");
        }
    }
    
}
