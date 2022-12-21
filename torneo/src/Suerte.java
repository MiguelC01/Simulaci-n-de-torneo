import java.util.Random;

public class Suerte {
    public boolean lanzarMonedaBool() {
        /*
         * El if-else se puede simplificar usando:
         * return randomNumber < 0.5
         */
        double randomNumber = Math.random();
        if (randomNumber < 0.5) {
            return true; // Cara
        } else {
            return false; // Cruz
        }
    }

    public int lanzarMonedaInt() {
        Random moneda = new Random();
        return moneda.nextInt(2) + 1;
    }

    public int lanzarDado() {
        Random random = new Random();
        return random.nextInt(50) + 1;
    }

    public int Turnos(Jugador[] masc, int rand) {
        Random random = new Random();
        do {
            rand = random.nextInt(masc.length);
        } while (masc[rand].Derrota == true);
        return rand;
    }

    public int lanzarDado100() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    public int lanzarDadoAbstracto(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

}