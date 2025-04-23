package slide01.exercicio;

public class cProcesso extends Thread {
    int X;
    cVarCompartilhada varCompartilhada;

    public cProcesso(cVarCompartilhada vc) {
        X = 0;
        varCompartilhada = vc;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {

            X = varCompartilhada.A + varCompartilhada.B;
            varCompartilhada.A = varCompartilhada.B;
            varCompartilhada.B = X;

            System.out.println(X);

        }
    }
}
