package Atividades_Simples;

import java.util.Scanner;

public class Atv22 {

    /*Desenvolva um programa que leia três valores numéricos inteiros, identifique e apresente o maior valor informado.*/
    
    public void mostraAtv22(){
        Scanner leia = new Scanner(System.in);
        
        int N1, N2, N3;
        
        System.out.println("\nPrograma que lê três valores numéricos inteiros, identifica e apresenta o maior valor informado.\n");
        
        System.out.println("Digite o primeiro valor:");
        N1 = leia.nextInt();
        
        System.out.println("Digite o segundo valor:");
        N2 = leia.nextInt();
        
        System.out.println("Digite o terceiro valor:");
        N3 = leia.nextInt();
        
        if (N1 > N2 && N1 > N3){
            System.out.printf("O maior valor informado foi o primeiro: %d.\n", N1);
        } else if (N2 > N1 && N2 > N3){
            System.out.printf("O maior valor informado foi o primeiro: %d.\n", N2);
        } else if (N3 > N1 && N3 > N2){
            System.out.printf("O maior valor informado foi o primeiro: %d.\n", N3);
        }
    }
}
