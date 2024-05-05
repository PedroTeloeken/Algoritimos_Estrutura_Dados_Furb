package Filas.FilaVetor;

public class FilaVetor<T> implements Fila<T> {

    T[] info;
    int limite;
    int tamanho;
    int inicio;

    public FilaVetor(int limite) {
        info = (T[]) new Object[limite];
        tamanho = 0;
        inicio = 0;
        this.limite = limite;
    }

    @Override
    public void inserir(T valor) {

        if (tamanho == limite) {
            throw new RuntimeException("Fila esta cheia");
        }

        int posicaoInserir = (inicio + tamanho) % limite;
        info[posicaoInserir] = valor;
        tamanho++;

    }

    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public T peak() {
        if (estaVazia()) {
            throw new RuntimeException("Fila esta vazia");
        }

        return info[inicio];
    }

    @Override
    public T retirar() {

        if (estaVazia()) {
            throw new RuntimeException("Fila esta vazia");
        }

        T valor = peak();
        info[inicio] = null;
        inicio = inicio + 1 % limite;

        tamanho--;

        return valor;
    }

    public void liberar() {
        info = (T[]) new Object[limite];
        tamanho = 0;
        inicio = 0;
    }

    public FilaVetor criarFilaConcatenada(FilaVetor fila2) {

        int limite = this.limite + fila2.limite;
        int tamanho3 = tamanho + fila2.tamanho;

        FilaVetor fila3 = new FilaVetor(limite);

        for (int i = 0; i < this.limite; i++) {
            fila3.inserir(info[i]);
        }

        for (int i = 0; i < fila2.limite; i++) {
            fila3.inserir(fila2.info[i]);
        }

        fila3.tamanho = tamanho3;
        return fila3;
    }

    public String toString() {

        String texto = "";

        for (int i = 0; i < this.limite; i++) {
            if(info[i] != null) {
                texto += " " + info[i].toString() + ";";
            }
        }

        return texto;
    }

}
