package Atividades_Simples;

import java.util.Scanner;

public class Atv25 {
    
    /*A nota final de um estudante é calculada a partir de três notas atribuídas, respectivamente, a um trabalho de laboratório (peso 2), a uma avaliação semestral (peso 3) 
      e a um exame final (peso 5). Faça um programa que receba as três notas, calcule e mostre a média ponderada e o conceito.*/
    
    public void mostraAtv25(){
        Scanner leia = new Scanner(System.in);
        
        double N1, N2, N3, media;
        
        System.out.println("\nPrograma que lê três notas de um estudante, seus pesos e calcula a média ponderada do mesmo.\n");
        
        System.out.println("Digite a primeira nota:");
        N1 = leia.nextDouble();
        
        System.out.println("Digite a segunda nota:");
        N2 = leia.nextDouble();
        
        System.out.println("Digite a terceira nota:");
        N3 = leia.nextDouble();
        
        media = (N1 * 2 + N2 * 3 + N3 * 5) / 10;
        
        if (media >= 8){
            System.out.printf("A média do estudante foi %.2f, conseguindo alcançar o conceito A.\n", media);
        } else if (media >= 7 && media < 8){
            System.out.printf("A média do estudante foi %.2f, conseguindo alcançar o conceito B.\n", media);
        } else if (media >= 6 && media < 7){
            System.out.printf("A média do estudante foi %.2f, alcançando o conceito C.\n", media);
        } else if (media >= 5 && media < 6){
            System.out.printf("A média do estudante foi %.2f, alcançando o conceito D.\n", media);
        } else if (media >= 0 && media < 5){
            System.out.printf("A média do estudante foi %.2f, alcançando o conceito E.\n", media);
        }
        
        
    }
}
