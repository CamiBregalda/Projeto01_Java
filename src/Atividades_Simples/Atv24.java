package Atividades_Simples;

import java.util.Scanner;

public class Atv24 {
   
    /*Uma empresa decide dar um aumento de 30% aos funcionários cujo salário é inferior a 5000. Escreva um programa que possa ser utilizado
      para efetuar o cálculo do salário reajustado de um funcionário, a partir do valor do salário informado pelo usuário.*/
    
    public void mostraAtv24(){
        Scanner leia = new Scanner(System.in);
        
        double sal, aumento, novo;
        
        System.out.println("\nPrograma que lê o valor do salário de um funcionário e calcula seu reajuste\n");
        
        System.out.println("Digite o salário do funcionário:");
        sal = leia.nextDouble();
        
        if (sal < 5000){
            aumento = sal * 0.3;
            novo = sal + aumento;
            System.out.printf("O novo salário do funcionário será de R$%.2f.\n", novo);
        } else {
            System.out.printf("O salário do funcionário permanecerá em R$%.2f.\n", sal);
        }
    }
}
