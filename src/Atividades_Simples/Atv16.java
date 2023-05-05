package Atividades_Simples;

import java.util.Scanner;

public class Atv16 {
    
    /*Faça um programa que leia dois valores numéricos inteiros e apresente o resultado da diferença do maior valor pelo menor valor. Se os valores forem iguais, 
    o programa deve mostrar zero.*/
    
    public void mostraAtv16(){
        Scanner leia = new Scanner(System.in);
        
        int N1, N2, result;
        
	System.out.println ("\nPrograma que ê dois valores númericos e faz a diferença entre eles, do maior para o menor.\n");
        
        System.out.println("Digite o primeiro número:");
        N1 = leia.nextInt();
        
        System.out.println("Digite o segundo número:");
        N2 = leia.nextInt();
        
        if (N1 > N2){
            result = N1 - N2;
            System.out.printf("O resultado da diferença de %d menos %d é %d\n", N1, N2, result);
        } else if (N2 > N1) {
            result = N2 - N1;
            System.out.printf("O resultado da diferença de %d menos %d é %d\n", N2, N1, result);
        } else {
            System.out.printf ("O resultado da diferença de %d menos %d é 0.\n", N2, N1);
        }
    }
}
