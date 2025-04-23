package slide01;

public class cProcesso extends Thread {

    int x;
    cVarCompartilhada varCompartilhada;

    public cProcesso(cVarCompartilhada vc) {
        x = 0;
        varCompartilhada = vc;
    }

    @Override
    public void run() {
        x = varCompartilhada.a;
        x++;
        varCompartilhada.a = x;
        System.out.println(varCompartilhada.a + " ");
    }
}