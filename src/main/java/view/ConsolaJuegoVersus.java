package view;

import controller.JuegoVersus;

import java.util.Scanner;

public class ConsolaJuegoVersus {
    Scanner scanner = new Scanner(System.in);

    public void menu() {
        boolean continuar = true;
        while (continuar) {
            mostrarOpciones();
            String opcion = scanner.nextLine();
            continuar = ejecutarOpcion(opcion);
        }
    }

    public void mostrarOpciones() {
        System.out.println("Versus");
        System.out.println("1. Al primer intento");
        System.out.println("2. Al mejor de 3");
        System.out.println("3. Al mejor de 5");
        System.out.println("4. Salir");
    }

    public boolean ejecutarOpcion(String opcion) {
        switch (opcion) {
            case "1":
                jugar(1);
                return true;
            case "2":
                jugar(3);
                return true;
            case "3":
                jugar(5);
                return true;
            case "4":
                return salir();
            default:
                System.out.println("Opción inválida");
                return true;
        }
    }

    public void jugar(int puntosVictoria) {
        JuegoVersus juegoVersus = new JuegoVersus(puntosVictoria);
        juegoVersus.jugar();
    }

    public boolean salir() {
        System.out.println("¿Está seguro que desea salir? (S/N)");
        String respuesta = scanner.nextLine().trim();
        if (respuesta.equals("S")) {
            System.out.println("Saliendo");
            return false;
        }
        return true;
    }
}
