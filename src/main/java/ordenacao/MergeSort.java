package ordenacao;

public class MergeSort <T extends Comparable<T>> implements OrdenacaoAbstract<T>{

    private T[] info;

    @Override
    public T[] getInfo() {
        return info;
    }

    @Override
    public void setInfo(T[] info) {
        this.info = info;
    }

    @Override
    public void trocar(int a, int b) {
        if (a==b) {
            return;
        }
        T backup;
        backup = info[a];
        info[a] = info[b];
        info[b] = backup;
    }

    @Override
    public void ordenar() {
        mergeSort();
    }

    private void mergeSort() {
        int n = info.length - 1;
        mergeSort(0, n);
    }

    private void mergeSort(int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(inicio, meio);
            mergeSort(meio + 1, fim);
            merge(inicio, fim, meio);
        }
    }

    private void merge(int inicio, int fim, int meio) {
        int tamEsquerda = meio - inicio + 1;
        T[] esquerda = (T[]) new Comparable[tamEsquerda];

        for (int i = 0; i <= tamEsquerda - 1; i++) {
            esquerda[i] = info[inicio+i];
        }

        int tamDireita = fim - meio;
        T[] direita = (T[]) new Comparable[tamDireita];
        for (int i = 0; i <= tamDireita - 1; i++) {
            direita[i] = info[meio + 1 + i];
        }

        int cEsq = 0;
        int cDir = 0;

        int i;
        for (i = inicio; i <= fim; i++) {
            if ((cEsq < tamEsquerda) && (cDir < tamDireita)) {
                if (esquerda[cEsq].compareTo(direita[cDir]) <= 0) {
                    info[i] = esquerda[cEsq];
                    cEsq++;
                } else {
                    info[i] = direita[cDir];
                    cDir++;
                }
            } else {
                break;
            }
        }

        while (cEsq < tamEsquerda) {
            info[i] = esquerda[cEsq];
            cEsq++;
            i++;
        }

        while (cDir < tamDireita) {
            info[i] = direita[cDir];
            cDir++;
            i++;
        }
    }

    public String impressao(){

        String text = "";

        for (T t : info) {
            text += t.toString() + ",";
        }

        return text;
    }

}
