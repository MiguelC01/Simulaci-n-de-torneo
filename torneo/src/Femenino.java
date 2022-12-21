public class Femenino extends Jugador {
    protected int TiempoReaccion;

    public Femenino(String nombre, int habilidadLvl, int suerte, boolean derrota, int tr) {
        super(nombre, habilidadLvl, suerte, derrota);
        TiempoReaccion = tr;
    }

    public int getTiempoReaccion() {
        return TiempoReaccion;
    }

    public void setTiempoReaccion(int tr) {
        TiempoReaccion = tr;
    }

    public static void Recorrido(Femenino[] array, int index) {
        if (index != array.length) {
            System.out.println(array[index].toString());
            Recorrido(array, index + 1);
        }
    }

    public static void Ganadores(Femenino[] array, int torneo) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].Derrota == false) {
                System.out.println("Ganadora");
                System.out.println(array[i].toString());
            }
        }
    }

    @Override
    public String toString() {
        return "\n Nombre: " + Nombre + "\n Derrota: " + Derrota + "\n Habilidad: " + HabilidadLvl
                + "\n Tiempo de reacción: " + TiempoReaccion + "\n";
    }

}
