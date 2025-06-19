package model;

import controller.JuegoDados;


public class Jugador {
    private JuegoDados juego1;

    public Jugador() {
        juego1 = new JuegoDados();
    }
    private void Juego(){
        juego1.obtenerResultado();
    }
}
