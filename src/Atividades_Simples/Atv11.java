package Atividades_Simples;

import java.util.Scanner;

public class Atv11 {
    
    /* Faça um programa que receba o ano de nascimento de uma pessoa e o ano atual, calcule e mostre: 
       a) a idade dessa pessoa em anos; 
       b) a idade dessa pessoa em meses; 
       c) a idade dessa pessoa em dias (considerando que cada ano possui 365 dias); 
       d) a idade dessa pessoa em semanas (cada ano possui 52 semanas). 
*/
    
    public void mostraAtv11(){
        
        Scanner leia = new Scanner(System.in);
        
        int anoNasc, anoAtual, idadeAno, idadeMeses, idadeDias, idadeSemanas;

	System.out.println ("\nPrograma que recebe o ano de nascimento de uma pessoa e o ano atual e realiza diversos cálculos.\n");
        
	System.out.println ("Digite o ano de nascimento da pessoa desejada:");
	anoNasc = leia.nextInt();

        System.out.println ("Digite o ano atual:");
	anoAtual = leia.nextInt();

        idadeAno = anoAtual - anoNasc;
     	idadeMeses = idadeAno * 12;
     	idadeDias = idadeAno * 365;
     	idadeSemanas = idadeAno * 52;

        System.out.printf ("Essa pessoa tem %d anos, %d meses, %d dias e %d semanas.\n", idadeAno, idadeMeses, idadeDias, idadeSemanas);

    }
}
