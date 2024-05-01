package Pilhas.Exemplos1;

public class PilhaEstatica<T> implements Pilha {

    public PilhaEstatica(int limite) {
        info = (T[]) new Object[limite];
        this.limite = limite;
        this.tamanho = 0;
    }

    private int limite;
    private int tamanho;

    private T[] info;

    @Override
    public void push(Object valor) {
        if (tamanho == limite) {
            throw new RuntimeException("Capacidade da pilha esgotada");
        }
        info[tamanho] = (T) valor;
        tamanho++;
    }

    @Override
    public T pop() {
        T valor = peek();

        tamanho--;

        return valor;
    }

    @Override
    public T peek() {
        if (estaVazia()) {
            throw new RuntimeException("Pilha está vazia");
        }
        return (T) info[tamanho - 1];
    }

    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public void liberar() {
        info = (T[]) new Object[limite];
        tamanho = 0;
    }
}
