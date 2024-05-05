package Filas.FilaVetor;

public interface Fila <T>{

    void inserir(T valor);

    boolean estaVazia();

    T peak();

    T retirar();

}
