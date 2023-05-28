public class Oveja extends MobPacifico {

    public Oveja(int salud) {
        super(5);
    }

    @Override
    public void moverse() {
        System.out.println("Se mueve por el campo");
    }

}
