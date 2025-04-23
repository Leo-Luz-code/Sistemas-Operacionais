package slide02.exercicio;

public class cSolucaoPeterson {
    int[] varTrav = new int[2];
    int vez;

    public cSolucaoPeterson() {
        varTrav[0] = 0;
        varTrav[1] = 0;
        vez = 0;
    }

    public void entraRC(int processo) {
        int oOutroProcesso = 1 - processo;
        varTrav[processo] = 1;
        vez = processo;

        while (vez == processo && varTrav[oOutroProcesso] == 1) {
        }
    }

    public void saiRC(int processo) {
        varTrav[processo] = 0;
    }

}