package ordenacao;

public class BolhaQuickSort<T extends Comparable<T>> implements OrdenacaoAbstract<T> {

    private T[] info;

    @Override
    public T[] getInfo() {
        return this.info;
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
        quickSort(0, getInfo().length-1);
    }


    private void quickSort(int inicio, int fim) {
        if (inicio < fim) {
            // Particiona e identifica o pivo.
            int indicePivo = particionar(inicio, fim);
            quickSort(inicio, indicePivo-1);
            quickSort(indicePivo+1, fim);
        }
    }


    private int particionar(int inicio, int fim) {
        T[] info = getInfo();

        int a = inicio;
        int b = fim+1;

        // identifica o pivo
        T pivo = info[inicio];

        while (true) {
            do {
                // incremente o indice de B enquanto o info[a] for menor que pivo.
                a++;
            } while (a <= fim && info[a].compareTo(pivo)<=0); // info[a] < pivo

            do {
                // decrementa o indice de B enquanto o info[a] for menor que pivo.
                b--;
            } while (b >= inicio && info[b].compareTo(pivo)>0); // info[b] > pivo

            // Se a for maior ou igual a b interrompe o laço.
            if (a >= b) {
                break;
            }

            // Realiza a troca.
            trocar(a, b);

        }

        // Realiza a troca de b com o inicio.
        trocar(b, inicio);

        // Retorna o novo pivo.
        return b;
    }

    public String impressao(){

        String text = "";

        for (T t : info) {
            text += t.toString() + ",";
        }

        return text;
    }

}
