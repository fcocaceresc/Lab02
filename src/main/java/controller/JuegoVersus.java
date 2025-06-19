package controller;

import model.Jugador;

public class JuegoVersus {
    private final Jugador jugador1;
    private final Jugador jugador2;
    private final int puntosVictoria;

    public JuegoVersus(int puntosVictoria) {
        this.jugador1 = new Jugador();
        this.jugador2 = new Jugador();
        this.puntosVictoria = puntosVictoria;
    }

    public void jugar() {
        int ronda = 1;

        while (jugador1.getPuntaje() < puntosVictoria && jugador2.getPuntaje() < puntosVictoria) {
            System.out.println("Ronda: " + ronda);
            jugarRonda(ronda++);
            mostrarPuntajes();
        }
        mostrarGanador();
    }

    private void jugarRonda(int ronda) {
        jugarTurno(jugador1, "Jugador 1");
        jugarTurno(jugador2, "Jugador 2");
    }

    private int jugarTurno(Jugador jugador, String nombreJugador) {
        int resultado = jugador.getJuegoDados().obtenerResultado();
        System.out.println("Resultado " + nombreJugador + ": " + resultado);
        if (resultado == 7) {
            jugador.incrementarPuntaje();
            System.out.println(nombreJugador + " gana un punto");
        }
        return resultado;
    }

    private void mostrarPuntajes() {
        System.out.println("Puntaje actual:");
        System.out.println("Jugador 1: " + jugador1.getPuntaje());
        System.out.println("Jugador 2: " + jugador2.getPuntaje());
    }

    private void mostrarGanador() {
        if (jugador1.getPuntaje() == jugador2.getPuntaje()) {
            System.out.println("Empate");
        } else if (jugador1.getPuntaje() > jugador2.getPuntaje()) {
            System.out.println("Jugador 1 gana");
        } else {
            System.out.println("Jugador 2 gana");
        }
    }
}
