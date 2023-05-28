
public abstract class MobPacifico extends Mob implements Danio {

    public MobPacifico(int salud) {
        super(salud);
    }

    @Override
    public void recibirDanio(int ataque) {
        int danioRecibido = salud - ataque;
    }
}
