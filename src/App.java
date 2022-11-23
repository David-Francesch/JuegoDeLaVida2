public class App {
    public static void main(String[] args) throws Exception {
        Mundo m1 = new Mundo();
        
        int vecinos[][] = new int[2][2];
        for (int i = 0; i < vecinos.length; i++) {
            for (int j = 0; j < vecinos.length; j++) {
                vecinos[i][j] = m1.ContarVecinos(i, j);
            }
            System.out.println();
        }
        m1.MostrarMundo();
        System.out.println(
            
        );
        for (int i = 0; i < vecinos.length; i++) {
            for (int j = 0; j < vecinos.length; j++) {
                System.out.print(vecinos[i][j]+" ");
            }
            System.out.println();
        }
        // Mundo mVecinos = m1.ContarVecinos(i, j)
    }
}
