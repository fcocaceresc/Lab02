package model;

import model.Dado;

import java.util.Random;

public class Jugador {
    private Dado dado1;

    public Jugador() {
        dado1 = new Dado();
    }
    private void lanzarDado(Dado dado) {
        dado.setCaraSuperior(new Random().nextInt(6) + 1);
    }
    public int lanzamientoJugador(){
    lanzarDado(dado1);
        return dado1.getCaraSuperior();
    }

}
