package slide01;

public class IncrementaNumero {
    public static void main(String[] args) {
        cVarCompartilhada varCompartilhada = new cVarCompartilhada();

        cProcesso processo1 = new cProcesso(varCompartilhada);
        cProcesso processo2 = new cProcesso(varCompartilhada);

        processo1.start();
        processo2.start();
    }
}
