package Pilhas.Exemplos1;

import ListaEstaticaAndEncadeada.lista_encadeada_atividade.ListaEncadeada;

public class PilhaDinamica <T> implements Pilha <T> {

    private ListaEncadeada<T> lista;

    public PilhaDinamica() {
        lista = new ListaEncadeada<T>();
    }

    @Override
    public void push(T valor) {
        lista.inserir(valor);
    }

    @Override
    public T pop() {
        T valor = peek();

        lista.retirar(valor);

        return valor;

    }

    @Override
    public T peek() {
        if (estaVazia()) {
            throw new RuntimeException("Pilha está vazia");
        }
        return lista.getPrimeiro().getInfo();
    }

    @Override
    public boolean estaVazia() {
        return false;
    }

    @Override
    public void liberar() {
        lista.liberar();
    }

}
