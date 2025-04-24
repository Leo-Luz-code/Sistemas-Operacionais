package slide03;

public class ProdutorConsumidor {

    /////////////////////////////

    static final int TAM_BUFFER = 4;
    static final int QTD_DADOS = 2;

    /////////////////////////////

    public static void main(String[] args) {

        cSemaforo posCheia = new cSemaforo(0);
        cSemaforo posVazia = new cSemaforo(TAM_BUFFER);

        cBuffer buffer = new cBuffer(TAM_BUFFER);
        cProdutor produtor = new cProdutor(buffer, QTD_DADOS, posCheia, posVazia);
        cConsumidor consumidor = new cConsumidor(buffer, QTD_DADOS, posCheia, posVazia);

        produtor.start();
        consumidor.start();
    }

}