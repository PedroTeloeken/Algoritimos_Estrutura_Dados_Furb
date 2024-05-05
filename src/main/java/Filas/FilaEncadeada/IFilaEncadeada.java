package Filas.FilaEncadeada;


public interface IFilaEncadeada <T> {

    void inserir(T valor);

    boolean estaVazia();

    T peak();

    T retirar();

    void liberar();

}
