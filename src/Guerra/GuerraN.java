
package Guerra;

public class GuerraN {
    public int x, y, cont = 0;
    public int[][] tablero;
    public int barcos;
    public boolean acert;

    public GuerraN() {

    }

    public void llenar(int x, int y, int barcos) {
        this.barcos = barcos;
        this.tablero = new int[x][y];
        while (barcos != cont) {
            int i = (int) (Math.random() * (x));
            int j = (int) (Math.random() * (y));
            if (tablero[i][j] != 1) {
                tablero[i][j] = 1;
                cont++;
            }
        }
    }

    public String Mostrar() {
        String fra = new String();
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }
        return fra;
    }

    public boolean atacar(int filas, int columnas) {
        if ((filas - 1) <= tablero.length && (columnas - 1) <= tablero[0].length) {
            if (tablero[filas][columnas] == 1) {
                tablero[filas][columnas] = 0;
                cont -= 1;
                System.out.println("---------------------");
                System.out.println("¡Disparo exitoso!");
                System.out.println("---------------------");
                acert = true;
            } else {
                System.out.println("---------------------");
                System.out.println("¡Disparo Fallido");
                System.out.println("---------------------");
                acert = false;
            }
        }
        return acert;

    }

     
}

