package org.Minecraft.mobs.zombie;

import org.Minecraft.mobs.MobHostil;

public class Zombie extends MobHostil {
    int fuerza;

    public Zombie() {
        super(12);
        this.fuerza = 4;
    }

    @Override
    public void moverse() {
        System.out.println("Se mueve hacie el personaje");
    }

}