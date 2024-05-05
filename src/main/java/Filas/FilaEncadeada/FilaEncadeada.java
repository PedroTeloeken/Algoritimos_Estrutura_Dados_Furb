package Filas.FilaEncadeada;

import ListaEstaticaAndEncadeada.lista_encadeada_atividade.ListaEncadeada;

public class FilaEncadeada<T> implements IFilaEncadeada<T> {

    private ListaEncadeada<T> lista = new ListaEncadeada<T>();

    @Override
    public void inserir(T valor) {
        lista.inserirNoFinal(valor);
    }

    @Override
    public boolean estaVazia() {
        return lista.estaVazia();
    }

    @Override
    public T peak() {
        if (estaVazia()) {
            throw new RuntimeException("Fila está vazia");
        }

        return lista.getPrimeiro().getInfo();
    }

    @Override
    public T retirar() {
        T value = peak();
        lista.retirar(value);

        return value;
    }

    @Override
    public void liberar() {
        lista = new ListaEncadeada<>();
    }

}
