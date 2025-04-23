package slide02.exercicio;

public class Fibonacci {
    public static void main(String[] args) {
        cVarCompartilhada varCompartilhada = new cVarCompartilhada();
        cSolucaoPeterson solucaoPeterson = new cSolucaoPeterson();

        cProcesso processo0 = new cProcesso(varCompartilhada, 0, solucaoPeterson);
        cProcesso processo1 = new cProcesso(varCompartilhada, 0, solucaoPeterson);

        processo0.start();
        processo1.start();
    }
}
