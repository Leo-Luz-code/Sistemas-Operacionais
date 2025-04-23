package slide01.exercicio;

public class fibonacci {
    public static void main(String[] args) {
        cVarCompartilhada varCompartilhada = new cVarCompartilhada();

        cProcesso processo0 = new cProcesso(varCompartilhada);
        cProcesso processo1 = new cProcesso(varCompartilhada);

        processo0.start();
        processo1.start();
    }
}
