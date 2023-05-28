public class Zombie extends MobHostil {
    int fuerza;

    public Zombie(int salud, int fuerza) {
        super(12);
        this.fuerza = 4;
    }

    @Override
    public void moverse() {
        System.out.println("Se mueve hacie el personaje");
    }

}