package Filas;

public class FilaVetor implements Fila {

    int[] info;
    int limite;
    int tamanho;
    int inicio;

    public FilaVetor(int limite) {
        info = new int[limite];
        tamanho = 0;
        inicio = 0;
        this.limite = limite;
    }

    @Override
    public void inserir(int valor) {

        if (tamanho == limite) {
            throw new RuntimeException("Fila esta cheia");
        }

        int posicaoInserir = (inicio + tamanho) % tamanho;
        info[posicaoInserir] = valor;
        tamanho++;

    }

    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public int peak() {
        if (estaVazia()) {
            throw new RuntimeException("Fila esta vazia");
        }

        return info[inicio];
    }

    @Override
    public int retirar() {
        int valor = peak();

        info[inicio] = 0;

        inicio = inicio + 1 % limite;

        tamanho--;

        return valor;
    }

    public void liberar() {
        info = new int[limite];
        tamanho = 0;
        inicio = 0;
    }

}
