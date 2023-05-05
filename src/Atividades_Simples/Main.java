package Atividades_Simples;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){
	
        Scanner leia = new Scanner(System.in);
        
        int escolha;      
        
	System.out.println ("Digite a atividade que deseja realizar:");
	escolha = leia.nextInt();

        switch (escolha) {
            case 1:
                Atv1 atv1 = new Atv1();
                atv1.mostraAtv1();
            break;
            case 2:
                Atv2 atv2 = new Atv2();
                atv2.mostraAtv2();
            break;
            case 3:
                Atv3 atv3 = new Atv3();
                atv3.mostraAtv3();
            break;
            case 4:
                Atv4 atv4 = new Atv4();
                atv4.mostraAtv4();
            break;
            case 5:
                Atv5 atv5 = new Atv5();
                atv5.mostraAtv5();
            break;
            case 6:
                Atv6 atv6 = new Atv6();
                atv6.mostraAtv6();
            break;
            case 7:
                Atv7 atv7 = new Atv7();
                atv7.mostraAtv7();
            break;
            case 8:
                Atv8 atv8 = new Atv8();
                atv8.mostraAtv8();
            break;
            case 9:
                Atv9 atv9 = new Atv9();
                atv9.mostraAtv9();
            break;
            case 10:
                Atv10 atv10 = new Atv10();
                atv10.mostraAtv10();
            break;
            case 11:
                Atv11 atv11 = new Atv11();
                atv11.mostraAtv11();
            break;
            case 12:
                Atv12 atv12 = new Atv12();
                atv12.mostraAtv12();
            break;
            case 13:
                Atv13 atv13 = new Atv13();
                atv13.mostraAtv13();
            break;
            case 14:
                Atv14 atv14 = new Atv14();
                atv14.mostraAtv14();
            break;
            case 15:
                Atv15 atv15 = new Atv15();
                atv15.mostraAtv15();
            break;
            case 16:
                Atv16 atv16 = new Atv16();
                atv16.mostraAtv16();
            break;
            case 17:
                Atv17 atv17 = new Atv17();
                atv17.mostraAtv17();
            break;
            case 18:
                Atv18 atv18 = new Atv18();
                atv18.mostraAtv18();
            break;
            case 19:
                Atv19 atv19 = new Atv19();
                atv19.mostraAtv19();
            break;
            case 20:
                Atv20 atv20 = new Atv20();
                atv20.mostraAtv20();
            break;
            case 21:
                Atv21 atv21 = new Atv21();
                atv21.mostraAtv21();
            break;
            case 22:
                Atv22 atv22 = new Atv22();
                atv22.mostraAtv22();
            break;
            case 23:
                Atv23 atv23 = new Atv23();
                atv23.mostraAtv23();
            break;
            case 24:
                Atv24 atv24 = new Atv24();
                atv24.mostraAtv24();
            break;
            case 25:
                Atv25 atv25 = new Atv25();
                atv25.mostraAtv25();
            break;
            case 26:
                Atv26 atv26 = new Atv26();
                atv26.mostraAtv26();
            break;
        }
    }
}
