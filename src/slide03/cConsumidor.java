package slide03;

public class cConsumidor extends Thread {

    cBuffer buffer;
    int qtdDados;
    cSemaforo posCheia, posVazia;

    public cConsumidor(cBuffer b, int qd, cSemaforo pc, cSemaforo pv) {
        buffer = b;
        qtdDados = qd;
        posCheia = pc;
        posVazia = pv;
    }

    public void run() {
        for (int i = 1; i <= qtdDados; i++) {
            posCheia.down(); // espera se o buffer estiver vazio
            buffer.removeItem();
            posVazia.up(); // sinaliza que o buffer não está cheio
        }
    }
}