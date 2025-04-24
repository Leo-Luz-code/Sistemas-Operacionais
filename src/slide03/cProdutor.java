package slide03;

public class cProdutor extends Thread {

    cBuffer buffer;
    int qtdDados;
    cSemaforo posCheia, posVazia;

    public cProdutor(cBuffer buffer, int qtdDados, cSemaforo pc, cSemaforo pv) {
        this.buffer = buffer;
        this.qtdDados = qtdDados;
        this.posCheia = pc;
        this.posVazia = pv;
    }

    public void run() {
        for (int i = 1; i <= qtdDados; i++) {
            posVazia.down(); // espera se o buffer estiver cheio
            buffer.insereItem(i);
            posCheia.up(); // sinaliza que o buffer não está vazio
        }
    }
}