package org.Minecraft.mobs.enderman;

import org.Minecraft.mobs.MobHostil;

public class Enderman extends MobHostil {

    public Enderman() {
        super(14);
        this.fuerza = 6;
    }

    @Override
    public void moverse() {
        System.out.println("Se teletransporta detras");
    }
}
