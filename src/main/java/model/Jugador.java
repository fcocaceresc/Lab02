package model;

import controller.JuegoDados;

public class Jugador {
    private JuegoDados juegoDados;
    private int puntaje;

    public Jugador() {
        this.juegoDados = new JuegoDados();
        this.puntaje = 0;
    }

    public JuegoDados getJuegoDados() {
        return juegoDados;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public void incrementarPuntaje() {
        this.puntaje++;
    }
}
