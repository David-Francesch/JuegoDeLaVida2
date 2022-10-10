import java.lang.reflect.Array;

public class Mundo {
    Vida tablero[][] = new Vida[8][8]; 
    Vida copiatemp[][];

    public Mundo(){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = new Vida();
            }
        }
    }

    public void MostrarMundo() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(tablero[i][j].getEstado()+" ");
            }
            System.out.println();
        }
    }

}
