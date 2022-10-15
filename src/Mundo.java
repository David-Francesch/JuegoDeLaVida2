import java.lang.reflect.Array;

public class Mundo {
    Vida tablero[][] = new Vida[8][8];
    Vida copiatemp[][];

    public Mundo() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = new Vida();
            }
        }
    }

    public void MostrarMundo() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(tablero[i][j].getEstado() + " ");
            }
            System.out.println();
        }
    }

    public int ContarVecinos(int x, int y) {
        int vecinos = 0;

        if (x == 0 && y == 0) {
            if (tablero[x+1][y].getEstado() == 1) {
                vecinos++;
            }
            if (tablero[x+1][y-1].getEstado() == 1) {
                vecinos++;
            }
            if (tablero[x][y+1].getEstado() == 1) {
                vecinos++;
            }
        }else if (x == tablero.length - 1 && y == 0) {
            if (tablero[x-1][y].getEstado() == 1) {
                vecinos++;
            }
            if (tablero[x-1][y-1].getEstado() == 1) {
                vecinos++;
            }
            if (tablero[x][y-1].getEstado() == 1) {
                vecinos++;
            }
        }else if (y == tablero.length - 1 && y == 0) {
            if (tablero[x][y+1].getEstado() == 1) {
                vecinos++;
            }
            if (tablero[x+1][y+1].getEstado() == 1) {
                vecinos++;
            }
            if (tablero[x+1][y].getEstado() == 1) {
                vecinos++;
            }
        }else if (x == tablero.length - 1 && y == tablero.length - 1) {
            if (tablero[x-1][y].getEstado() == 1) {
                vecinos++;
            }
            if (tablero[x-1][y+1].getEstado() == 1) {
                vecinos++;
            }
            if (tablero[x][y+1].getEstado() == 1) {
                vecinos++;
            }
        }

        if (x == 0 && y > 0 && y < tablero.length - 1) {
            if (tablero[x][y+1].getEstado() == 1) {
                vecinos++;
            }
            if (tablero[x+1][y+1].getEstado() == 1) {
                vecinos++;
            }
            if (tablero[x+1][y].getEstado() == 1) {
                vecinos++;
            }
            if (tablero[x+1][y-1].getEstado() == 1) {
                vecinos++;
            }
            if (tablero[x][y-1].getEstado() == 1) {
                vecinos++;
            }
        }else if (y == 0 && x > 0 && x < tablero.length - 1) {
            if (tablero[x-1][y].getEstado() == 1) {
                vecinos++;
            }
            if (tablero[x-1][y-1].getEstado() == 1) {
                vecinos++;
            }
            if (tablero[x][y-1].getEstado() == 1) {
                vecinos++;
            }
            if (tablero[x+1][y-1].getEstado() == 1) {
                vecinos++;
            }
            if (tablero[x+1][y].getEstado() == 1) {
                vecinos++;
            }
        }else if (x == tablero.length - 1 && y > 0 && y < tablero.length - 1) {
            if (tablero[x][y+1].getEstado() == 1) {
                vecinos++;
            }
            if (tablero[x-1][y+1].getEstado() == 1) {
                vecinos++;
            }
            if (tablero[x-1][y].getEstado() == 1) {
                vecinos++;
            }
            if (tablero[x-1][y-1].getEstado() == 1) {
                vecinos++;
            }
            if (tablero[x][y-1].getEstado() == 1) {
                vecinos++;
            }
        }else if (y == tablero.length - 1 && x > 0 && x < tablero.length - 1) {
            if (tablero[x-1][y].getEstado() == 1) {
                vecinos++;
            }
            if (tablero[x-1][y+1].getEstado() == 1) {
                vecinos++;
            }
            if (tablero[x][y+1].getEstado() == 1) {
                vecinos++;
            }
            if (tablero[x+1][y+1].getEstado() == 1) {
                vecinos++;
            }
            if (tablero[x+1][y].getEstado() == 1) {
                vecinos++;
            }
        }else{
            if (tablero[x-1][y+1].getEstado() == 1) {
                vecinos++;
            }
            if (tablero[x][y+1].getEstado() == 1) {
                vecinos++;
            }
            if (tablero[x+1][y+1].getEstado() == 1) {
                vecinos++;
            }
            if (tablero[x+1][y].getEstado() == 1) {
                vecinos++;
            }
            if (tablero[x+1][y-1].getEstado() == 1) {
                vecinos++;
            }
            if (tablero[x][y-1].getEstado() == 1) {
                vecinos++;
            }
            if (tablero[x-1][y-1].getEstado() == 1) {
                vecinos++;
            }
            if (tablero[x-1][y].getEstado() == 1) {
                vecinos++;
            }
        }
        return vecinos;
    }

}
