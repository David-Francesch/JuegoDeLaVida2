public class App {
    public static void main(String[] args) throws Exception {
        Mundo m1 = new Mundo();
        m1.MostrarMundo();

        int vecinos[][] = new int[8][8];
        for (int i = 0; i < vecinos.length; i++) {
            for (int j = 0; j < vecinos.length; j++) {
                m1.ContarVecinos(i, j);
                // System.out.println(vecinos[i][j]+" ");
            }
            System.out.println();
        }
    }
}
