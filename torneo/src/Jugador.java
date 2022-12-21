public abstract class Jugador {
    protected String Nombre;
    protected int HabilidadLvl;
    protected int Suerte;
    protected boolean Derrota;

    public Jugador(String nombre, int habilidadLvl, int suerte, boolean derrota) {
        Nombre = nombre;
        HabilidadLvl = habilidadLvl;
        Suerte = suerte;
        Derrota = derrota;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    /**
     * @return the habilidadLvl
     */
    public int getHabilidadLvl() {
        return HabilidadLvl;
    }

    /**
     * @param habilidadLvl the habilidadLvl to set
     */
    public void setHabilidadLvl(int habilidadLvl) {
        HabilidadLvl = habilidadLvl;
    }

    /**
     * @return the suerte
     */
    public int getSuerte() {
        return Suerte;
    }

    /**
     * @param suerte the suerte to set
     */
    public void setSuerte(int suerte) {
        Suerte = suerte;
    }

    /**
     * @return the derrota to get
     */
    public boolean getDerrota() {
        return Derrota;
    }

    /**
     * @param derrota the derrota to set
     */
    public void setDerrota(boolean derrota) {
        Derrota = derrota;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return " Nombre: " + Nombre + "\n Derrota: " + Derrota;
    }
}