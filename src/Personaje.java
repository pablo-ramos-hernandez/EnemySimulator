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
        int danioRecibido = ataque - this.defensa;
        salud = danioRecibido - salud;

        System.out.println("El danio recibido ha sido de: " + danioRecibido + " y el personaje tiene: " + salud);
    }
}
