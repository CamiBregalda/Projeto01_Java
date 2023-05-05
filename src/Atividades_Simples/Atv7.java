package Atividades_Simples;

import java.util.Scanner;

public class Atv7 {
    
    /*Faça um programa que receba três notas e seus respectivos pesos, calcule e mostre a média ponderada dessas notas. 
    Para calcular a média ponderada, multiplique cada nota por seus respectivos pesos, some todos os resultados e divida pela soma dos pesos. 
    Por exemplo, se as notas forem 10, 5 e 6, e os pesos 1, 2 e 3, a média final do estudante seria 10 x 1 + 5 x 2+ 3 x 6, que resulta em 10 + 10 + 18 = 38. 
    Esse valor deve ser dividido pela soma dos pesos (6), resultando em 6,3.*/
    
    public void mostraAtv7(){
        Scanner leia = new Scanner(System.in);
        
        double n1, n2, n3, p1, p2, p3, media;
        
	System.out.println ("\nPrograma que recebe três notas e seus respectivos pesos, antes de realizar a média ponderada dos mesmos.\n");
        
        System.out.println ("Digite a primeira nota:");
        n1 = leia.nextDouble();
        
        System.out.println ("Digite a segunda nota:");
        n2 = leia.nextDouble();
        
        System.out.println ("Digite a terceira nota:");
        n3 = leia.nextDouble();
        
        System.out.println ("Digite o peso da primeira nota:");
        p1 = leia.nextDouble();
        
        System.out.println ("Digite o peso da segunda nota:");
        p2 = leia.nextDouble();
        
        System.out.println ("Digite o peso da terceira nota:");
        p3 = leia.nextDouble();
        
        media = (n1 * p1 + n2 * p2 + n3 * p3) / (p1 + p2 + p3);
        
        System.out.printf ("A média ponderada desses valores é %.2f.\n", media);
    }

}
