public abstract class MobHostil extends Mob implements Combate {
    public MobHostil(int salud) {
        super(salud);
    }

    int fuerza;

    @Override
    public int atacar() {
        return this.fuerza;
    }

    @Override
    public void recibirDanio(int ataque) {
        int danioRecibido = ataque - salud;
        System.out.println("El danio recibido es de: " + danioRecibido + " y la salud es de: " + salud);
    }
}