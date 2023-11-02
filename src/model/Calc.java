package model;

import java.util.Random;

public class Calc {

    private int dificuldade;
    private int operacao, valor01, valor02, resultado;

    public Calc(int dificuldade) {
        this.dificuldade = dificuldade;
        Random random = new Random();

        this.operacao = random.nextInt(3);

        if (dificuldade == 1) {
            this.valor01 = random.nextInt(9);
            this.valor02 = random.nextInt(9);
        } else if (dificuldade == 2) {
            this.valor01 = random.nextInt(99);
            this.valor02 = random.nextInt(99);
        } else if (dificuldade == 3) {
            this.valor01 = random.nextInt(999);
            this.valor02 = random.nextInt(999);
        } else if (dificuldade == 4) {
            this.valor01 = random.nextInt(9999);
            this.valor02 = random.nextInt(9999);
        } else if (dificuldade == 5) {
            this.valor01 = random.nextInt(99999);
            this.valor02 = random.nextInt(99999);
        } else {
            this.valor01 = random.nextInt(666666);
            this.valor02 = random.nextInt(666666);
        }
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public int getOperacao() {
        return operacao;
    }

    public int getValor01() {
        return valor01;
    }

    public int getValor02() {
        return valor02;
    }

    public int getResultado() {
        return resultado;
    }


}
