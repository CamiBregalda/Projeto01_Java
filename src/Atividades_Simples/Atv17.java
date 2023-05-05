package Atividades_Simples;

import java.util.Scanner;

public class Atv17 {
    
    /*Faça um programa que leia um valor numérico inteiro. O programa deve apresentar a mensagem “O valor está na faixa permitida”, caso o valor
      informado esteja entre 1 e 9. Se o valor estiver fora da faixa, o programa deve apresentar a mensagem “O valor está fora da faixa permitida”.*/
    
    public void mostraAtv17(){
        Scanner leia = new Scanner(System.in);
        
        int N1;
        
        System.out.println("\nPrograma que lê um valor e apresenta se ele está dentro da faixa de 1 a 9.\n");
        
        System.out.println("Digite o número desejado:");
        N1 = leia.nextInt();
        
        if ((N1 >= 1) && (N1 <= 9)){
            System.out.printf("O valor %d está na faixa permitida.\n", N1);
        } else {
            System.out.printf("O valor %d está fora da faixa permitida.\n", N1);
        }
    }
}

