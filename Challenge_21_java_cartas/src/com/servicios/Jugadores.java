package com.servicios;

import com.entidades.Carta;

import java.util.ArrayList;

public class Jugadores {
    private ArrayList<String> jugador = new ArrayList<String>();

    public ArrayList<String> getJugador() {
        return jugador;
    }

    public void setJugador(ArrayList<String> jugador) {
        this.jugador = jugador;
    }

    public void jugar() {
        ArrayList<String> nombresJugadores = new ArrayList<String>();
        nombresJugadores.add("Jugador 1");
        nombresJugadores.add("Jugador 2");
        nombresJugadores.add("Jugador 3");

        Juego juego = new Juego(nombresJugadores);

        juego.entregarCartas(5);

        System.out.println("===== CARTAS DE LOS JUGADORES =====\n");

        int totalGeneral = 0;

        for (int i = 0; i < juego.getCartasJugador().size(); i++) {
            System.out.println(nombresJugadores.get(i) + ":");

            ArrayList<Carta> cartasDelJugador = juego.getCartasJugador().get(i);
            int totalJugador = 0;

            for (Carta carta : cartasDelJugador) {
                carta.mostrarInformacion();
                totalJugador += carta.getNumero();
            }

            System.out.println("Total: " + totalJugador);
            System.out.println();

            totalGeneral += totalJugador;
        }

        System.out.println("Total general de todos los jugadores: " + totalGeneral);

        String ganador = determinarGanador(juego.getCartasJugador(), nombresJugadores);
        System.out.println("\n===== GANADOR =====");
        System.out.println("El ganador es: " + ganador);
    }

    public String determinarGanador(ArrayList<ArrayList<Carta>> cartasJugadores, ArrayList<String> nombresJugadores) {
        int mayorPuntaje = 0;
        String ganador = "";

        for (int i = 0; i < cartasJugadores.size(); i++) {
            int totalJugador = 0;

            for (Carta carta : cartasJugadores.get(i)) {
                totalJugador += carta.getNumero();
            }

            if (totalJugador > mayorPuntaje) {
                mayorPuntaje = totalJugador;
                ganador = nombresJugadores.get(i);
            }
        }

        return ganador + " con " + mayorPuntaje + " puntos";
    }
}
