package ListaEstaticaAndEncadeada.lista_estatica_generica;

public class ListaEstatica<T> {

    private T[] info;
    private int tamanho;

    public ListaEstatica() {
        info = (T[]) new Object[10];
        tamanho = 0;
    }

    public void inserir(T valor) {
        if (info.length == tamanho) {
            redirecionamento();
        }
        info[tamanho] = valor;
        tamanho++;
    }

    private void redirecionamento() {
        T[] novaInfo = (T[]) new Object[info.length + 10];
        for (int i = 0; i < info.length; i++) {
            novaInfo[i] = info[i];
        }
        info = novaInfo;
    }

    public int buscar(T valor) {
        for (int i = 0; i < tamanho; i++) {
            if (info[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public T buscarElemento(int posicao) {

        if(posicao >= 0 && (posicao < tamanho)){
            return info[posicao];
        }

        throw new IndexOutOfBoundsException();
    }

    public void retirar(T valor) {
        int posicao = buscar(valor);

        if (posicao != -1) {
            for (int i = posicao; i < tamanho; i++) {
                info[i] = info[i + 1];
            }
            tamanho--;
        }
    }

    public void exibir() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(info[i]);
        }
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void liberar() {
        info = (T[]) new Object[10];
        tamanho = 0;
    }

    public String toString() {
        String numero = "";

        for (int i = 0; i < tamanho; i++) {
            numero = numero + info[i] + ",";
        }
        return numero;
    }

    public void inverter() {

        T primeiroelemento;
        T ultimoElemtno;
        int contadorFinal = tamanho - 1;

        for (int i = 0; tamanho / 2 > i; i++) {
            primeiroelemento = info[i];
            ultimoElemtno = info[contadorFinal];

            info[i] = ultimoElemtno;
            info[contadorFinal] = primeiroelemento;

            contadorFinal--;

        }

    }

}

