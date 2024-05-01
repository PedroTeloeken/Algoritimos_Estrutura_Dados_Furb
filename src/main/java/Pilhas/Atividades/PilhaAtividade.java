package Pilhas.Atividades;

public interface PilhaAtividade <T> {

    void push(T info);

    T pop();

    T peek();

    boolean estaVazia();

    void liberar();

}
