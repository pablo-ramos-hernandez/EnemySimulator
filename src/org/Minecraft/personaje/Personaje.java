package org.Minecraft.personaje;

import javax.xml.ws.WebServiceClient;

import org.Minecraft.acciones.Combate;

public class Personaje implements Combate {
    private int salud;
    private int defensa;
    private int fuerza;

    public Personaje(int defensa, int fuerza) {
        this.defensa = defensa;
        this.fuerza = fuerza;
        this.salud = 12;
    }

    @Override
    public int atacar() {
        return this.fuerza;
    }

    @Override
    public void recibirDanio(int ataque) {
        int danioRecibido;
        if (ataque > this.defensa) {
            danioRecibido = ataque - this.defensa;
        } else {
            danioRecibido = this.defensa - ataque;
        }
        salud -= danioRecibido;
        System.out.println("El danio recibido ha sido de: " + danioRecibido + " y el personaje tiene: " + salud);
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getSalud() {
        return salud;
    }
}
