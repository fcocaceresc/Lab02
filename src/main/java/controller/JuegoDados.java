package controller;

import model.Dado;

import java.util.Random;

public class JuegoDados {
    private Dado dado1;
    private Dado dado2;

    public JuegoDados() {
        dado1 = new Dado();
        dado2 = new Dado();
    }

    private void lanzarDado(Dado dado) {
        dado.setCaraSuperior(new Random().nextInt(6) + 1);
    }

    public void lanzarDados() {
        lanzarDado(dado1);
        lanzarDado(dado2);
    }

    public int obtenerResultado() {
        lanzarDados();
        return dado1.getCaraSuperior() + dado2.getCaraSuperior();
    }
}
