package Atividades_Simples;

import java.util.Scanner;

public class Atv10 {
    
  /*Sabe-se que: 
      - 1 pé = 12 polegadas;
      - 1 jarda = 3 pés;
      - 1 milha = 1.760 jardas. 
    
    Faça um programa que receba uma medida em pés e faça as conversões a seguir, mostrando os resultados em
    pés, polagadas, jardas e milhas, respectivamente.*/
    
    public void mostraAtv10(){
        Scanner leia = new Scanner(System.in);
        
        double pes, polegadas, jardas, milhas;
        
	System.out.println ("\nPrograma que recebe uma medida em pés e a converte para polegadas, jardas e milhas.\n");
        
        System.out.println ("Digite a medida em pés:");
        pes = leia.nextDouble();
        
        polegadas = pes * 12;
        jardas = pes / 3;
        milhas = jardas /1760;

	System.out.printf ("Essa medida é igual a %.2f pés, %.2f polegadas, %.2f jardas e %.2f milhas.\n", pes, polegadas, jardas, milhas);

    }

}
