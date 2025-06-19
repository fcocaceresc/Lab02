package controller;

import model.Dado;

public class JuegoDados {
    private Dado dado1;
    private Dado dado2;

    public JuegoDados() {
        dado1 = new Dado();
        dado2 = new Dado();
    }

    public int lanzarDados() {
        dado1.lanzar();
        dado2.lanzar();
        return dado1.getCaraSuperior() + dado2.getCaraSuperior();
    }
}
