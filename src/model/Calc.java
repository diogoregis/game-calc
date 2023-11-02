package model;

public class Calc {

    private int dificuldade;
    private int operacao, valor01, valor02, resultado;

    public Calc(int dificuldade) {
        this.dificuldade = dificuldade;
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
