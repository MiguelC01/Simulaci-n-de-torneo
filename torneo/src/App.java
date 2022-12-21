import java.util.Scanner;

public class App {
    static int j1pts = 0;
    static int j2pts = 0;

    public static void main(String[] args) throws Exception {
        Masculino masculino[] = new Masculino[4];
        Femenino femenino[] = new Femenino[4];
        Suerte trebol = new Suerte();
        int torneoM = masculino.length, torneoF = femenino.length;
        int jugador1 = 0, jugador2 = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Que tipo de torneo es?");
        System.out.println("1. Masculino" + "\n" + "2. Femenino");

        int opcion = sc.nextInt();

        if (opcion == 1) {
            masculino[0] = new Masculino("Miguel", trebol.lanzarDado100(), 0, false,
                    trebol.lanzarDado100(), trebol.lanzarDado100());

            masculino[1] = new Masculino("Juan", trebol.lanzarDado100(), 0, false,
                    trebol.lanzarDado100(), trebol.lanzarDado100());

            masculino[2] = new Masculino("Victor", trebol.lanzarDado100(), 0, false,
                    trebol.lanzarDado100(), trebol.lanzarDado100());

            masculino[3] = new Masculino("Daniel", trebol.lanzarDado100(), 0, false,
                    trebol.lanzarDado100(), trebol.lanzarDado100());
        }

        if (opcion == 2) {
            femenino[0] = new Femenino("Daniela", trebol.lanzarDado100(), 0, false, trebol.lanzarDado());

            femenino[1] = new Femenino("Fernanda", trebol.lanzarDado100(), 0, false, trebol.lanzarDado());

            femenino[2] = new Femenino("Adriana", trebol.lanzarDado100(), 0, false, trebol.lanzarDado());

            femenino[3] = new Femenino("Raquel", trebol.lanzarDado100(), 0, false, trebol.lanzarDado());
        }

        while (torneoM != 1 && opcion == 1) {

            do {
                jugador1 = trebol.Turnos(masculino, masculino.length);
                jugador2 = trebol.Turnos(masculino, masculino.length);
            } while (jugador1 == jugador2);

            j1pts = masculino[jugador1].getHabilidadLvl() + masculino[jugador1].getSuerte()
                    + masculino[jugador1].getVelocidadDesplazamiento()
                    + masculino[jugador1].getFuerzaDesplazamiento();
            j2pts = masculino[jugador2].getHabilidadLvl() + masculino[jugador2].getSuerte()
                    + masculino[jugador2].getVelocidadDesplazamiento()
                    + masculino[jugador2].getFuerzaDesplazamiento();
            System.out.println("j1" + j1pts + "j2" + j2pts);

            // SUERTE DEL JUGADOR EN CADA PARTIDA
            while (masculino[jugador1].getSuerte() != masculino[jugador1].getSuerte()) {
                masculino[jugador1].setSuerte(trebol.lanzarDado());
                masculino[jugador2].setSuerte(trebol.lanzarDado());
            }

            if (j1pts < j2pts &&
                    masculino[jugador1].getDerrota() != true &&
                    masculino[jugador2].getDerrota() != true) {
                masculino[jugador1].setDerrota(true);

            }

            if (j1pts > j2pts &&
                    masculino[jugador1].getDerrota() != true &&
                    masculino[jugador2].getDerrota() != true) {
                masculino[jugador2].setDerrota(true);
            }

            if (j1pts == j2pts) {
                int volado = trebol.lanzarMonedaInt();

                if (volado == 1) {
                    masculino[jugador1].setDerrota(true);
                }
                if (volado == 2) {
                    masculino[jugador2].setDerrota(true);
                }
            }

            torneoM--;
            masculino[jugador1].setSuerte(0);
            masculino[jugador2].setSuerte(0);
            j1pts = 0;
            j2pts = 0;
        }

        while (torneoF != 1 && opcion == 2) {

            do {
                jugador1 = trebol.Turnos(femenino, femenino.length); // Selección de jugadores
                jugador2 = trebol.Turnos(femenino, femenino.length);

            } while (jugador1 == jugador2);

            j1pts = femenino[jugador1].getHabilidadLvl() + femenino[jugador1].getSuerte()
                    + femenino[jugador1].getTiempoReaccion();
            j2pts = femenino[jugador2].getHabilidadLvl() + femenino[jugador2].getSuerte()
                    + femenino[jugador2].getTiempoReaccion();
            System.out.println("j1" + j1pts + "j2" + j2pts);
            // SUERTE DEL JUGADOR EN CADA PARTIDA
            femenino[jugador1].setSuerte(trebol.lanzarDado());
            femenino[jugador2].setSuerte(trebol.lanzarDado());

            if (j1pts < j2pts && femenino[jugador1].getDerrota() != true && femenino[jugador2].getDerrota() != true) {
                femenino[jugador1].setDerrota(true);
            }

            if (j1pts > j2pts && femenino[jugador1].getDerrota() != true && femenino[jugador2].getDerrota() != true) {
                femenino[jugador2].setDerrota(true);
            }

            if (j1pts == j2pts) {
                int volado = trebol.lanzarMonedaInt();

                if (volado == 1) {
                    femenino[jugador1].setDerrota(true);
                }
                if (volado == 2) {
                    femenino[jugador2].setDerrota(true);
                }
            }
            femenino[jugador1].setSuerte(0);
            femenino[jugador2].setSuerte(0);
            j1pts = 0;
            j2pts = 0;
            torneoF--;

        }
        if (opcion == 1) {
            Masculino.Ganadores(masculino, torneoM);
            System.out.println("Estadísticas");
            Masculino.Recorrido(masculino, 0);
        }
        if (opcion == 2) {
            Femenino.Ganadores(femenino, torneoF);
            System.out.println("Estadísticas");
            Femenino.Recorrido(femenino, 0);
        }

    }

}