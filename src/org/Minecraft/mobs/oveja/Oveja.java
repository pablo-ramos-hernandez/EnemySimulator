package org.Minecraft.mobs.oveja;

import org.Minecraft.mobs.MobPacifico;

public class Oveja extends MobPacifico {

    public Oveja() {
        super(5);
    }

    @Override
    public void moverse() {
        System.out.println("Se mueve por el campo");
    }

}
