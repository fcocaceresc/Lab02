package view;

import controller.JuegoDados;

import java.util.Scanner;

public class JuegoDadosConsola {
    JuegoDados juegoDados = new JuegoDados();
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
        System.out.println("1. Lanzar dado");
        System.out.println("2. Salir");
    }

    public boolean ejecutarOpcion(String opcion) {
        switch (opcion) {
            case "1":
                jugar();
                return true;
            case "2":
                return salir();
            default:
                System.out.println("Opción inválida");
                return true;
        }
    }

    public void jugar() {
        int resultado = juegoDados.obtenerResultado();
        System.out.println("Resultado: " + resultado);
        if (resultado == 7) {
            System.out.println("Ganaste");
        } else {
            System.out.println("Perdiste");
        }
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
