package org.Minecraft;

import java.util.Scanner;
import org.Minecraft.mobs.enderman.Enderman;
import org.Minecraft.mobs.oveja.Oveja;
import org.Minecraft.mobs.zombie.Zombie;
import org.Minecraft.personaje.Personaje;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido usuario al juego");
        String mensaje = "";
        int arma;
        int armadura;
        int fuerza = 0;
        int defensa = 0;
        int numeroAleatorio = (int) (Math.random() * 3 + 0);

        Personaje personaje = new Personaje(defensa, fuerza);
        System.out.println("Que armas desea utilizar estan son las opciones");
        System.out.println("1: Ninguna, que vas a tener 1 de fuerza");
        System.out.println("2: Espada madera, que vas a tener 2 de fuerza");
        System.out.println("3: Espada de hierro, que vas a tener 3 de fuerza");
        System.out.println("4: Espada de diamante, que vas a tener 5 de fuerza");
        arma = scanner.nextInt();

        switch (arma) {
            case 1:
                personaje.setFuerza(1);
                break;
            case 2:
                personaje.setFuerza(2);
                break;
            case 3:
                personaje.setFuerza(3);
                break;
            case 4:
                personaje.setFuerza(5);
                break;
        }

        System.out.println("Ahora que armadura desea utilizar estas son las opciones");
        System.out.println("1' Ninguna, que vas a tener 0 de armadura");
        System.out.println("2' De cuero, que vas a tener 1 de armadura");
        System.out.println("3' De hierro, que vas a tener 2 de armadura");
        System.out.println("4' Ninguna, que vas a tener 3 de armadura");
        armadura = scanner.nextInt();

        switch (armadura) {
            case 1:
                personaje.setDefensa(0);
                break;
            case 2:
                personaje.setDefensa(1);
                break;
            case 3:
                personaje.setDefensa(2);
                break;
            case 4:
                personaje.setDefensa(3);
                break;
        }

        Enderman enderman = new Enderman();
        Zombie zombie = new Zombie();
        Oveja oveja = new Oveja();
        int contandorEnderman = 0;
        int contandorZombie = 0;
        int contandorOveja = 0;

        switch (numeroAleatorio) {
            case 0:
                System.out.println("Los luchadores son el personaje y el enderman");
                do {
                    enderman.recibirDanio(personaje.atacar());
                    int numeroAleatorioDeAtaque = (int) (Math.random() * 2);

                    if (numeroAleatorioDeAtaque == 0) {
                        personaje.recibirDanio(enderman.atacar());
                    } else {
                        enderman.moverse();
                    }
                    contandorEnderman++;
                } while (personaje.getSalud() >= 0 && enderman.getSalud() >= 0);
                if (personaje.getSalud() >= 0) {
                    mensaje = "el ganador es el personaje";
                } else {
                    mensaje = "el enderman es el ganador";
                }
                System.out.println("Han pasado " + contandorEnderman + " y  " + mensaje);
                break;
            case 1:
                System.out.println("Los luchadores son el personaje y el zombie");
                do {
                    zombie.recibirDanio(personaje.atacar());
                    int numeroAleatorioDeAtaque = (int) (Math.random() * 2);

                    if (numeroAleatorioDeAtaque == 0) {
                        personaje.recibirDanio(zombie.atacar());
                    } else {
                        zombie.moverse();
                    }
                    contandorZombie++;
                } while (personaje.getSalud() >= 0 && zombie.getSalud() >= 0);
                if (personaje.getSalud() >= 0) {
                    mensaje = "el ganador es el personaje";
                } else {
                    mensaje = "el zombie es el ganador";
                }
                System.out.println("Han pasado " + contandorZombie + " y el " + mensaje);
                break;
            case 2:
                System.out.println("Los luchadores son el personaje y el oveja");
                do {
                    oveja.recibirDanio(personaje.atacar());
                    oveja.moverse();
                    contandorOveja++;
                } while (oveja.getSalud() >= 0);
                if (personaje.getSalud() >= 0) {
                    mensaje = "El ganador es el personaje";
                }
                System.out.println("Han pasado " + contandorOveja + " y el " + mensaje);
                break;
        }
        scanner.close();
    }
}
