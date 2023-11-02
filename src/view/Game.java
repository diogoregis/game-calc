package view;

import model.Calc;

import java.util.Scanner;

public class Game {

    static Scanner input = new Scanner(System.in);
    static int pontos = 0;
    static Calc calc;

    public static void run() {
        head();
        play();
    }

    public static void play() {

        System.out.println("Digite o nivel de dificuldade: [1] Facinho [2] Medio [3] Dificil [4] Very Hard");
        calc = new Calc(input.nextInt());

        System.out.println("Responda essa questão: ");
        if (calc.getOperacao() == 0) {
            System.out.println("---> " + calc.getValor01() + " + " + calc.getValor02() + " ? ");
            if (calc.somar(input.nextInt())) {
                pontos++;
                System.out.println("Vocês tem " + pontos + " pontos(s)");
            }
        } else if (calc.getOperacao() == 1) {
            System.out.println("---> " + calc.getValor01() + " - " + calc.getValor02() + " ? ");
            if (calc.subtrair(input.nextInt())) {
                pontos++;
                System.out.println("Vocês tem " + pontos + " pontos(s)");

            }
        }else if (calc.getOperacao() == 2) {
                System.out.println("---> " + calc.getValor01() + " X " + calc.getValor02() + " ? ");
                if (calc.multiplicar(input.nextInt())) {
                    pontos++;
                    System.out.println("Vocês tem " + pontos + " pontos(s)");
                }
        } else {
                System.out.println("Operação desconhecida, digite uma opção valida.");
            }

        System.out.println("Continuar jogando ? [ 1 ] Sim [ 2 ] Não");
        int continuar = input.nextInt();

        if(continuar == 1){
            play();
        } else {
            System.out.println("Sua pontuação final: " + pontos + " ponto(s).");
            System.exit(0);
        }

    }

    public static void head(){
        System.out.println("----------------------------");
        System.out.println("gameCalc");
        System.out.println("                       0.03v");
        System.out.println("----------------------------");
    }

}
