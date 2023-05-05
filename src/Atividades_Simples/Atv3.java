
package Atividades_Simples;

import java.util.Scanner;

public class Atv3 {
    
    /*Faça um programa que receba três notas de um estudante, calcule e mostre a média aritmética entre elas.*/
    
    public void mostraAtv3(){
        Scanner leia = new Scanner(System.in);

        double N1, N2, N3, media;      

        System.out.println("\nPrograma que lê três notas de um estudante e mostra sua média.\n");
        
        System.out.println ("Digite a primeira nota:");
        N1 = leia.nextDouble();

        System.out.println ("Digite a segunda nota:");
        N2 = leia.nextDouble();

        System.out.println ("Digite a terceira nota:");
        N3 = leia.nextDouble();

        media = (N1 + N2 + N3) / 3;

        System.out.printf ("A média do aluno é igual a %.2f pontos.\n", media);
    }
}
