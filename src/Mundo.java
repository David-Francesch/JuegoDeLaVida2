import java.lang.reflect.Array;

public class Mundo {
    Vida tablero[][] = new Vida[2][2];
    Vida copiatemp[][];

    public Mundo() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = new Vida();
            }
        }
    }

    public Vida[][] getTablero() {
        return tablero;
    }

    public void MostrarMundo() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(tablero[i][j].getEstado() + " ");
            }
            System.out.println();
        }
    }

    // col , row : representing the cell you want to find neighbors to
    public int ContarVecinos(int x, int y) {
        
        int numVecinos = 0;
        // find all serouding cell by adding +/- 1 to col and row
        for (int colNum = y - 1; colNum <= (y + 1); colNum += 1) {
            // numVecinos = 0;
            for (int rowNum = x - 1; rowNum <= (x + 1); rowNum += 1) {
                
                // if not the center cell
                if (!((colNum == y) && (rowNum == x))) {

                    // make sure it is within grid
                    if (withinGrid(colNum, rowNum)) {
                        int vida = tablero[x][y].getEstado();
                        System.out.println(vida);
                        System.out.println("Vecino de " + y + " " + x + " - " + colNum + " " + rowNum + " Value: " + vida);
                        if (vida == 1) {
                            numVecinos += vida;
                            // return numVecinos;
                            // return vida;
                        }
                    }
                }
            }
        }
        return numVecinos;
        
    }

    // define if cell represented by colNum, rowNum is inside grid
    // function used by neighbours()
    public boolean withinGrid(int colNum, int rowNum) {

        if ((colNum < 0) || (rowNum < 0)) {
            return false; // false if row or col are negative
        }
        if ((colNum >= tablero.length -1) || (rowNum >= tablero.length -1)) {
            return false; // false if row or col are > 75
        }
        return true;
    }

    // Ineficiente, no funciona

    // if (x == 0 && y == 0) {
    // if (tablero[x+1][y].getEstado() == 1) {
    // vecinos++;
    // }
    // if (tablero[x+1][y+1].getEstado() == 1) {
    // vecinos++;
    // }
    // if (tablero[x][y+1].getEstado() == 1) {
    // vecinos++;
    // }
    // }else if (x == tablero.length - 1 && y == 0) {
    // if (tablero[x-1][y].getEstado() == 1) {
    // vecinos++;
    // }
    // if (tablero[x-1][y+1].getEstado() == 1) {
    // vecinos++;
    // }
    // if (tablero[x][y+1].getEstado() == 1) {
    // vecinos++;
    // }
    // }else if (y == tablero.length - 1 && y == 0) {
    // if (tablero[x][y-1].getEstado() == 1) {
    // vecinos++;
    // }
    // if (tablero[x+1][y-1].getEstado() == 1) {
    // vecinos++;
    // }
    // if (tablero[x+1][y].getEstado() == 1) {
    // vecinos++;
    // }
    // }else if (x == tablero.length - 1 && y == tablero.length - 1) {
    // if (tablero[x-1][y].getEstado() == 1) {
    // vecinos++;
    // }
    // if (tablero[x-1][y-1].getEstado() == 1) {
    // vecinos++;
    // }
    // if (tablero[x][y-1].getEstado() == 1) {
    // vecinos++;
    // }
    // }

    // if (x == 0 && y > 0 && y < tablero.length - 1) {
    // if (tablero[x][y-1].getEstado() == 1) {
    // vecinos++;
    // }
    // if (tablero[x+1][y-1].getEstado() == 1) {
    // vecinos++;
    // }
    // if (tablero[x+1][y].getEstado() == 1) {
    // vecinos++;
    // }
    // if (tablero[x+1][y+1].getEstado() == 1) {
    // vecinos++;
    // }
    // if (tablero[x][y+1].getEstado() == 1) {
    // vecinos++;
    // }
    // }else if (y == 0 && x > 0 && x < tablero.length - 1) {
    // if (tablero[x-1][y].getEstado() == 1) {
    // vecinos++;
    // }
    // if (tablero[x-1][y+1].getEstado() == 1) {
    // vecinos++;
    // }
    // if (tablero[x][y+1].getEstado() == 1) {
    // vecinos++;
    // }
    // if (tablero[x+1][y+1].getEstado() == 1) {
    // vecinos++;
    // }
    // if (tablero[x+1][y].getEstado() == 1) {
    // vecinos++;
    // }
    // }else if (x == tablero.length - 1 && y > 0 && y < tablero.length - 1) {
    // if (tablero[x][y-1].getEstado() == 1) {
    // vecinos++;
    // }
    // if (tablero[x-1][y-1].getEstado() == 1) {
    // vecinos++;
    // }
    // if (tablero[x-1][y].getEstado() == 1) {
    // vecinos++;
    // }
    // if (tablero[x-1][y+1].getEstado() == 1) {
    // vecinos++;
    // }
    // if (tablero[x][y+1].getEstado() == 1) {
    // vecinos++;
    // }
    // }else if (y == tablero.length - 1 && x > 0 && x < tablero.length - 1) {
    // if (tablero[x-1][y].getEstado() == 1) {
    // vecinos++;
    // }
    // if (tablero[x-1][y-1].getEstado() == 1) {
    // vecinos++;
    // }
    // if (tablero[x][y-1].getEstado() == 1) {
    // vecinos++;
    // }
    // if (tablero[x+1][y-1].getEstado() == 1) {
    // vecinos++;
    // }
    // if (tablero[x+1][y].getEstado() == 1) {
    // vecinos++;
    // }
    // }else{
    // if (tablero[x-1][y-1].getEstado() == 1) {
    // vecinos++;
    // }
    // if (tablero[x][y-1].getEstado() == 1) {
    // vecinos++;
    // }
    // if (tablero[x+1][y-1].getEstado() == 1) {
    // vecinos++;
    // }
    // if (tablero[x+1][y].getEstado() == 1) {
    // vecinos++;
    // }
    // if (tablero[x+1][y+1].getEstado() == 1) {
    // vecinos++;
    // }
    // if (tablero[x][y+1].getEstado() == 1) {
    // vecinos++;
    // }
    // if (tablero[x-1][y+1].getEstado() == 1) {
    // vecinos++;
    // }
    // if (tablero[x-1][y].getEstado() == 1) {
    // vecinos++;
    // }
    // }

}
