package Atividades_Simples;

import java.util.Scanner;

public class Atv21 {
    
    /*Faça um programa que leia quatro valores numéricos inteiros e mostre os valores que são divisíveis por 2 e 3.*/
    
    public void mostraAtv21(){
        Scanner leia = new Scanner(System.in);
        
        int N1, N2, N3, N4;
        
        System.out.println("\nPrograma que lê quatro valores numéricos inteiros e mostra quais são divisíveis por 2 e 3.\n");
        
        System.out.println("Digite o primeiro número:");
        N1 = leia.nextInt();
        
        System.out.println("Digite o segundo número:");
        N2 = leia.nextInt();
        
        System.out.println("Digite o terceiro número:");
        N3 = leia.nextInt();
        
        System.out.println("Digite o quarto número:");
        N4 = leia.nextInt();
        
        if ((N1 % 2) == 0 && (N1 % 3) == 0){
            System.out.printf("O número %d é divisível por 2 e por 3.\n", N1);
        } else {
            System.out.printf("O número %d não é divisível por 2 e por 3.\n", N1);
        }
        
        if ((N2 % 2) == 0 && (N2 % 3) == 0){
            System.out.printf("O número %d é divisível por 2 e por 3.\n", N2);
        } else {
            System.out.printf("O número %d não é divisível por 2 e por 3.\n", N2);
        }
        
        if ((N3 % 2) == 0 && (N3 % 3) == 0){
            System.out.printf("O número %d é divisível por 2 e por 3.\n", N3);
        } else {
            System.out.printf("O número %d não é divisível por 2 e por 3.\n", N3);
        }
        
        if ((N4 % 2) == 0 && (N4 % 3) == 0){
            System.out.printf("O número %d é divisível por 2 e por 3.\n", N4);
        } else {
            System.out.printf("O número %d não é divisível por 2 e por 3.\n", N4);
        }
    }
}
