public class Masculino extends Jugador {
    protected int FuerzaDesplazamiento;
    protected int VelocidadDesplazamiento;

    public Masculino(String nombre, int habilidadLvl, int suerte, boolean derrota, int fd, int vd) {
        super(nombre, habilidadLvl, suerte, derrota);
        FuerzaDesplazamiento = fd;
        VelocidadDesplazamiento = vd;
    }

    public int getFuerzaDesplazamiento() {
        return FuerzaDesplazamiento;
    }

    /**
     * @param fuerzaDesplazamiento the fuerzaDesplazamiento to set
     */
    public void setFuerzaDesplazamiento(int fuerzaDesplazamiento) {
        FuerzaDesplazamiento = fuerzaDesplazamiento;
    }

    public int getVelocidadDesplazamiento() {
        return VelocidadDesplazamiento;
    }

    public void setVelocidadDesplazamiento(int vd) {
        VelocidadDesplazamiento = vd;
    }

    public static void Ganadores(Jugador[] array, int torneo) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].Derrota == false) {
                System.out.println("Ganador");
                System.out.println(array[i].toString());
            }
        }
    }

    public static void Recorrido(Masculino[] array, int index) {
        if (index != array.length) {
            System.out.println(array[index].toString());
            Recorrido(array, index + 1);
        }
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return " Nombre: " + Nombre + "\n Derrota: " + Derrota + "\n Habilidad: " + HabilidadLvl
                + "\n Velocidad de desplazamiento: " + VelocidadDesplazamiento +
                "\n Fuerza de desplazamiento: " + FuerzaDesplazamiento + "\n";
    }

}
