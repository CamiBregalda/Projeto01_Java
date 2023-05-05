package Atividades_Simples;

import java.util.Scanner;

public class Atv19 {
    
    /*Construa um programa que leia três valores para os lados de um triângulo (A, B e C). O programa deve verificar se os lados fornecidos
    formam realmente um triângulo. Em caso positivo, deve mostrar a mensagem “Os lados formam um triângulo” e caso contrário “Os valores
    informados não podem formar um triângulo”. Para que três valores de lados formem um triângulo, cada par de lados somados não pode ser
    menor ou igual ao terceiro lado.*/
    
    public void mostraAtv19(){
        
        Scanner leia = new Scanner(System.in);
        
        Double A, B, C, result;
        
        System.out.println("\nPrograma que lê três valores para os lados de um triângulo e verifica de tais medidas podem relamente formar um triângulo.\n");
        
        System.out.println("Digite o primeiro valor:");
        A = leia.nextDouble();
        
        System.out.println("Digite o segundo valor:");
        B = leia.nextDouble();
        
        System.out.println("Digite o terceiro valor:");
        C = leia.nextDouble();
        
        if (((A + B) > C) && ((A + C) > B) && ((B + C) > A)){
            System.out.println("Os lados formam um triângulo.\n");
        } else {
            System.out.println("Os valores informados não podem formar um triângulo.\n");
        }
    }
}

