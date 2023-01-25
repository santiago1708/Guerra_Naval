
package Guerra;

import java.util.Scanner;

public class PrincipalGuerraN {

    public static void main(String[] args) {
          Scanner x = new Scanner(System.in);
        GuerraN tablaj1 = new GuerraN();
        GuerraN tablaj2 = new GuerraN();
        int op, f, c, ba;
        boolean jug = true;

        System.out.println("Bienvenido.");
        System.out.println("---------------------");
        System.out.print("Digite las dimensiones del tablero & Cantidad de barcos: ");
        f = x.nextInt();
        c = x.nextInt();
        ba = x.nextInt();
        tablaj1.llenar(f, c, ba);
        tablaj2.llenar(f, c, ba);
        do {
            System.out.println("---------------------");
            System.out.println("1. Mostrar Tablero");
            System.out.println("---------------------");
            System.out.println("2. Atacar");
            System.out.println("---------------------");
            System.out.println("3. Salir");
            System.out.println("---------------------");
            op = x.nextInt();

            switch (op) {
                case 1:
                    System.out.println(tablaj1.Mostrar());
                    System.out.println();
                    System.out.println(tablaj2.Mostrar());
                    break;
                case 2:
                    do {
                        if (jug == true)System.out.println("Jugador 1: "); 
                        else System.out.println("Jugador 2: ");
                        System.out.print("Indique la coordenada de la columna & la coordenada de la filas donde desea disparar: ");
                        if (jug == true) {
                            tablaj2.atacar(x.nextInt(), x.nextInt());
                            if (tablaj2.acert == false) {
                                System.out.println("Siguiente jugador");
                                System.out.println("---------------------");
                                jug = false;
                            } else if (tablaj2.acert == true && tablaj2.cont != 0){
                                System.out.println("Repita turno");
                                System.out.println("---------------------");
                                jug = true;
                            }
                            if (tablaj2.cont == 0) {
                                System.out.println("Juego Terminado \n¡Ganador jugador 1!");
                                return;
                            }
                        } else {
                            tablaj1.atacar(x.nextInt(), x.nextInt());
                            if (tablaj1.acert == false) {
                                System.out.println("Siguiente jugador");
                                System.out.println("---------------------");
                                jug = true;
                            } else if (tablaj1.acert == true && tablaj1.cont != 0) {
                                System.out.println("Repita turno");
                                System.out.println("---------------------");
                                jug = false;
                            }

                            if (tablaj1.cont == 0) {
                                System.out.println("Juego Terminado \n¡Ganador jugador 2!");
                                return;
                            }
                        }
                    } while (true);
                case 3:
                    if (op == 3) return;
                default:
                    System.out.println("La opcion no existe");
                    break;
            }
        } while (op != 3);
    }
    
}
