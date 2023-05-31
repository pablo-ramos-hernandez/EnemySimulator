package org.Minecraft.mobs;

import org.Minecraft.acciones.Danio;

public abstract class MobPacifico extends Mob implements Danio {

    public MobPacifico(int salud) {
        super(salud);
    }

    @Override
    public void recibirDanio(int ataque) {
        int danioRecibido = ataque;
        salud -= danioRecibido;
        System.out.println("El danio recibido es de: " + danioRecibido + " y la salud es de " + salud);
    }
}
