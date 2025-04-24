package slide03;

public class cBuffer {

    //////////////////////////////

    static final int TAM_MAX_BUFFER = 50;

    /////////////////////////////

    int[] buffer = new int[TAM_MAX_BUFFER];

    int posSai, posEnt, tamBuffer;

    public cBuffer(int tb) {

        posSai = 0;
        posEnt = 0;
        tamBuffer = tb;

        for (int i = 0; i < tamBuffer; i++)
            buffer[i] = 0;
    }

    public synchronized void insereItem(int dadoEnt) {

        buffer[posEnt] = dadoEnt;

        System.out.print("produtor insere: " + dadoEnt +
                " - buffer: ");

        for (int i = 0; i < tamBuffer; i++)
            System.out.print(buffer[i] + " ");

        System.out.print("\n");
        posEnt = (posEnt + 1) % tamBuffer;
    }

    public synchronized int removeItem() {

        int dadoSai;
        dadoSai = buffer[posSai];
        buffer[posSai] = 0;
        System.out.print("consumidor remove: " + dadoSai +
                " - buffer: ");

        for (int i = 0; i < tamBuffer; i++)
            System.out.print(buffer[i] + " ");

        System.out.print("\n");
        posSai = (posSai + 1) % tamBuffer;

        return dadoSai;
    }
}
