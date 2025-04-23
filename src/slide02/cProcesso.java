package slide02;

public class cProcesso extends Thread {

    int x;
    cVarCompartilhada varCompartilhada;
    int nrProcesso;
    cSolucaoPeterson solucaoPeterson;

    public cProcesso(cVarCompartilhada varCompartilhada, int nrProcesso, cSolucaoPeterson solucaoPeterson) {
        x = 0;
        this.varCompartilhada = varCompartilhada;
        this.nrProcesso = nrProcesso;
        this.solucaoPeterson = solucaoPeterson;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            solucaoPeterson.entraRC(nrProcesso);
            x = varCompartilhada.a;
            x++;
            varCompartilhada.a = x;
            System.out.println(varCompartilhada.a + " ");
            solucaoPeterson.saiRC(nrProcesso);
        }

    }
}